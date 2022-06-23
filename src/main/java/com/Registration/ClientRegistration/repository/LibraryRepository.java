package com.Registration.ClientRegistration.repository;

import com.Registration.ClientRegistration.entity.Library;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LibraryRepository extends JpaRepository<Library, String> {
}
