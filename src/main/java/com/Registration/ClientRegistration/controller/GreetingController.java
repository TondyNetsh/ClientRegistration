package com.Registration.ClientRegistration.controller;


import com.Registration.ClientRegistration.businesslogic.LibraryBusinessLogic;
import com.Registration.ClientRegistration.dto.LibraryDto;
import com.Registration.ClientRegistration.entity.Library;
import com.Registration.ClientRegistration.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {


    @Autowired
    Greeting greeting;

    @Autowired
    LibraryBusinessLogic businessLogic;
    AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name")String name){
             greeting.setId(counter.incrementAndGet());
          greeting.setContent("hey i am learning spring from  " +name);
          return greeting;
    }

    @PostMapping("/create/book")
    public Library CreateBook(@RequestBody LibraryDto libraryDto){
        return businessLogic.createLibrary(libraryDto);
    }
    @GetMapping("/get/books")
    public List<Library> getBooks(){
        return businessLogic.getBooks();
    }


}
