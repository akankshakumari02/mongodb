package com.example.mongodb.controller;

import com.example.mongodb.service.GroceryItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/project")
public class GroceryItemsController {

    @Autowired
    private GroceryItemsService groceryItemsService;


}
