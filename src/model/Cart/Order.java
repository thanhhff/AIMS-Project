/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Cart;

import db.ConnectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.User.User;

/**
 *
 * @author hsnt
 */
public class Order {
    private static final int CANCEL = 1;
    private static final int SUCCESS = 1;
    private int order_id;
    private int ship_fee;
    private int order_state_id;
    private String shipping_info;
    private int user_id;
    private String cart_number;
    
    public Order(int user_id,int ship_fee, String shipping_info, String cart_number){
        this.user_id = user_id;
        this.ship_fee = ship_fee;
        this.shipping_info = shipping_info;
        this.cart_number = cart_number;
        this.order_state_id = SUCCESS;
        save();
        this.order_id = getID();
        User user = new User(user_id);
        for(CartItem cartItem : user.getCartItems()){
            OrderItem orderItem = new OrderItem(cartItem.getMedia_id(),order_id, cartItem.getPrice(), cartItem.getQuantity());
            orderItem.save();
            cartItem.delete();
        }
    }
    public void save(){
        ConnectSQL.sqlQueryUpdate("insert into Orders "
                + "(`ship_fee`,`order_state_id`,`user_id`,`shipping_info`,`cart_number`) "
                + "values("+ ship_fee+ ","+ order_state_id+ ","+ user_id+ ",'"+ shipping_info+ "','"+ cart_number+ "')");
    }
    private int getID(){
        try {
            ResultSet rs = ConnectSQL.sqlQuery("select * from Orders order by order_id desc");
            while(rs.next()){
                return Integer.parseInt(rs.getString("order_id"));
            }
            return 0;
        } catch (SQLException ex) {
            return 0;
        }
    }

    public int getShip_fee() {
        return ship_fee;
    }

    public int getOrder_state_id() {
        return order_state_id;
    }

    public String getShipping_info() {
        return shipping_info;
    }
    
}
