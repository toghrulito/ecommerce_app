package com.eccom.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@NoArgsConstructor
@Getter
@Setter

public class Balance extends BaseEntity {

    private BigDecimal amount;
    @OneToOne
    private Customer customer;
}
