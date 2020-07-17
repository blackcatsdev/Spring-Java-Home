/**
 * 
 */
package com.black.cats.college.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.black.cats.college.Entity.College;
import com.black.cats.college.service.CollegeService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 */
@Slf4j
@RestController
@RequestMapping("/college")
@RequiredArgsConstructor
public class CollegeController {

	private final CollegeService collegeService;

	@GetMapping
	public ResponseEntity<Flux<College>> getAllColleges(@RequestParam(name="query",required = false) String query) {
		if (log.isDebugEnabled()) {
			log.debug("All Colleges Requested");
		}
		return ResponseEntity.ok(collegeService.getAllColleges());
	}
	
	@GetMapping("/_search")
	public ResponseEntity<Mono<Map<String, Collection<String>>>> getCollegesByPattern(@RequestParam(name="pattern",required = false) String searchPattern) {
		if (log.isDebugEnabled()) {
			log.debug("All Colleges Requested");
		}
		return ResponseEntity.ok(collegeService.getCollegesBySearch(searchPattern));
	}

	@GetMapping("{id}")
	public ResponseEntity<Mono<College>> getById(@PathVariable("id") final String id) {
		if (log.isDebugEnabled()) {
			log.debug("All Colleges Requested");
		}
		return ResponseEntity.ok(collegeService.getById(id));
	}

	@PutMapping("{id}")
	public ResponseEntity<Mono<College>> updateById(@PathVariable("id") final String id, @RequestBody final College college) throws URISyntaxException {
		if (log.isDebugEnabled()) {
			log.debug("college={} collegeName={} - updated", id, college.getCollegeName());
		}
		return ResponseEntity.created(new URI("/"+id)).body(collegeService.update(id, college));
	}

	@PostMapping
	public ResponseEntity<Mono<College>> save(@RequestBody final College college) throws URISyntaxException {
		if (log.isDebugEnabled()) {
			log.debug("college={} collegeName={} - created", college.getId(), college.getCollegeName());
		}
		Mono<College> collegeCreated=collegeService.save(college);
		return ResponseEntity.created(new URI("/"+college.getId())).body(collegeCreated);
	}
	
	@PostMapping("/bulk")
	public ResponseEntity<Flux<College>> save(@RequestBody final List<College> college) throws URISyntaxException {
		if (log.isDebugEnabled()) {
			log.debug("college={} collegeName={} - created", college);
		}
		Flux<College> collegeCreated=collegeService.saveAll(college);
		return ResponseEntity.created(new URI("/"+college.get(0).getId())).body(collegeCreated);
	}

}
