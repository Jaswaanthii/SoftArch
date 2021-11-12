package com.example.demo;

import javax.persistence.*;

@Entity
public class PTUser extends User {
    @Column(name="rate")
    private double rate;

    public double getRate() {
        return rate;
    }

    public void setRate(double num) {
        this.rate = num;
    }
}
