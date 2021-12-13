package com.example.mongodb.service;

import com.example.mongodb.models.GroceryItems;
import com.example.mongodb.repository.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroceryItemsService {

    @Autowired
    private GroceryItemRepository groceryItemRepository;

    public void saveData(GroceryItems groceryItems) { groceryItemRepository.save(groceryItems); }
}
