/**
 * 
 */
package com.black.cats.college.Entity;

import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**	
 * @author Kavi Mers
 *
 */
@Data
@Document(collection = "college")
public class College extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TextIndexed
	private String collegeName;
	
	private CollegeDetails collegeDetails;

}
