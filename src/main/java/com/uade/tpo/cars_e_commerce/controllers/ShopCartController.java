package com.uade.tpo.cars_e_commerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.uade.tpo.cars_e_commerce.entity.ShopCart;
import com.uade.tpo.cars_e_commerce.exceptions.ResourceNotFoundException;
import com.uade.tpo.cars_e_commerce.service.ShopCartService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
@RequestMapping("cart")
public class ShopCartController {

    @Autowired
    private final ShopCartService shopCartService;

    @GetMapping("/{cartId}/my-cart")
    public ResponseEntity<ShopCart> getCart(@PathVariable Long shopCartid) {
        try {
            ShopCart cart = shopCartService.getCart(shopCartid);
            return ResponseEntity.ok(cart);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{cartId}/clear-cart")
    public ResponseEntity<Object> clearCart (@PathVariable Long cartId) {
        try {
            ShopCart cart = shopCartService.clearCart(cartId);
            return ResponseEntity.ok(cart);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{cartId}/cart/total-price")
    public ResponseEntity<Double> getTotalPrice(@PathVariable Long cartId) {
        try {
            Double totalPrice = shopCartService.getTotalPrice(cartId);
            return ResponseEntity.ok(totalPrice);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }
    
}   
