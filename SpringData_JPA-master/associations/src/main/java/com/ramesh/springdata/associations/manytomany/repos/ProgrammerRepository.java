package com.ramesh.springdata.associations.manytomany.repos;

import org.springframework.data.repository.CrudRepository;

import com.ramesh.springdata.associations.manytomany.entities.Programmer;

public interface ProgrammerRepository extends CrudRepository<Programmer, Integer> {

}
