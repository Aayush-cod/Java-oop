package Encapsulation;

public class Product {
    private String productName;
    private int productID;
    private double price;
    private int stockQuantity;

    public void setProductName(String name) {
        this.productName = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductID(int id) {
        this.productID = id;
    }

    public int getProductID() {
        return productID;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    public double getPrice() {
        return price;
    }

    public void purchase(int quantity) {
        if (stockQuantity >= quantity) {
            stockQuantity -= quantity;
        } else {
            System.out.println("Insufficient stock!");
        }
    }

    public void restock(int quantity) {
        stockQuantity += quantity;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public static void main(String[] args) {
        Product product = new Product();
        product.setProductName("Laptop");
        product.setProductID(101);
        product.setPrice(899.99);
        product.restock(10);
        product.purchase(3);

        System.out.println("Product: " + product.getProductName());
        System.out.println("Stock left: " + product.getStockQuantity());
    }
}
