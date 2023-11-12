package vn.edu.iuh.fit.www_week_lab07.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import vn.edu.iuh.fit.www_week_lab07.backend.models.Product;
import vn.edu.iuh.fit.www_week_lab07.backend.models.ProductPrice;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Product>, JpaSpecificationExecutor<ProductPrice> {
}