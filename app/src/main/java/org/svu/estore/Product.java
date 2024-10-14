package org.svu.estore;
import com.google.gson.annotations.SerializedName;
public class Product {
    @SerializedName("product_name")
    private String name;

    @SerializedName("unit_price")
    private String price;

    @SerializedName("supplier_company_name")
    private String company;


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return  "price : "+price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }



}
