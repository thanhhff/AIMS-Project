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
    
    private PaymentService paymentService;
    
    public OrderController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    
    
    public boolean refund(String card_number, int totalBill){
        return paymentService.refund(card_number, totalBill);
    }
}
