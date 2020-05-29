package com.probeio.jhipster.repository;

import com.probeio.jhipster.domain.Todo;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data MongoDB repository for the Todo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface TodoRepository extends MongoRepository<Todo, String> {
}
