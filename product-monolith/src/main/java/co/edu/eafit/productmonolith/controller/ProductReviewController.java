package co.edu.eafit.productmonolith.controller;

import co.edu.eafit.productmonolith.dto.ProductReview;
import co.edu.eafit.productmonolith.service.ProductReviewService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class ProductReviewController {

    private final ProductReviewService productReviewService;

    public ProductReviewController(ProductReviewService productReviewService) {
        this.productReviewService = productReviewService;
    }

    @GetMapping("api/product-reviews")
    public List<ProductReview> getAllProductReviews() {
        return productReviewService.getAllProductReviews();
    }

    @GetMapping("api/product-reviews/{id}")
    public ProductReview getProductReviewById(@PathVariable String id) {
        return productReviewService.getProductReviewById(id);
    }

    @PostMapping("api/product-reviews")
    public void createProductReview(ProductReview productReview) {
        productReviewService.createProductReview(productReview);
    }

    @GetMapping("/product-reviews")
    public String showReviews(Model model, @RequestParam("product-id") String productId) {
        // Assuming you have a list of reviews
        List<ProductReview> reviews = productReviewService.getProductReviewsByProductId(productId); // Replace with your logic
        model.addAttribute("title", "Product Reviews");
        model.addAttribute("reviews", reviews);
        return "reviews"; // Thymeleaf will resolve this to the template
    }

    @GetMapping("/")
    public String showAllReviews(Model model) {
        // Assuming you have a list of reviews
        List<ProductReview> reviews = productReviewService.getAllProductReviews(); // Replace with your logic
        model.addAttribute("title", "Product Reviews");
        model.addAttribute("reviews", reviews);
        return "reviews"; // Thymeleaf will resolve this to the template
    }
}