package com.example.configureswagger.service;

import com.example.configureswagger.entity.Product;
import com.example.configureswagger.entity.ResponseMessage;
import com.example.configureswagger.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getProducts() {
        List<Product> productList = productRepository.findAll();
        return productList;
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public ResponseMessage deleteProduct(Long id) {
        productRepository.deleteById(id);
        return new ResponseMessage("Product Deleted");
    }
}
