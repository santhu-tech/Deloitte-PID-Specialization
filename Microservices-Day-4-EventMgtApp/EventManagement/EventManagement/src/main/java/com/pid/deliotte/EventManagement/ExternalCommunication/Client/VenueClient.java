package com.pid.deliotte.EventManagement.ExternalCommunication.Client;

import com.pid.deliotte.EventManagement.ExternalCommunication.Model.ApiResponse;
import com.pid.deliotte.EventManagement.ExternalCommunication.Model.VenueResponse;
//import com.pid.deliotte.EventManagement.Model.ApiResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(name="VENUE-SERVICE",url="http://localhost:8081/api/venues")
public interface VenueClient {

    //    @GetMapping("/{id}")
//    VenueResponse getVenueById(@PathVariable("id") Long id);

    @GetMapping("/{id}")
    ApiResponse<VenueResponse> getVenueById(@PathVariable("id") Long id);
}


