/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.Media;
import model.Media.Book;
import db.ConnectSQL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Toshiba T75
 */

// SELECT medias.title, medias.value, medias.price, medias.category_id, medias.image_path, physicalgoods.*, books.* FROM books LEFT JOIN physicalgoods ON books.media_id = physicalgoods.media_id LEFT JOIN medias ON physicalgoods.media_id = medias.media_id;

// insert into physicalgoods (description, quantity, input_day, media_id, width, height, depth, weight, barcode) values ();

public class BookController {
    public static ArrayList<Book> getAllBooks() throws SQLException {
        ArrayList<Book> books = new ArrayList<Book>();
        String query = "SELECT `medias`.title, `medias`.value, `medias`.price, `medias`.category_id, `medias`.image_path, `physicalgoods`.*, `books`.* FROM `books` LEFT JOIN `physicalgoods` ON `books`.media_id = `physicalgoods`.media_id LEFT JOIN `medias` ON `physicalgoods`.media_id = `medias`.media_id;";

        ResultSet rs = ConnectSQL.sqlQuery(query);
        
        while (rs.next()) {
            String title = rs.getString(1);
            int value = rs.getInt(2);
            int price = rs.getInt(3);
            int category_id = rs.getInt(4);
            String image_path = rs.getString(5);
            String description = rs.getString(6);
            int quantity = rs.getInt(7);
            String input_day = rs.getString(9);
            int media_id = rs.getInt(10);
            int width = rs.getInt(11);
            int height = rs.getInt(12);
            int depth = rs.getInt(13);
            int weight = rs.getInt(14);
            String barcode = rs.getString(15);
            String publication_date = rs.getString(16);
            int page_number = rs.getInt(17);
            int cover_type_id = rs.getInt(19);
            String publisher_name = rs.getString(20);
            int language_id = rs.getInt(21);
            String author_name = rs.getString(22);
            String genre = rs.getString(23);
            int sale_percent = 0;
            Book book = new Book(media_id, title, value, price, sale_percent, category_id, image_path, barcode, description, quantity, input_day, width, height, depth, weight, author_name, cover_type_id, publisher_name, publication_date, page_number, language_id, genre);
            books.add(book);
        }
        
        return books;
    }
    
    
    
    public static int createBook(Book book) throws SQLException {
        String title = book.getTitle();
        int value = book.getValue();
        int price = book.getPrice();
        int sale_percent = book.getSalePercent();
        int category_id = book.getCategoryId();
        String image_path = book.getImagePath();
        String barcode = book.getBarcode();
        String description = book.getDescription();
        int quantity = book.getQuantity();
        String input_day = book.getInputDay();
        int width = book.getWeight();
        int height = book.getHeight();
        int depth = book.getDepth();
        int weight = book.getWeight();
        String author_name = book.getAuthor();
        int cover_type_id = book.getCoverTypeID();
        String publisher_name = book.getPublisher();
        String publication_date = book.getPublication_date();
        int page_number = book.getPageNumber();
        int language_id = book.getLanguageId();
        String genre = book.getGenre();
        
        int media_id = MediaController.getNumberOfMedia() + 1;
        book.setId(media_id);
        
        int media_result = MediaController.insertMedia(title, value, price, sale_percent, category_id, image_path);
        if (media_result == 0) {
            JOptionPane.showMessageDialog(null, "Cannot insert into Medias table!");
            return 0;
        }
        
        int physical_result = PhysicalController.insertPhysical(description, quantity, input_day, media_id, width, height, depth, weight, barcode);
        if (physical_result == 0) {
            JOptionPane.showMessageDialog(null, "Cannot insert into Physicalgoods table!");
            return 0;
        }
        
        String book_query = "INSERT INTO Books (publication_date, page_number, media_id, cover_type_id, publisher_name, language_id, author_name, genre VALUES ('"
                + publication_date + "', " + page_number + ", " + media_id + ", " + cover_type_id + ", '" + publisher_name + "', " + language_id + ", '" + author_name +"', '" + genre + "');";
        int book_result = ConnectSQL.sqlUpdate(book_query);
        if (book_result == 0) {
            JOptionPane.showMessageDialog(null, "Cannot insert into Books table!");
            return 0;
        }
        
        return 0;
    }
}
