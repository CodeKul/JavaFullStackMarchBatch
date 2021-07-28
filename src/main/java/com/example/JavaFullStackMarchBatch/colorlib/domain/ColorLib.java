package com.example.JavaFullStackMarchBatch.colorlib.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ColorLib {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(length = 1000)
    private String lastName;

    private String company;

    private String email;

    private Long mobileNumber;

    private String mealPreference;

    private String paymentMode;

    private String ddOrCheque;

    private String bankName;

    private Date payableAt;



}
