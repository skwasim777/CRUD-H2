package com.spring.SpringBootCRUDH2;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.model.Product;
public interface ProductService {
	Product createProduct(Product product);

	Product updateProduct(Product product);

	List<Product> getAllProduct();

	Product getProductById(long id);

	void deleteById(long id);
}
