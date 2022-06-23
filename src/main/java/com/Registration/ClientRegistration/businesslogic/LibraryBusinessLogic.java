package com.Registration.ClientRegistration.businesslogic;


import com.Registration.ClientRegistration.dto.LibraryDto;
import com.Registration.ClientRegistration.entity.Library;
import com.Registration.ClientRegistration.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class LibraryBusinessLogic {


    @Autowired
    LibraryRepository repository;

    public Library createLibrary (LibraryDto libraryDto){

        Library lin = new Library();

        lin.setId(UUID.randomUUID().toString());
        lin.setBookName(libraryDto.getBookName());
        lin.setIsbn(libraryDto.getIsbn());
        lin.setAuthor(libraryDto.getAuthor());
        lin.setAisle(libraryDto.getAisle());


        return repository.save(lin);


    }
    public List<Library> getBooks(){
        return repository.findAll();
    }
}
