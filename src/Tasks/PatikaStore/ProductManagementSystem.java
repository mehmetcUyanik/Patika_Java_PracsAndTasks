package Tasks.PatikaStore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ProductManagementSystem {
    public List<Brand> brands;
    public List<Product> products;

    public ProductManagementSystem() {
        this.brands = new ArrayList<>();
        this.products = new ArrayList<>();
    }

    public void addBrand(Brand brand) {
        brands.add(brand);
        Collections.sort(brands, Comparator.comparing(Brand::getName));
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void deleteProduct(int productId) {
        products.removeIf(product -> product.getId() == productId);
    }

    public void listProductsByCategory(String category) {
        System.out.println("Product ID   Product Name    Brand       Price     Discount   Stock    Details");
        System.out.println("--------------------------------------------------------------------------");
        for (Product product : products) {
            if (product instanceof MobilePhone && category.equalsIgnoreCase("Mobile Phones")) {
                product.displayInfo();
            } else if (product instanceof Notebook && category.equalsIgnoreCase("Notebooks")) {
                product.displayInfo();
            }
        }
    }

    public void filterAndListProducts(int productId, String brandName) {
        System.out.println("Product ID   Product Name    Brand       Price     Discount   Stock    Details");
        System.out.println("--------------------------------------------------------------------------");
        for (Product product : products) {
            if (product.getId() == productId || (brandName != null && product.getBrand().getName().equalsIgnoreCase(brandName))) {
                product.displayInfo();
            }
        }
    }
}