package com.example.JavaFullStackMarchBatch.onetomany.domain;

import javax.persistence.*;

@Entity
public class EmployeeM {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String address;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private Manager manager;

}
