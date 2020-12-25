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
        DVD dvd = new DVD();
        dvd.setTitle("Test Insert DVD new");
        dvd.setValue(10000);
        dvd.setPrice(100000);
        dvd.setCategory(1);
        dvd.setQuantity(10);
        dvd.setInputDay("2020-10-10");
        dvd.setBarcode("testdvdcode");
        dvd.setLanguageId(1);
        dvd.setDvdTypeID(1);
//        dvd.setPublicationDate("2020-10-10");
        
        MediaController.insert(dvd);
    }
}
