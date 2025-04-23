package model;

public class Device {
    private String brand;
    private String model;

    public Device (String brand , String model){
        this.brand = brand;
        this.model = model;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public void printInfo() {
        System.out.println("Device : " + brand + " " + model);
    }

        @Override
        public String toString() {
            return "Device: " + brand + " " + model;
        }
    }

