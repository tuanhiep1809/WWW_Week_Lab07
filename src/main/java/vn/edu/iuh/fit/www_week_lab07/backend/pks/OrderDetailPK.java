package vn.edu.iuh.fit.www_week_lab07.backend.pks;

import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.www_week_lab07.backend.models.Order;
import vn.edu.iuh.fit.www_week_lab07.backend.models.Product;

import java.io.Serializable;

@Setter @Getter
public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
