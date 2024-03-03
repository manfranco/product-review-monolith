package co.edu.eafit.productmonolith.repository;

import co.edu.eafit.productmonolith.dto.ProductReview;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductReviewRepository extends JpaRepository<ProductReview, String> {
}
