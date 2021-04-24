package com.example.Product.batch;

import com.example.Product.model.Product;
import com.example.Product.repository.ProductRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DBWriter implements ItemWriter<Product> {

    private ProductRepository productRepository;

    @Autowired
    public DBWriter (ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void write(List<? extends Product> products) throws Exception{
        System.out.println("Data Saved for Products: " + products);
        productRepository.saveAll(products);
    }
}