package org.example.web;

import lombok.AllArgsConstructor;
import org.example.entities.Product;
import org.example.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class ProductRestController {

    private ProductService productService;

    @GetMapping("/products")
    public List<Product> productList(){
        return productService.ListProduct();
    }

    @GetMapping("/products/{id}")
    public Product productById(@PathVariable String id){
        return productService.getProduct(id);
    }
}
