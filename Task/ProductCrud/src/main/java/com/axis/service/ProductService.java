package com.axis.service;
import java.util.*;
import com.axis.entity.Product;
import com.axis.repository.ProductRepository;
public interface ProductService {

	Product addProduct(Product product);
	List<Product> getAllProduct();
	Product getProductById(int pId);
	Product updateProductById(int pId,Product product);
    String deleteProductById(int pId);
}
