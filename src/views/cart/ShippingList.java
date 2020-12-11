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

/**
 *
 * @author hsnt
 */
public class ShippingList extends JPanel{

    public static final int WIDTH = ShippingInfo.WIDTH + 40;
    private JPanel listShipInfo = new JPanel(new GridLayout(0,1));
    private ButtonGroup buttonGroup = new ButtonGroup();
    private List<ShippingInfo> listInfo = new ArrayList<ShippingInfo>();
    public ShippingList() {
        setLayout(new GridLayout(1,0));
        add(new JScrollPane(listShipInfo));
        for(int i = 0 ; i < 2 ; i++){
            ShippingInfo shippingInfo = new ShippingInfo(
                    "Hoang Trung Hieu","0352587779","Thành phố Hà Nội","Quận Thanh Xuân","Phường Khương Trung");
            listShipInfo.add(shippingInfo);
            buttonGroup.add(shippingInfo.getRadioButton());
            if (i == 0 ){
                shippingInfo.getRadioButton().setSelected(true);
            }
            listInfo.add(shippingInfo);
        }  
    }
    private ShippingInfo selectedInfo(){
        for(ShippingInfo shippingInfo: listInfo){
            if(shippingInfo.getRadioButton().isSelected()){
                return shippingInfo;
            }
        }
        return null;
    }
    public String getNamePhone(){
        return selectedInfo().getNamePhone();
    }
    public String getProvince(){
        return selectedInfo().getProvince();
    }
    public String getDistrict(){
        return selectedInfo().getDistrict();
    }
    public String getWard(){
        return selectedInfo().getWard();
    }
}
