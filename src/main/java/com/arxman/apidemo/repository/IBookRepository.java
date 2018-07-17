package com.arxman.apidemo.repository;

import com.arxman.apidemo.entities.Book;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

public interface IBookRepository extends CrudRepository<Book, Long> {

    Book findByBid(String bid);

//    List<Book> findByTestCaseStatus(TestCaseStatus testCaseStatus);
//
//    @Transactional
//    Integer deleteByTestCaseStatus(TestCaseStatus testCaseStatus);
//
//    @Transactional
//    Integer deleteByUuid(String uuid);

}
