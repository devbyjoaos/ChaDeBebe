package br.com.dev.by.joaos.ana_julia.product.controller;

import br.com.dev.by.joaos.ana_julia.product.model.Product;
import br.com.dev.by.joaos.ana_julia.product.model.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@CrossOrigin(origins = "https://devbyjoaos.github.io")
@RequestMapping("/produto/v1")
@RequiredArgsConstructor
public class ProductController {

    @Autowired
    private final ProductService productService;

    @CrossOrigin(origins = "https://devbyjoaos.github.io")
    @GetMapping
    private List<Product> findAll(){
        return this.productService.findAll();
    }

    @CrossOrigin(origins = "https://devbyjoaos.github.io")
    @PostMapping
    private Product createProduct(@RequestBody Product product){
        return this.productService.createProduct(product);
    }

    @CrossOrigin(origins = "https://devbyjoaos.github.io")
    @PutMapping("/{id}")
    private void updateProduct(@PathVariable Long id){
        this.productService.selectProduct(id);
    }


}
