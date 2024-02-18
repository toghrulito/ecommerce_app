package com.eccom.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class CartItem extends BaseEntity {
    private Integer quantity;
    @ManyToOne
    private Cart cart;
    @ManyToOne
    private Product product;
}
