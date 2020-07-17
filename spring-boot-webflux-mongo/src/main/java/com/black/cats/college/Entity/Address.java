package com.black.cats.college.Entity;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Address implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String town;
	
	private String district;
	
	private String state;
	
	private String pinCode;

}
