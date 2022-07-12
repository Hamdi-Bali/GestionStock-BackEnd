package com.back.end.model;

import javax.persistence.*;

@Entity
@Table
public class Toner {
    @Id
    @SequenceGenerator(
            name = "Toner_sequence",
            sequenceName = "Toner_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "Toner_sequence"
    )
    private int num_toner ;
    private String type_toner ;
    private int stock ;

    public Toner(int num_toner, String type_toner, int stock) {
        this.num_toner = num_toner;
        this.type_toner = type_toner;
        this.stock = stock;
    }

    public Toner(int num_toner) {

        this.num_toner = num_toner;
    }

    public Toner() {

    }

    @Override
    public String toString() {
        return "Toner{" +
                "num_toner=" + num_toner +
                ", type_toner='" + type_toner + '\'' +
                ", stock=" + stock +
                '}';
    }

    public void setType_toner(String type_toner) {
        this.type_toner = type_toner;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getType_toner() {
        return type_toner;
    }

    public int getStock() {
        return stock;
    }

    public Integer getNum() {
        return  this.num_toner ;
    }
}
