package com.example.hanoi_trip.controller;

import com.example.hanoi_trip.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    private PlaceService place_service;

    @GetMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("title", "Welcome to Ha Noi Trip");
        model.addAttribute("places", place_service.getAllPlaces());
        return "home";
    }
}
