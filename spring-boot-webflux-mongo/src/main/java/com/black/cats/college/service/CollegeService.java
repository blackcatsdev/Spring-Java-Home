/**
 * 
 */
package com.black.cats.college.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.black.cats.college.Entity.College;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author Kavi Mers
 *
 */
public interface CollegeService {
	
	Flux<College> getAllColleges();
	
	Mono<College> getById(String id);

	Mono<College> update(String id, College college);

	Mono<College> save(College college);
	
	Flux<College> saveAll(List<College> college);

	Mono<Map<String, Collection<String>>> getCollegesBySearch(String searchPattern);


}
