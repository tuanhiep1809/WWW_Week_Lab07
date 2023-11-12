package vn.edu.iuh.fit.www_week_lab07.backend.enums;

public enum ProductStatus {
    ACTIVE(0),//đang kinh doanh
    IN_ACTIVE(1), //tam ngung
    TERMINATED(2); //khong ban nua
    private int value;

    ProductStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
