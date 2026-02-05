
/**
 * Write a description of class Product here.
 *
 * @author (24BIA023)
 * @version (5/2/2026)
 */
public class Product
{
    private String productCode;
    private String productName;
    private String category;
    private double unitPrice;
    private int quantityInStock;
    private int reorderLevel;
    
    public Product(String productCode,String productName,String category,double unitPrice,int quantityInStock,int reorderLevel) {
        this.productCode = productCode;
        this.productName = productName;
        this.category = category;
        this.unitPrice = unitPrice;
        this.quantityInStock = quantityInStock;
        this.reorderLevel = reorderLevel;
    }
    
    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public int getReorderLevel() {
        return reorderLevel;
    }
    
    public void setUnitPrice(double unitPrice) {
        if (unitPrice > 0) {
            this.unitPrice = unitPrice;
        } else {
            System.out.println("Unit price must be greater than 0");
        }
    }

    public void setQuantityInStock(int quantityInStock) {
        if (quantityInStock >= 0) {
            this.quantityInStock = quantityInStock;
        } else {
            System.out.println("Quantity cannot be negative");
        }
    }

    public void setReorderLevel(int reorderLevel) {
        if (reorderLevel > 0) {
            this.reorderLevel = reorderLevel;
        } else {
            System.out.println("Reorder level must be greater than 0");
        }
    }

    public void addStock(int quantity) {
        if (quantity > 0) {
            quantityInStock += quantity;
        } else {
            System.out.println("Invalid quantity");
        }
    }

    public boolean sellProduct(int quantity) {
        if (quantity > 0 && quantity <= quantityInStock) {
            quantityInStock -= quantity;
            return true;
        } else {
            System.out.println("Unsufficient Stock");
            return false;
        }
    }

    public double calculateStockValue() {
        return unitPrice * quantityInStock;
    }

    public boolean needsReorder() {
        return quantityInStock <= reorderLevel;
    }

    public void applyDiscount(double percentage) {
        if (percentage > 0 && percentage <= 100) {
            unitPrice -= unitPrice * (percentage / 100);
        } else {
            System.out.println("Invalid discount percentage");
        }
    }

    public void displayProductInfo() {
        System.out.println("Product Code: " + productCode);
        System.out.println("Name: " + productName);
        System.out.println("Category: " + category);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Stock: " + quantityInStock);
        System.out.println("Reorder Level: " + reorderLevel);
        System.out.println("Stock Value: " + calculateStockValue());
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("=== Product Inventory  ===\n");

        Product product1 = new Product ("P01", "Laptop", "Electronics", 1500000, 25,8);

        Product product2 = new Product ("P02", "Office Chair", "Furniture", 350000, 45,9);

        Product product3 = new Product ("P03", "Notebook", "Stationery", 5000, 100,12);

        product1.displayProductInfo();
        product2.displayProductInfo();
        product3.displayProductInfo();

        product1.sellProduct(20);

        if (product2.needsReorder()) {
            System.out.println(product2.getProductName() + " needs reorder!");
        }

        product2.addStock(50);

        product3.applyDiscount(15);

        System.out.println("\n=== Final Stock Values ===");
        System.out.println(product1.getProductName() + ": " + product1.calculateStockValue());
        System.out.println(product2.getProductName() + ": " + product2.calculateStockValue());
        System.out.println(product3.getProductName() + ": " + product3.calculateStockValue());

        System.out.println("\n===============");
    }
}