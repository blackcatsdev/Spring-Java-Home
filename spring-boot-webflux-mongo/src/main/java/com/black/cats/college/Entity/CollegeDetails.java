/**
 * 
 */
package com.black.cats.college.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.bson.types.Binary;
import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Kavi Mers
 *
 */
@Data
@NoArgsConstructor
public class CollegeDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String description;
	
	private Long yearEstablished;
	
	private Boolean minorityStatus;
	
	private Address address;
	
	private ArrayList<Course> course;
	
	//private Binary image;

}
