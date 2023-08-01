package Tasks.PatikaStore;

class Notebook extends Product {
    private int RAM;
    private String storage;
    private String screenSize;

    public Notebook(double unitPrice, double discountRate, int stock, String name, Brand brand,
                    int RAM, String storage, String screenSize) {
        super(unitPrice, discountRate, stock, name, brand);
        this.RAM = RAM;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        System.out.format("%-5d%-15s%-15s%-10.2f%-10.2f%-10d%-10s%-15s%-10s\n",
                getId(), getName(), getBrand().getName(), getUnitPrice(), getDiscountRate(),
                getStock(), RAM + "GB", screenSize, storage);
    }
}
