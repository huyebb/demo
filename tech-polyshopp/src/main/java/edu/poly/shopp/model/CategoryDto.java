package edu.poly.shopp.model;


import java.io.Serializable;

import org.hibernate.validator.constraints.Length;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class CategoryDto implements Serializable {
	private Long categoryId;
	@NotEmpty
	@Length(min = 5)
	private String name;
	
	private Boolean isEdit = false;
}