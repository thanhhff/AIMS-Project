/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.cart;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import model.Cart.ShippingInfo;

/**
 *
 * @author hsnt
 */
public class ShippingList extends JPanel{

    public static final int WIDTH = ShippingInfoPanel.WIDTH + 40;
    private JPanel listShipInfo = new JPanel(new GridLayout(0,1));
    private ButtonGroup buttonGroup = new ButtonGroup();
    private List<ShippingInfoPanel> listInfo = new ArrayList<ShippingInfoPanel>();
    public ShippingList(int [] shipping_info_list) {
        setLayout(new GridLayout(1,0));
        add(new JScrollPane(listShipInfo));
        int i = 0;
        for(int shipping_id : shipping_info_list){        
            ShippingInfoPanel shippingInfo = new ShippingInfoPanel(shipping_id);
            listShipInfo.add(shippingInfo);
            buttonGroup.add(shippingInfo.getRadioButton());
            if (i == 0 ){
                shippingInfo.getRadioButton().setSelected(true);
                i = i + 1;
            }
            listInfo.add(shippingInfo);   
        }
    }
    public ShippingInfo selectedInfo(){
        for(ShippingInfoPanel shippingInfo: listInfo){
            if(shippingInfo.getRadioButton().isSelected()){
                return shippingInfo.getShippingInfo();
            }
        }
        return null;
    }
}
