package com.stackroute.repository;

import com.stackroute.domain.Counters;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CounterRepository extends MongoRepository<Counters, Integer> {
}
