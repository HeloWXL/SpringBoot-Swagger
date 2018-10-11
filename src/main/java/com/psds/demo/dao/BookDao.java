package com.psds.demo.dao;

import com.psds.demo.entity.Book;
import org.mapstruct.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;


@Mapper
public interface BookDao extends JpaRepository<Book, Integer> {
}
