package com.sportworld.swsportservice.controller;

import com.netflix.discovery.DiscoveryClient;
import com.sportworld.swsportservice.entities.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class SwSportServiceController {

    @Value("${messages}")
    private String[] messages;
    @Value("${spring.application.name}")
    private String serviceName;

    @GetMapping("/")
    public Response sportService() {
        return getSportMessage();
    }

    private Response getSportMessage() {
        String msg = messages[new Random().nextInt(messages.length)];
        Response response = new Response(serviceName, msg);
        return response;
    }

}
