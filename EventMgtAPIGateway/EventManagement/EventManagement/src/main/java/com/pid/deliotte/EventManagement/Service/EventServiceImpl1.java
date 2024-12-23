package com.pid.deliotte.EventManagement.Service;


import com.pid.deliotte.EventManagement.Entity.Category;
import com.pid.deliotte.EventManagement.Entity.Event;
import com.pid.deliotte.EventManagement.Exception.CategoryNotFoundException;
import com.pid.deliotte.EventManagement.ExternalCommunication.Client.VenueClient;
import com.pid.deliotte.EventManagement.ExternalCommunication.Model.ApiResponse;
import com.pid.deliotte.EventManagement.ExternalCommunication.Model.VenueResponse;
import com.pid.deliotte.EventManagement.Model.EventRequest;
import com.pid.deliotte.EventManagement.Model.EventResponse;
import com.pid.deliotte.EventManagement.Repository.CategoryRepository;
import com.pid.deliotte.EventManagement.Repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl1 implements EventService {

    private final EventRepository eventRepository;
    private final CategoryRepository categoryRepository;
    private final VenueClient venueClient;

    public EventServiceImpl1(EventRepository eventRepository, CategoryRepository categoryRepository, VenueClient venueClient) {
        this.eventRepository = eventRepository;
        this.categoryRepository = categoryRepository;
        this.venueClient = venueClient;
    }

    @Override
    public EventResponse createEvent(EventRequest eventRequest) {
        // Fetching  category
        Category category = categoryRepository.findById(eventRequest.getCategoryId())
                .orElseThrow(() -> new CategoryNotFoundException("Category with ID " + eventRequest.getCategoryId() + " not found"));

        //Fetching venue details
        ApiResponse<VenueResponse> venueApiResponse = venueClient.getVenueById(eventRequest.getVenueId());
        VenueResponse venue = venueApiResponse.getData();


        Event event = new Event();
        event.setName(eventRequest.getName());
        event.setDescription(eventRequest.getDescription());
        event.setDate(eventRequest.getDate());
        event.setTime(eventRequest.getTime());
        event.setBudget(eventRequest.getBudget());
        event.setCategory(category);
        event.setVenueId(venue.getId());

        event = eventRepository.save(event);

        return mapToEventResponse(event, venue);
    }

    @Override
    public List<EventResponse> getEventsByCategory(String categoryName) {
        List<Event> events = eventRepository.findByCategoryName(categoryName);

        return events.stream()
                .map(event -> {
                    // Fetching venue details for each event using Feign client
                    ApiResponse<VenueResponse> venueApiResponse = venueClient.getVenueById(event.getVenueId());
                    VenueResponse venue = venueApiResponse.getData();
                    return mapToEventResponse(event, venue);
                })
                .collect(Collectors.toList());
    }
    private EventResponse mapToEventResponse(Event event, VenueResponse venue) {
        return EventResponse.builder()
                .id(event.getId())
                .name(event.getName())
                .description(event.getDescription())
                .date(event.getDate())
                .time(event.getTime())
                .budget(event.getBudget())
                .categoryName(event.getCategory().getName())
                //.venueName(venue.getName());
                .venueName(venue != null ? venue.getName() : null)
                .venueLocation(venue != null ? venue.getLocation() : null)
                .venueCapacity(venue != null ? String.valueOf(venue.getCapacity()) : "0")
                .build();
    }
}
