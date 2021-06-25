package com.example.JavaFullStackMarchBatch.onetomany.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer contact;

    private String address;

    @OneToMany(mappedBy = "manager",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private List<EmployeeM> employeeM;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<EmployeeM> getEmployeeM() {
        return employeeM;
    }

    public void setEmployeeM(List<EmployeeM> employeeM) {
        this.employeeM = employeeM;
    }
}
