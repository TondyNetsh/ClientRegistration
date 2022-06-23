package com.Registration.ClientRegistration;

import com.Registration.ClientRegistration.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ClientRegistrationApplication  {
    //implements CommandLineRunner

	@Autowired
	LibraryRepository repository;



	public static void main(String[] args) {
		SpringApplication.run(ClientRegistrationApplication.class, args);
	}


//    public void run(String[] args) throws Exception {
//
//        Library lib =  repository.findById("fdsefr343").get();
//        System.out.println(lib.getId());
//        System.out.println(lib.getBook_name());
//        System.out.println(lib.getIsbn());
//
//
//
//        Library en = new Library();
//        en.setAisle(123);
//
//        en.setBook_name("Devops");
//        en.setIsbn("jbm");
//        en.setId("jb21");
//
//        repository.save(en);
//
//    }

//	@Override
//	public void run (String[] args){
//
//		Library lib = repository.findById("fdsefr343").get();
//		System.out.println(lib.getAuthor());
//
//
//
//
//	}



}
