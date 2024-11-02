package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import org.springframework.stereotype.Service;

@Service
public interface ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCart
     */
    void addShoppingCart(ShoppingCartDTO shoppingCart);
}
