package com.eia.model;

public class Product {
    String productName;
    int stock;
    public StockLevel stockLevel;

    public Product(String productName, int stock) {
        this.productName = productName;
        this.stock = stock;
        this.stockLevel = StockLevel.no_defined;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public StockLevel getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(StockLevel stockLevel) {
        this.stockLevel = stockLevel;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", stock=" + stock +
                ", stockLevel=" + stockLevel +
                '}';
    }
}
