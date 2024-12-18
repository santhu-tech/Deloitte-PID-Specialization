package com.pid.deliotte.EventManagement.Service;

import com.pid.deliotte.EventManagement.Model.EventRequest;
import com.pid.deliotte.EventManagement.Model.EventResponse;

import java.util.List;

public interface EventService {
    EventResponse createEvent(EventRequest eventRequest);

    List<EventResponse> getEventsByCategory(String categoryName);
}
