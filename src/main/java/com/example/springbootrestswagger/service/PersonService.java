package com.example.springbootrestswagger.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.springbootrestswagger.domain.Person;
import com.example.springbootrestswagger.repository.PersonRepository;

@Service
@Transactional
public class PersonService {
    @Autowired
    private PersonRepository repository;

    @Transactional(readOnly = true)
    public Page<Person> findAll(Pageable pageable) {

	return repository.findAll(pageable);
    }

    @Transactional(readOnly = true)
    public Optional<Person> findById(Long id) {

	return repository.findById(id);
    }

    public Person save(Person person) {

	return repository.saveAndFlush(person);
    }
}
