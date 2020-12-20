/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Cart;

import aims.PaymentService;

/**
 *
 * @author hsnt
 */
public class OrderController {
    
    public static boolean refund(String card_number, int totalBill){
        return PaymentService.refund(card_number, totalBill);
    }
}
