// ProductController.java
package com.coffeeshop.form_submission.controller;

import com.coffeeshop.form_submission.model.Product;
import com.coffeeshop.form_submission.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProductController {
//    private List<Product> productsList = new ArrayList<>(List.of(
//            new Product(1, "Espresso", 2.50),
//            new Product(2, "Latte", 3.50),
//            new Product(3, "Croissant", 2.00),
//            new Product(4, "Chocolate Muffin", 2.25),
//            new Product(5, "Americano", 2.75)
//    ));
    @Autowired
    private ProductService productService;

    //display a list of products
    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listProducts",productService.getAllProducts());
        return "menu";
    }

    @GetMapping("/showNewProductForm")
    public String showNewProductForm(Model model){
        Product product = new Product();
        model.addAttribute("product",product);
        return "add-new-product";
    }

    @PostMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product){

        productService.saveProduct(product);
        return "redirect:/";
    }

//    @RequestMapping("/")  // Maps to the URL http://localhost:8080/
//    public String listProducts(Model productListModel) {
//        productListModel.addAttribute("products", productsList);  // Add productsList to the model
//        return "add-new-product";  // Returns the view name (HTML file name)
//    }

//    @RequestMapping("/add")  // Maps to the URL http://localhost:8080/add
//    public String showProductForm(Model productAddFormModel) {
//        productAddFormModel.addAttribute("product", new Product());  // Add a new product instance to the model
//        return "add-new-product";
//    }
//
//    @PostMapping("/addNewProduct")  // Handles the form submission
//    public String addProduct(Product product) {
//        productsList.add(product);  // Adds the submitted product to productsList
//        System.out.println(productsList);  // Logs the updated product list
//        return "redirect:/";  // Redirects back to the main product list view
//    }
}
