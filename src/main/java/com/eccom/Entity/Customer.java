package com.eccom.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Customer extends BaseEntity {


    private String firstName;
    private String lastName;
    private String email;
    private String userName;



}
