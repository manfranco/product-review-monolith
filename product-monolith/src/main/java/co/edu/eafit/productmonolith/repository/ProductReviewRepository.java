package co.edu.eafit.productmonolith.repository;

import co.edu.eafit.productmonolith.dto.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductReviewRepository extends JpaRepository<ProductReview, String> {
    List<ProductReview> findByProductId(String productId);
}
