package com.pid.deliotte.EventManagement.ExternalCommunication.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VenueResponse {
    private Long id;
    private String name;
    private String location;
    private int capacity;
    private boolean availability;
}
