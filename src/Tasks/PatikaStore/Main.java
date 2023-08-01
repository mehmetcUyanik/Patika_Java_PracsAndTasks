package Tasks.PatikaStore;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductManagementSystem pms = new ProductManagementSystem();
        Scanner scanner = new Scanner(System.in);

        pms.addBrand(new Brand(1, "Samsung"));
        pms.addBrand(new Brand(2, "Lenovo"));
        pms.addBrand(new Brand(3, "Apple"));
        pms.addBrand(new Brand(4, "Huawei"));
        pms.addBrand(new Brand(5, "Casper"));
        pms.addBrand(new Brand(6, "Asus"));
        pms.addBrand(new Brand(7, "HP"));
        pms.addBrand(new Brand(8, "Xiaomi"));
        pms.addBrand(new Brand(9, "Monster"));


        while (true) {
            System.out.println("\n===== PatikaStore Product Management System =====");
            System.out.println("1. List Mobile Phones");
            System.out.println("2. List Notebooks");
            System.out.println("3. Add Mobile Phone");
            System.out.println("4. Add Notebook");
            System.out.println("5. Delete Product");
            System.out.println("6. Filter and List Products by ID and Brand");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("=== Mobile Phones ===");
                    pms.listProductsByCategory("Mobile Phones");
                    break;
                case 2:
                    System.out.println("=== Notebooks ===");
                    pms.listProductsByCategory("Notebooks");
                    break;
                case 3:
                    addMobilePhone(pms, scanner);
                    break;
                case 4:
                    addNotebook(pms, scanner);
                    break;
                case 5:
                    System.out.print("Enter the Product ID to delete: ");
                    int productId = scanner.nextInt();
                    pms.deleteProduct(productId);
                    System.out.println("Product with ID " + productId + " has been deleted.");
                    break;
                case 6:
                    System.out.print("Enter the Product ID (or 0 for all products): ");
                    int filterProductId = scanner.nextInt();
                    System.out.print("Enter the Brand Name (or 'none' for all brands): ");
                    String brandName = scanner.next();
                    pms.filterAndListProducts(filterProductId, brandName.equalsIgnoreCase("none") ? null : brandName);
                    break;
                case 0:
                    System.out.println("Exiting PatikaStore Product Management System...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addMobilePhone(ProductManagementSystem pms, Scanner scanner) {
        System.out.print("Enter the Brand ID (1-9): ");
        int brandId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the Product Name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter the Unit Price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter the Discount Rate: ");
        double discountRate = scanner.nextDouble();
        System.out.print("Enter the Stock: ");
        int stock = scanner.nextInt();
        System.out.print("Enter the Phone Memory (e.g., 128GB): ");
        String phoneMemory = scanner.next();
        System.out.print("Enter the Screen Size (e.g., 6.1 Inc): ");
        String screenSize = scanner.next();
        System.out.print("Enter the Battery Power: ");
        String batteryPower = scanner.next();
        System.out.print("Enter the RAM (e.g., 6): ");
        int RAM = scanner.nextInt();
        System.out.print("Enter the Color: ");
        String color = scanner.next();

        Brand brand = pms.brands.stream().filter(b -> b.getId() == brandId).findFirst().orElse(null);
        if (brand != null) {
            pms.addProduct(new MobilePhone(unitPrice, discountRate, stock, productName, brand,
                    phoneMemory, screenSize, batteryPower, RAM, color));
            System.out.println("Mobile Phone has been added.");
        } else {
            System.out.println("Invalid Brand ID. Mobile Phone cannot be added.");
        }
    }

    private static void addNotebook(ProductManagementSystem pms, Scanner scanner) {
        System.out.print("Enter the Brand ID (1-9): ");
        int brandId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the Product Name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter the Unit Price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter the Discount Rate: ");
        double discountRate = scanner.nextDouble();
        System.out.print("Enter the Stock: ");
        int stock = scanner.nextInt();
        System.out.print("Enter the RAM (e.g., 8): ");
        int RAM = scanner.nextInt();
        System.out.print("Enter the Storage (e.g., 512 SSDs): ");
        String storage = scanner.next();
        System.out.print("Enter the Screen Size (e.g., 14 inches): ");
        String screenSize = scanner.next();

        Brand brand = pms.brands.stream().filter(b -> b.getId() == brandId).findFirst().orElse(null);
        if (brand != null) {
            pms.addProduct(new Notebook(unitPrice, discountRate, stock, productName, brand,
                    RAM, storage, screenSize));
            System.out.println("Notebook has been added.");
        } else {
            System.out.println("Invalid Brand ID. Notebook cannot be added.");
        }
    }
}
