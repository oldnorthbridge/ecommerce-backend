package com.zosh.request;

import com.zosh.model.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateProductRequest {
    private String title;

    private String description;

    private int price;

    private int discountedPrice;

    private int discountPercent;

    private int quantity;

    private String brand;

    private String color;

    private Set<Size> size=new HashSet<>();

    private String imageUrl;

    private String topLevelCategory;
    private String secondLevelCategory;
    private String thirdLevelCategory;

}
