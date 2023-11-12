package vn.edu.iuh.fit.www_week_lab07.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import vn.edu.iuh.fit.www_week_lab07.backend.models.Order;
import vn.edu.iuh.fit.www_week_lab07.backend.models.OrderDetail;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Order>, JpaSpecificationExecutor<OrderDetail> {
}