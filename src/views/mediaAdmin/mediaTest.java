/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.mediaAdmin;
import model.Media.*;
import controller.Media.*;
import java.util.ArrayList;

/**
 *
 * @author Toshiba T75
 */
public class mediaTest {
    public static void main(String[] args)  {
        String track_list = "Chung ta cua hien tai,Chay ngay di";
        String[] splitArr = track_list.split(",");
        for (String s: splitArr) {
            System.out.println(s);
        }
    }
}
