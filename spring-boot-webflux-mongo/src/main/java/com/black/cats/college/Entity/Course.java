package com.black.cats.college.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Course implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String degree;
	
	private String courseName;
	
}
