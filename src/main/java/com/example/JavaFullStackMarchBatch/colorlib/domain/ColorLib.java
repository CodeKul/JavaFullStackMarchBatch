package com.example.JavaFullStackMarchBatch.colorlib.domain;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.implementation.bind.annotation.Empty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class ColorLib {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
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
