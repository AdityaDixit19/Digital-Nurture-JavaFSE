package org.library.service;

import org.library.repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;

    public void displayService() {

        System.out.println("Book Service Method");

        repository.displayRepository();
    }
}
