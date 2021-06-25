package com.example.JavaFullStackMarchBatch.onetomany.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class SparePart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String partName;

    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id")
    @JsonIgnore
    private Car car;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
