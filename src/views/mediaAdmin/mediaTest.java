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
        Book book = new Book();
        book.setTitle("Test Insert Book");
        book.setValue(10000);
        book.setPrice(100000);
        book.setCategory(1);
        book.setQuantity(10);
        book.setInputDay("2020-10-10");
        book.setBarcode("testbookcode");
        book.setPageNumber(100);
        book.setCoverTypeId(1);
        book.setLanguage(1);
        book.setPublication_date("2020-10-10");
        
        MediaController.insert(book);
    }
}
