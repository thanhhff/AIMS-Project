package controller.Cart;


import aims.PaymentService;
import db.ConnectSQL;
import java.util.List;
import model.Cart.CartItem;
import model.Cart.Order;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hsnt
 */
public class CartController {
    
    public static int getShipFee(List<CartItem> cartItems){
        int totalBill = 0;
        totalBill = cartItems.stream().map((cartItem) -> cartItem.getPrice() * cartItem.getQuantity()).reduce(totalBill, Integer::sum);
        if(totalBill >= 100000){
            return 0;
        }
        return 100000;
    }
    public static void addCartItem(int user_id, int media_id, int price){
        CartItem.creat(user_id, media_id, price);
    }
    public static void deleteCartItem(CartItem cartItem){
        cartItem.delete();
    }
    public static void updateQuantity(CartItem cartItem,int quantily){
        if(quantily == 0){
            deleteCartItem(cartItem);
        }else{
            cartItem.update(quantily);
        }
    }
    public static void checkOut(int user_id,int ship_fee, String shipping_info, String cart_number){
        Order order = new Order(user_id, ship_fee, shipping_info, cart_number);
    }
    public static boolean payment(String card_number, int totalBill){
        return PaymentService.check(card_number, totalBill);
    }
    
}
