package com.axis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.entity.Product;
import com.axis.exception.IdNotFoundException;
import com.axis.repository.ProductRepository;

@Service  //<bean id="empser class="">
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	
	@Override
	public Product addProduct(Product product) {

	return productRepository.save(product);
		}
	
	
	
	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(int id) {
	Optional<Product>	pd =  productRepository.findById(id);
	
	if(pd.isPresent())
		return pd.get();
	else
		throw new IdNotFoundException("no id present to get the value");
	}

	@Override
	public Product updateProductById(int id, Product product) {
		
		Optional<Product>	pd =  productRepository.findById(id);
		
		if(pd.isPresent())
			 return productRepository.save(product);
		else
			throw new IdNotFoundException("no id present to update");
		
		
	}

	@Override
	public String deleteProductById(int id) {
		Optional<Product>	pd =  productRepository.findById(id);
		
		if(pd.isPresent())
		{
			productRepository.deleteById(id);
			return "product deleted";
		}
		else
			throw new IdNotFoundException("no product id present to delete");
		
		
		
	}

	

}

