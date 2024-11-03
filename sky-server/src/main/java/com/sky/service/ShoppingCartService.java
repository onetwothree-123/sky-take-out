package com.sky.service;

import com.sky.dto.ShoppingCartDTO;
import com.sky.entity.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCart
     */
    void addShoppingCart(ShoppingCartDTO shoppingCart);

    /**
     * 查看购物车
     * @return
     */
    List<ShoppingCart> showShoppingCart();

    /**
     * 删除购物车商品
     * @param shoppingCartDTO
     */
    void delete(ShoppingCartDTO shoppingCartDTO);

    /**
     * 清空购物车
     */
    void deleteByUserId();
}
