package io.javabrains.moviecatalogservice.controller;

import com.netflix.discovery.converters.Auto;
import io.javabrains.moviecatalogservice.model.*;
import io.javabrains.moviecatalogservice.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class MovieAndUserCatalogController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private CatalogService catalogService;

   


}
