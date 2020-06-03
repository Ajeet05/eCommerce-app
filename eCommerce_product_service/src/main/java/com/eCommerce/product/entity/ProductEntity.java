package com.eCommerce.product.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Monika Prasad
 * @implNote Entity Class responsible to map DB result set of product mgmt 
 */
@Getter
@Setter
@Entity
public class ProductEntity implements Serializable {
	
	/**
	 * variable of unique id, That is unique value.
	 */
	@Id
	private Integer uniqueid;
	
	/**
	 * variable of prodName
	 */
	private String prodName;
	
	/**
	 * variable of description
	 */
	private String description;
	
	/**
	 * variable of price
	 */
	private BigDecimal price;
	
	/**
	 * variable of currency
	 */
	private String currency;
	

}
