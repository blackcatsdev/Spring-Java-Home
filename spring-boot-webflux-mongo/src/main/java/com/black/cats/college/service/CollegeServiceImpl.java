/**
 * 
 */
package com.black.cats.college.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuples;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.black.cats.college.Entity.College;
import com.black.cats.college.repository.CollegeRepository;

import lombok.RequiredArgsConstructor;

/**
 *
 */
@Service
@RequiredArgsConstructor
public class CollegeServiceImpl implements CollegeService{
	
	private final CollegeRepository collegeRepository;
	
	@Override
	public Flux<College> getAllColleges() {
		return collegeRepository.findAll().switchIfEmpty(Flux.empty());
	}
	
	@Override
	public Mono<Map<String, Collection<String>>> getCollegesBySearch(String searchPattern) {
		Flux<College> collegesByPattern = null;
		if(!ObjectUtils.isEmpty(searchPattern) ) {
		 collegesByPattern = collegeRepository.findByCollegeNameLikeOrDistrictLike(searchPattern, searchPattern);
		}else {
			collegesByPattern = collegeRepository.findAll();
		}
		Mono<Map<String, Collection<String>>> mapping = collegesByPattern	
				.collectMultimap(
					item -> item.getCollegeDetails().getDescription(),
					item -> item.getCollegeName()
				);
		return mapping;
	}

	@Override
	public Mono<College> getById(String id) {
		return collegeRepository.findById(id);
	}

	@Override
	public Mono<College> update(String id, College college) {
		return collegeRepository.save(college);
	}

	@Override
	public Mono<College> save(College college) {
		return collegeRepository.save(college);
	}
	
	@Override
	public Flux<College> saveAll(List<College> college) {
		return collegeRepository.saveAll(college);
	}

}
