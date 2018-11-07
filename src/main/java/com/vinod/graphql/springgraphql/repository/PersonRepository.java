package com.vinod.graphql.springgraphql.repository;

import org.springframework.data.repository.CrudRepository;
import com.vinod.graphql.springgraphql.entity.Person;

public interface PersonRepository extends CrudRepository<Person,Integer> {
}
