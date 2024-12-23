package com.pid.deliotte.EventManagement.Controller;

import com.pid.deliotte.EventManagement.Model.ApiResponse;
import com.pid.deliotte.EventManagement.Model.EventRequest;
import com.pid.deliotte.EventManagement.Model.EventResponse;
import com.pid.deliotte.EventManagement.Service.EventService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping  //write
    public ResponseEntity<ApiResponse<EventResponse>> createEvent(@RequestBody EventRequest eventRequest) {
        EventResponse eventResponse = eventService.createEvent(eventRequest);
        return new ResponseEntity<>(new ApiResponse<>(true, "Event created successfully", eventResponse), HttpStatus.CREATED);
    }

    @GetMapping("/category/{categoryName}")  //Read
    public ResponseEntity<ApiResponse<List<EventResponse>>> getEventsByCategory(@PathVariable String categoryName) {
        List<EventResponse> events = eventService.getEventsByCategory(categoryName);
        return new ResponseEntity<>(new ApiResponse<>(true, "Events fetched successfully", events), HttpStatus.OK);
    }

    //get(categoryId)
    //Get()
    //put
    //delete
}