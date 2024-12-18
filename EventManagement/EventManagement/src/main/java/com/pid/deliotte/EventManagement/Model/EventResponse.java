package com.pid.deliotte.EventManagement.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DTO Layer
//Data Transfer objects

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventResponse {
    private Long id;
    private String name;
    private String description;
    private String date;
    private String time;
    private Double budget;
    private String categoryName;
}
