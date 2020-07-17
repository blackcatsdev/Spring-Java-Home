package com.black.cats.college.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.black.cats.college.Entity.College;

import reactor.core.publisher.Flux;

@Repository
public interface CollegeRepository extends ReactiveMongoRepository<College, String>{
	
	Flux<College> findByCollegeNameLikeOrDistrictLike(String collegeName,String district);

}
