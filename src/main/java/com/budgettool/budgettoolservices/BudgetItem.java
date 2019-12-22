package com.budgettool.budgettoolservices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BudgetItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    boolean paid;
    Date dateDue = new Date();
    String item;
    double amount;
    boolean reviewed;

    public BudgetItem() {
    }

    public BudgetItem(int id, boolean paid, Date dateDue, String item, double amount, boolean reviewed){
        this.id = id;
        this.paid = paid;
        this.dateDue = dateDue;
        this.item = item;
        this.amount = amount;
        this.reviewed = reviewed;
    }



    public int getId() {
        return id;
    }

    public boolean isPaid() {
        return paid;
    }

    public Date getDateDue() {
        return dateDue;
    }

    public String getItem() {
        return item;
    }

    public double getAmount() {
        return amount;
    }

    public boolean isReviewed() {
        return reviewed;
    }

    @Override
    public String toString() {
        return "BudgetItem{" +
                "id=" + id +
                ", paid=" + paid +
                ", dateDue=" + dateDue +
                ", item='" + item + '\'' +
                ", amount=" + amount +
                ", reviewed=" + reviewed +
                '}';
    }
}
