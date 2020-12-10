/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aims;

import java.text.DecimalFormat;

/**
 *
 * @author hsnt
 */
public class FormatNumber {
    
    private static final DecimalFormat decimalFormat = new DecimalFormat();

    public FormatNumber() {
        decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
    }
    public static String formatString(String string){
        return decimalFormat.format(Integer.parseInt(string)) + "";
    }
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("-2000"));
    }
}
