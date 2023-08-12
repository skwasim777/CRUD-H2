package com.spring.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.SpringBootCRUDH2.ProductService;
import com.spring.exception.ResourseNotFoundException;
import com.spring.model.Product;
import com.spring.repository.ProductRepository;

import jakarta.transaction.Transactional;


@Service
public class ServiceImpl implements ProductService {
	private ProductRepository productRepo;

	@Override
	public Product createProduct(Product product) {

		return productRepo.save(product);
	}

	@Override
	public Product updateProduct(Product product) {
		Optional<Product> productDb = this.productRepo.findById(product.getId());
		if (productDb.isPresent()) {
			Product productUpdate = productDb.get();
			productUpdate.setId(product.getId());
			productUpdate.setName(product.getName());
			productUpdate.setDescription(product.getDescription());
			productRepo.save(productUpdate);
			return productUpdate;
		}
		else {
			throw new ResourseNotFoundException("record not found with id " + product.getId());
		}
	}

	@Override
	public List<Product> getAllProduct() {
		return this.productRepo.findAll();
	}

	@Override
	public Product getProductById(long id) {
		Optional<Product> productDb = this.productRepo.findById(id);
		if (productDb.isPresent()) {
			return productDb.get();
		}
		else {
			throw new ResourseNotFoundException("record not found with id " + id);
		}
	}

	@Override
	public void deleteById(long id) {
			Optional<Product> productDb = this.productRepo.findById(id);
			if (productDb.isPresent()) {
				this.productRepo.delete(productDb.get());
			}
			else {
				throw new ResourseNotFoundException("record not found with id " + id);
			}
	}

}
