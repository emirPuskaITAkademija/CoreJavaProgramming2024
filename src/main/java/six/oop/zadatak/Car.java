package six.oop.zadatak;

import java.time.LocalDateTime;

public class Car {
    private String color;
    private int serialNumber;
    private String brand;
    private int productionYear;

    public Car(int serialNumber, String brand){
        this.serialNumber = serialNumber;
        this.brand = brand;
        this.productionYear = LocalDateTime.now().getYear();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getBrand() {
        return brand;
    }
}
