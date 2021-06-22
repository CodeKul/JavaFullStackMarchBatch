package com.example.JavaFullStackMarchBatch.onetoone.domain;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer contact;

    @OneToOne(mappedBy = "user",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Address address;

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

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
