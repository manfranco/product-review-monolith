package co.edu.eafit.productmonolith.service;


import co.edu.eafit.productmonolith.dto.ProductReview;
import co.edu.eafit.productmonolith.repository.ProductReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductReviewService {

    private final ProductReviewRepository productReviewRepository;

    @Autowired
    public ProductReviewService(ProductReviewRepository productReviewRepository) {
        this.productReviewRepository = productReviewRepository;
    }

    public List<ProductReview> getAllProductReviews() {
        return productReviewRepository.findAll();
    }

    public ProductReview getProductReviewById(String id) {
        return productReviewRepository.findById(id).orElse(null);
    }

    public ProductReview createProductReview(ProductReview productReview) {
        return productReviewRepository.save(productReview);
    }

}
