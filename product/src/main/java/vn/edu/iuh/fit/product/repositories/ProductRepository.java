package vn.edu.iuh.fit.product.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import vn.edu.iuh.fit.product.modules.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
