package com.learning.aws.country.persistence.repository;

import com.learning.aws.country.persistence.entity.CountryCapital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryCapitalRepository extends JpaRepository<CountryCapital,String>, JpaSpecificationExecutor<CountryCapital> {
}
