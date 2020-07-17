/**
 * 
 */
package com.black.cats.college.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

/**
 * @author Kavi Mers
 *
 */
@Data
@Document(collection = "menu")
public class Menu extends BaseEntity {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String Menu;
	
	private String Title;
	
	private String page;
	

}
