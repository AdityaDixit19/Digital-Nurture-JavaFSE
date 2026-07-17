package org.library.repo;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public void displayRepository() {
        System.out.println("Book Repository Working");
    }

}