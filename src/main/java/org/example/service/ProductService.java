package org.example.service;


import org.example.entities.Product;

import java.util.List;


public interface ProductService{

    List<Product> ListProduct();

    Product getProduct(String id);
}
