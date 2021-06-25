package com.example.JavaFullStackMarchBatch.onetomany.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer model;

    @OneToMany(mappedBy = "car",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<SparePart> sparePart;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getModel() {
        return model;
    }

    public void setModel(Integer model) {
        this.model = model;
    }

    public List<SparePart> getSparePart() {
        return sparePart;
    }

    public void setSparePart(List<SparePart> sparePart) {
        this.sparePart = sparePart;
    }
}
