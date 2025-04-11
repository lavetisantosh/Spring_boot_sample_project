package com.demo.demoApp.controller;

import com.demo.demoApp.model.Product;
import com.demo.demoApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    public ProductController(ProductService productService){
        this.productService = productService;
    }

    private final ProductService productService;

    @GetMapping("/")
    public void build(){
        System.out.println("Product Controller");
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
      return  productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductsById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public boolean addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

//    @DeleteMapping("/products")
//    public boolean deleteProductById(@RequestBody Product product){
//        return productService.deleteProduct(product);
//    }
}
