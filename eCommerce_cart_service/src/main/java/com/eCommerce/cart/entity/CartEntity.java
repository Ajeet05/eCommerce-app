package com.eCommerce.cart.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CartEntity implements Serializable {
	
	/**
	 * variable of unique id, That is unique value.
	 */
	@Id
	private Integer uniqueid;
	
	/**
	 * variable of item
	 */
	private List item;
	/**
	 * variable of currency
	 */
	private String currency;
	
	/**
	 * variable of total
	 */
	private BigDecimal total;
	

}
