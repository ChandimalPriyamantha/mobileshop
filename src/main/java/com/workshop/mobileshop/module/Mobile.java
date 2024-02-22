package com.workshop.mobileshop.module;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
@Entity
public class Mobile {

    @Id
    private int id;
    private String modelName;
    private String brandName;
    private String chip;
    private String display;
    private String camera;
    private String modelYear;

}
