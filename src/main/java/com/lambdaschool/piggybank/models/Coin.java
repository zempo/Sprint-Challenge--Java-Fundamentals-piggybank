package com.lambdaschool.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "deposits")
public class Coin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long depositId;
    private String name;
    private String namePlural;
    private double value;
    private int quantity;

    public Coin() {}

    public Coin(String name, String namePlural, double value, int quantity) {
        this.name = name;
        this.namePlural = namePlural;
        this.value = value;
        this.quantity = quantity;
    }

    public long getDepositId() {
        return depositId;
    }

    public void setDepositId(long depositId) {
        this.depositId = depositId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamePlural() {
        return namePlural;
    }

    public void setNamePlural(String namePlural) {
        this.namePlural = namePlural;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}