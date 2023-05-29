package com.myproject.repository;

import com.myproject.model.Book;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Integer> {


}
