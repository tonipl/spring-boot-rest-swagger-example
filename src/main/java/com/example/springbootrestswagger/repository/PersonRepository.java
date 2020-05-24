package com.example.springbootrestswagger.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootrestswagger.domain.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
