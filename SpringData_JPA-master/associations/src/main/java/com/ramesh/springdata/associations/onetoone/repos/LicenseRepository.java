package com.ramesh.springdata.associations.onetoone.repos;

import org.springframework.data.repository.CrudRepository;

import com.ramesh.springdata.associations.onetoone.entities.License;

public interface LicenseRepository extends CrudRepository<License, Long> {

}
