package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.model.CallDetails;

@Repository
public interface CallDetailsRepository extends JpaRepository<CallDetails, Integer>{

}
