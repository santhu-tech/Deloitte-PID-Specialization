package com.pid.deliotte.EventManagement.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EventRequest {
        private String name;
        private String description;
        private String date;
        private String time;
        private Double budget;
        private Long categoryId;
        private Long venueId;
}
