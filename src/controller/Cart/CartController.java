package controller.Cart;


import db.ConnectSQL;
import java.util.List;
import model.Cart.CartItem;




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

    public int getShipFee(List<CartItem> cartItems){
        int totalBill = 0;
        totalBill = cartItems.stream().map((cartItem) -> cartItem.getPrice() * cartItem.getQuantity()).reduce(totalBill, Integer::sum);
        if(totalBill >= 100000){
            return 0;
        }
        return 100000;
    }
    public void deleteCartItem(CartItem cartItem){
        int user_id = cartItem.getUser_id();
        int media_id = cartItem.getMedia_id();
        ConnectSQL.sqlQueryUpdate(
                "delete from CartItems where media_id = " + media_id + " and user_id = " + user_id); 
    }
    public void updateQuantity(CartItem cartItem,int quantily){
        if(quantily == 0){
            deleteCartItem(cartItem);
        }else{
            cartItem.update(quantily);
        }
    }
}
