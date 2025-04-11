package com.demo.demoApp.service;


import com.demo.demoApp.model.Product;
import com.demo.demoApp.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    private final ProductRepository productRepository;


    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public Product getProductById(int id){
        return productRepository.findById(id).orElse(new Product());
    }

    public boolean addProduct(Product product) {
         productRepository.save(product);
         return  true;
    }

//    public boolean deleteProduct(Product product){
//        productRepository.deleteById(product.);
//    }
}
