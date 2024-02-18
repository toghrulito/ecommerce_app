package com.eccom.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;

@Entity
@NoArgsConstructor
@Getter
@Setter

public class Address extends BaseEntity {

    private String name;
    private String street;
    private String zipCode;
    @ManyToOne
    private Customer customer;

}
