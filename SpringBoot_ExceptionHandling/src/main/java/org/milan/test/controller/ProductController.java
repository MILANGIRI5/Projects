/**
 * 
 */
package org.milan.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.milan.test.exception.ProductNotFound;
import org.milan.test.model.ProductBO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Milan
 *
 */
@RestController
public class ProductController {

	@GetMapping("/product")
	public List<ProductBO> productDetails() {
		ProductBO bo = new ProductBO(10, "Mobile", 50000);
		ProductBO bo2 = new ProductBO(20, "Tv", 15000);
		ProductBO bo3 = new ProductBO(30, "Washing Machine", 20000);

		List<ProductBO> productlist = new ArrayList<ProductBO>();
		productlist.add(bo);
		productlist.add(bo2);
		productlist.add(bo3);

		return productlist;
	}

	@GetMapping("/product/{id}")
	public ProductBO singleProduct(@PathVariable("id") int productId) {
		System.out.println("calling by id..........");
		// call to service layer than from service layer to DAO and get data from DB
		ProductBO product = null;
		if (productId == 10) {
			product = new ProductBO(10, "Mobile", 50000);
		} else if (productId == 20) {
			product = new ProductBO(20, "Tv", 15000);
		} else if (productId == 30) {
			product = new ProductBO(30, "Washing Machine", 20000);
		} else {
			System.out.println("Id not found..........");
			throw new ProductNotFound("Invalid Product " + productId);
		}
		return product;
	}
}
