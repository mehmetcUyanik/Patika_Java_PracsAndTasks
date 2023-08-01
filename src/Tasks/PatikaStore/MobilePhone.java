package Tasks.PatikaStore;

class MobilePhone extends Product {
    private String phoneMemory;
    private String screenSize;
    private String batteryPower;
    private int RAM;
    private String color;

    public MobilePhone(double unitPrice, double discountRate, int stock, String name, Brand brand,
                       String phoneMemory, String screenSize, String batteryPower, int RAM, String color) {
        super(unitPrice, discountRate, stock, name, brand);
        this.phoneMemory = phoneMemory;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.RAM = RAM;
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.format("%-5d%-15s%-15s%-10.2f%-10.2f%-10d%-15s%-10s%-15s%-10d%-10s\n",
                getId(), getName(), getBrand().getName(), getUnitPrice(), getDiscountRate(),
                getStock(), phoneMemory, screenSize, batteryPower, RAM, color);
    }
}







