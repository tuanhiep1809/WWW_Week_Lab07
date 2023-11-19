package vn.edu.iuh.fit.www_week_lab07.backend.enums;

public enum EmployeeStatus {
    ACTIVE(0),
    IN_ACTIVE(1),
    TERMINATED(2);
    private int value;

    EmployeeStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
