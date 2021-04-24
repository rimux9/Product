package com.example.Product.batch;

import com.example.Product.model.Product;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Processor implements ItemProcessor <Product, Product>{
    private static final Map<String, String> CATEGORY_NAMES = new HashMap<>();

    public Processor() {
        CATEGORY_NAMES.put("001", "Baldas");
        CATEGORY_NAMES.put("002", "Elektra");
        CATEGORY_NAMES.put("003", "Indai");
    }

    @Override
    public Product process(Product product) throws Exception{
        String categoryCode = product.getCategory();
        String category = CATEGORY_NAMES.get(categoryCode);
        product.setCategory(category);
        System.out.println(String.format("Converted from [%s] to [%s]", categoryCode, category));
        return product;

    }
}
