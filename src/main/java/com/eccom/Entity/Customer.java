package com.eccom.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

 @Entity
 @NoArgsConstructor
 @Data
public class Customer extends BaseEntity {


    private String firstName;
    private String lastName;
    private String email;


}
