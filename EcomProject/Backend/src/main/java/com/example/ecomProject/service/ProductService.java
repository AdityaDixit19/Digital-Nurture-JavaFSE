package com.example.ecomProject.service;

import com.example.ecomProject.Exception.ProductNotFoundException;
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

    public Product updateProduct(int id, Product product, MultipartFile imageFile) throws IOException {
        Product existingProduct = repo.findById(id) //Checks whether the product exists before updating.
                .orElseThrow(() ->// Throws a custom exception if the product is not found.
                        new ProductNotFoundException("Product not found with id: " + id));
        //Updates the existing database entity instead of creating a new one.
        existingProduct.setName(product.getName());
        existingProduct.setDescription(product.getDescription());
        existingProduct.setBrand(product.getBrand());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setReleaseDate(product.getReleaseDate());
        existingProduct.setAvailable(product.isAvailable());
        //Updates the image only if a new image is provided, preventing accidental overwriting.
        if (imageFile != null && !imageFile.isEmpty()) {
            existingProduct.setImageName(imageFile.getOriginalFilename());
            existingProduct.setImageType(imageFile.getContentType());
            existingProduct.setImageData(imageFile.getBytes());
        }
        // Save the updated product.
        return repo.save(existingProduct);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);
    }

    public List<Product> searchProducts(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            return repo.findAll();
        }
        return repo.searchProducts(keyword);
    }
}