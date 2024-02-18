package com.eccom.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.math.BigInteger;

@Entity
@Data
@NoArgsConstructor

public class Balance extends BaseEntity {

    private BigDecimal amount;
    @OneToOne
    private Customer customer;
}
