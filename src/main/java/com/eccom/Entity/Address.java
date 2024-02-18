package com.eccom.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@NoArgsConstructor
@Data

public class Address extends BaseEntity {

    private String name;
    private String street;
    private String zipCode;
    @ManyToOne
    private Customer customer;

}
