package com.pid.deliotte.EventManagement.Model;

import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO Layer
//Data Transfer objects

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EventResponse {
    private Long id;
    private String name;
    private String description;
    private String date;
    private String time;
    private Double budget;
    private String categoryName;
    private String venueName;
    private String venueLocation;
    private String venueCapacity;

}
