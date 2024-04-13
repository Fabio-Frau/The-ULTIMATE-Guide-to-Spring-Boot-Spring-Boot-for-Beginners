package com.fabiofrau.RestAPi.repositories;

import com.fabiofrau.RestAPi.domain.entities.BookEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<BookEntity, String> {
}
