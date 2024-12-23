/*package com.pid.deliotte.EventManagement.Service;

import com.pid.deliotte.EventManagement.Entity.Category;
import com.pid.deliotte.EventManagement.Entity.Event;
import com.pid.deliotte.EventManagement.Exception.CategoryNotFoundException;
import com.pid.deliotte.EventManagement.ExternalCommunication.Client.VenueClient;
import com.pid.deliotte.EventManagement.ExternalCommunication.Model.VenueResponse;
import com.pid.deliotte.EventManagement.Model.EventRequest;
import com.pid.deliotte.EventManagement.Model.EventResponse;
import com.pid.deliotte.EventManagement.Repository.CategoryRepository;
import com.pid.deliotte.EventManagement.Repository.EventRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;
    private final CategoryRepository categoryRepository;

    private final VenueClient venueClient;
    public EventServiceImpl(EventRepository eventRepository, CategoryRepository categoryRepository, VenueClient venueClient) {
        this.eventRepository = eventRepository;
        this.categoryRepository = categoryRepository;
        this.venueClient = venueClient;
    }
    @Override
    public EventResponse createEvent(EventRequest eventRequest) {

        Category category = categoryRepository.findById(eventRequest.getCategoryId())
                .orElseThrow(() -> new CategoryNotFoundException("Category with ID " + eventRequest.getCategoryId() + " not found"));

        //Fetching venue details via feign client
        VenueResponse venue=venueClient.getVenueById(eventRequest.getVenueId());

        Event event = new Event();
        event.setName(eventRequest.getName());
        event.setDescription(eventRequest.getDescription());
        event.setDate(eventRequest.getDate());
        event.setTime(eventRequest.getTime());
        event.setBudget(eventRequest.getBudget());
        event.setCategory(category);
        event.setVenueId(venue.getId());
        event = eventRepository.save(event);
        return mapToEventResponse(event,venue);
    }

    @Override
    public List<EventResponse> getEventsByCategory(String categoryName) {
        List<Event> events = eventRepository.findByCategoryName(categoryName);

        return events.stream()
                .map(event -> {
                    VenueResponse venue = venueClient.getVenueById(event.getVenueId());
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
                .venueName(venue != null ? venue.getName() : null) // Handle null venue response
                .venueLocation(venue != null ? venue.getLocation() : null) // Handle null venue response
                .venueCapacity(venue != null ? String.valueOf(venue.getCapacity()) : "0") // Handle null venue response
//                .venueName(venue.getName())
//                .venueLocation(venue.getLocation())
//                .venueCapacity(String.valueOf(venue.getCapacity()))
                .build();
    }

//    @Override
//    public List<EventResponse> getEventsByCategory(String categoryName) {
//        List<Event> events = eventRepository.findByCategoryName(categoryName);
//
//        return events.stream()
//                .map(this::mapToEventResponse)
//                .collect(Collectors.toList());
//    }
//    private EventResponse mapToEventResponse(Event event) {
//        return new EventResponse(
//                event.getId(),
//                event.getName(),
//                event.getDescription(),
//                event.getDate(),
//                event.getTime(),
//                event.getBudget(),
//                event.getCategory().getName()
//        );
//    }
}
*/