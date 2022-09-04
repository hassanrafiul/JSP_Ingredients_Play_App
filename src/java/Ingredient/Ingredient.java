/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ingredient;

import java.io.Serializable;

/**
 *
 * @author rafiu
 */
public class Ingredient implements Serializable{
    private String name;
    private String measure;
    private double quantity;
    private double baseAmount;
    
    public Ingredient(){
        name = "";
        measure ="";
        quantity = 0;
        baseAmount = 0;        
    }
           
    public Ingredient(String name, String measure, double quantity, double baseAmount) {
        this.name = name;
        this.measure = measure;
        this.quantity = quantity;
        this.baseAmount = baseAmount;
    }
    
    public double getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(double baseAmount) {
        this.baseAmount = baseAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    
}
