package edu.poly.shopp.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartItem implements Serializable{
	private Long productId;
	private String name;
	private int quantity;
	private String image;
	private double unitPrice;
}
