/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Media;
import model.Media.Book;
import java.util.ArrayList;

/**
 *
 * @author Toshiba T75
 */

// SELECT medias.title, medias.value, medias.price, medias.category_id, medias.image_path, physicalgoods.*, books.* FROM books LEFT JOIN physicalgoods ON books.media_id = physicalgoods.media_id LEFT JOIN medias ON physicalgoods.media_id = medias.media_id;

// insert into physicalgoods (description, quantity, input_day, media_id, width, height, depth, weight, barcode) values ();

public class BookController {
    public static ArrayList<Book> getAllBooks(){
        return Book.getAllBooks();
    }
    
    
    
    public static void insertBook(Book book) {
        int mediaResult = MediaController.insertMedia(book.getTitle(), book.getValue(), book.getPrice(), 0, book.getCategoryId(), book.getImagePath());
        int physicalResult = PhysicalController.insertPhysical(book.getDescription(), book.getQuantity(), book.getInputDay(), book.getId(), book.getWidth(), book.getHeight(), book.getDepth(), book.getWeight(), book.getBarcode());
        int bookResult = book.insertBook();
    }
    
    public static String getPublicationDateFromDB(int media_id) {
        return Book.getPublicationDateFromDB(media_id);
    }
    
    public static int getPageNumberFromDB(int media_id) {
        return Book.getPageNumberFromDB(media_id);
    }
    
    public static int getCoverTypeIdFromDB(int media_id) {
        return Book.getCoverTypeIdFromDB(media_id);
    }
    
    public static int getLanguageIdFromDB(int media_id) {
        return Book.getLanguageIdFromDB(media_id);
    }
    
    public static String getPublisherNameFromDB(int media_id) {
        return Book.getPublisherNameFromDB(media_id);
    }
    
    public static String getAuthorNameFromDB(int media_id) {
        return Book.getAuthorNameFromDB(media_id);
    }
    
    public static String getGenreFromDB(int media_id) {
        return Book.getGenreFromDB(media_id);
    }
}
