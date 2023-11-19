package vn.edu.iuh.fit.www_week_lab07.backend.pks;

import lombok.Getter;
import lombok.Setter;
import vn.edu.iuh.fit.www_week_lab07.backend.models.Product;

import java.io.Serializable;
import java.time.LocalDateTime;

@Setter @Getter
public class ProductPricePK implements Serializable {
    private long product;
    private LocalDateTime price_date_time;


}
