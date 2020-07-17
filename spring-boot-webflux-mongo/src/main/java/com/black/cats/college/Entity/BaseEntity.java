package com.black.cats.college.Entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public abstract class BaseEntity implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	@CreatedBy
	private String createdBy;

	@CreatedDate
	private LocalDateTime createdDate;

	@LastModifiedBy
	private String updatedBy;

	@LastModifiedDate
	private LocalDateTime updatedDate;

	@Version
	private Long version;

	private Boolean delete = Boolean.FALSE;

}
