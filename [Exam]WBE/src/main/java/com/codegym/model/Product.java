package com.codegym.model;



import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String productName;
    private String productType;
    private double productPrice;
    private int productQuantity;
    private LocalDate productDate;
    private String productDescription;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product() {
    }

    public Product(String productName, String productType, double productPrice, int productQuantity, LocalDate productDate, String productDescription) {
        this.productName = productName;
        this.productType = productType;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productDate = productDate;
        this.productDescription = productDescription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public LocalDate getProductDate() {
        return productDate;
    }

    public void setProductDate(LocalDate productDate) {
        this.productDate = productDate;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
}
