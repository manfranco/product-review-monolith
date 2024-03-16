package co.edu.eafit.productmonolith.controller;

import co.edu.eafit.productmonolith.dto.ProductReview;
import co.edu.eafit.productmonolith.service.ProductReviewService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductReviewController {

    private final ProductReviewService productReviewService;

    public ProductReviewController(ProductReviewService productReviewService) {
        this.productReviewService = productReviewService;
    }

    @GetMapping("/product-reviews")
    public List<ProductReview> getAllProductReviews() {
        return productReviewService.getAllProductReviews();
    }

    @GetMapping("/product-reviews/{id}")
    public ProductReview getProductReviewById(@PathVariable String id) {
        return productReviewService.getProductReviewById(id);
    }

    @PostMapping("/product-reviews")
    public void createProductReview(ProductReview productReview) {
        productReviewService.createProductReview(productReview);
    }
}
