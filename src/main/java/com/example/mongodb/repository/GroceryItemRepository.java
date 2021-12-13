package com.example.mongodb.repository;

import com.example.mongodb.models.GroceryItems;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface GroceryItemRepository extends MongoRepository<GroceryItems, String> {

    @Query("{name:'?0'}")
    GroceryItems findGroceryItemsByName(String name);

    @Query(value="{category:'?0'}", fields ="{'name' : 1, 'quantity' : 1}")
    List<GroceryItems> findAll(String category);

    public long count();
}
