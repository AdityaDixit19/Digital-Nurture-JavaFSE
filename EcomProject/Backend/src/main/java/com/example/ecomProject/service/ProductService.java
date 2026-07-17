package com.example.ecomProject.service;

import com.example.ecomProject.model.Product;
import com.example.ecomProject.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Product getProduct(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());// gets uploaded image filename
        product.setImageType(imageFile.getContentType());// gets image mime type (jpg/png)
        product.setImageData(imageFile.getBytes());//reads the entire image as a byte array and store the binary data in product object
        return repo.save(product);
    }
}