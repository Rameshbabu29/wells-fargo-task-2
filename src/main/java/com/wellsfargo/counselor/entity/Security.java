package com.wellsfargo.counselor.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @Column(nullable = false)
    private String securityName;

    @Column(nullable = false)
    private String securityCategory;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private int purchasePrice;

    @Column(nullable = false)
    private int purchaseQuantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_Id")
    private Portfolio portfolio;

    public Security() {
    }


    public Security(String securityName, String securityCategory, Date purchaseDate, int purchasePrice,
            int purchaseQuantity, Portfolio portfolio) {
        this.securityName = securityName;
        this.securityCategory = securityCategory;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.purchaseQuantity = purchaseQuantity;
        this.portfolio = portfolio;
    }



    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public String getSecurityCategory() {
        return securityCategory;
    }

    public void setSecurityCategory(String securityCategory) {
        this.securityCategory = securityCategory;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(int purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    


    
    
}
