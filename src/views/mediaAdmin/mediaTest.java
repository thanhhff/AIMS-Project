/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.mediaAdmin;
import model.Media.*;
import controller.Media.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Toshiba T75
 */
public class mediaTest {
    public static void main(String[] args) throws SQLException {
        ArrayList<Book>books = BookController.getAllBooks();
        for (Book book: books) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Input day: " + book.getInputDay());
            System.out.println("ID: " + book.getId());
        }
        
        int numberMedias = MediaController.getNumberOfMedia();
        System.out.println("Number of media: " + numberMedias);
        
        Book book = new Book();
        book.setId(numberMedias + 1);
        book.setAuthor("Bao Anh");
        book.setBarcode("code1010");
        book.setQuantity(10);
        book.setDescription("Book about programming in java.");
        book.setWidth(20);
        book.setHeight(20);
        book.setDepth(8);
        book.setWeight(200);
        book.setValue(30000);
        book.setPrice(30000);
        book.setTitle("Programming in Java");
        book.setCategory(1);
        book.setImagePath("images/");
        book.setSalePercent(0);
        book.setInputDay("2020-12-20");
        book.setPublication_date("2019-10-10");
        book.setPageNumber(200);
        book.setCoverTypeId(1);
        book.setPublisher("NXB Spring");
        book.setLanguage(1);
        book.setGenre("Programming");
        
        int mediaResult = MediaController.insertMedia(book.getTitle(), book.getValue(), book.getPrice(), book.getSalePercent(), book.getCategoryId(), book.getImagePath());
        if (mediaResult != 0) {
            System.out.println("Add to books table success");
        } else {
            System.out.println("Add to books table failed");
        }
    }
}
