package com.redislab.edu.redi2read.models;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import lombok.Data;
import lombok.Singular;
import lombok.Builder;

@Data
@Builder
public class Cart {
    private String id;
    private String userId;

    @Singular
    private Set<CartItem> cartItems;
  
    public Integer count() {
        return getCartItems().size();
    }

    public Double getTotal() {
        return getCartItems()
            .stream()
            .mapToDouble(ci -> ci.getPrice() *ci.getQuantity()) 
            .sum();
    }
}
