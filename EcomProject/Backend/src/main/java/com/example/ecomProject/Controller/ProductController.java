package com.example.ecomProject.Controller;
import com.example.ecomProject.model.Product;
import  com.example.ecomProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.util.*;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {
    @Autowired
    private ProductService service;
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable int id) {
        Product product = service.getProduct(id);
        if (product != null) {
            return new ResponseEntity<>(product, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile) {
        try {
            Product product1 = service.addProduct(product, imageFile);
            return new ResponseEntity<>(product1, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/product/{productID}/image") //maps a GET request to fetch the image of a specific product
    public ResponseEntity<byte[]> getImage(@PathVariable int productID) {
        Product product = service.getProduct(productID);//The product is retrieved from the service using the provided productID
        byte[] imageFile = product.getImageData();//The image bytes (imageData) and image type (imageType, e.g., image/jpeg) are extracted from the product.
        return (ResponseEntity<byte[]>) ResponseEntity.ok().
                contentType(MediaType.valueOf(product.getImageType())).body(imageFile);//ResponseEntity returns the image
                // bytes with the correct
                // Content-Type so the browser or client can display the image properly.
    }
}
