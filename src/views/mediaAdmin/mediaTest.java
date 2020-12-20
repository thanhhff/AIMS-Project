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
        try {
            ArrayList<Book>books = BookController.getAllBooks();
            for (Book book: books) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println("Input day: " + book.getInputDay());
                System.out.println("ID: " + book.getId());
            }
        } catch (Exception e) {
            
        }
        
        
        int numberMedias = MediaController.getNumberOfMedia();
        System.out.println("Number of media: " + numberMedias);
        
        int maxId = MediaController.getMaxID();
        System.out.println("Max ID: " + maxId);
        
        Book book = new Book();
        String description = "Book about programming with Pytorch";
        book.setDescription(description);
        int quantity = 10;
        book.setQuantity(quantity);
        String input_day = "2019-10-10";
        book.setInputDay(input_day);
        int media_id = Book.getMaxID() + 1;
        book.setId(media_id);
        int width = 0;
        book.setWidth(width);
        int height = 0;
        book.setHeight(height);
        int depth = 0;
        book.setDepth(depth);
        int weight = 200;
        book.setWeight(weight);
        String barcode = "CodeCpp";
        book.setBarcode(barcode);
        String title = "Programming with PyTorch";
        book.setTitle(title);
        int value = 20000;
        book.setValue(value);
        int price = 20000;
        book.setPrice(price);
        int sale_percent = 0;
        book.setSalePercent(sale_percent);
        int category_id = 1;
        book.setCategory(category_id);
        String image_path = String.valueOf(media_id) + ".png";
        book.setImagePath(image_path);
        String publication_date = "2020-11-10";
        book.setPublication_date(publication_date);
        int page_number = 100;
        book.setPageNumber(page_number);
        int cover_type_id = 1;
        book.setCoverTypeId(cover_type_id);
        String publisher_name = "NXB Hedspi";
        book.setPublisher(publisher_name);
        int language_id = 1;
        book.setLanguage(language_id);
        String author_name = "Bao Anh";
        book.setAuthor(author_name);
        String genre = "Programming";
        book.setGenre(genre);
        
        BookController.insertBook(book);
       
        
//        int mediaResult = MediaController.insertMedia(title, value, price, sale_percent, category_id, image_path);
        
//        int physicalResult = PhysicalController.insertPhysical(description, quantity, input_day, media_id, width, height, depth, weight, barcode);
//        if (physicalResult != 0) {
//            System.out.println("Success");
//        } else {
//            System.out.println("Failed");
//        }
    }
}
