package vn.edu.iuh.fit.www_week_lab07.frontend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter @Getter @NoArgsConstructor @AllArgsConstructor
public class CartItem {
    private long productId;
    private int amount;
}
