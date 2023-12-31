package Tasks.PatikaStore;

abstract class Product {
    private static int idCounter = 1;

    private int id;
    private double unitPrice;
    private double discountRate;
    private int stock;
    private String name;
    private Brand brand;

    public Product(double unitPrice, double discountRate, int stock, String name, Brand brand) {
        this.id = idCounter++;
        this.unitPrice = unitPrice;
        this.discountRate = discountRate;
        this.stock = stock;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public Brand getBrand() {
        return brand;
    }

    public abstract void displayInfo();
}
