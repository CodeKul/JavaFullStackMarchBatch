package com.example.JavaFullStackMarchBatch.onetomany.domain;

import javax.persistence.*;

@Entity
public class Manager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer contact;

    private String address;

    @OneToMany(mappedBy = "manager",fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private EmployeeM employeeM;

}
