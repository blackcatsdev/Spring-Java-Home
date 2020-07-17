package com.black.cats.college.Entity;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Contact implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String principalName;
	
	private String phoneNumber;
	
	private String faxNumber;
	
	private String emailId;
	
}
