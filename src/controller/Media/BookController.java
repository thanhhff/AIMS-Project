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
// Book(title,value,price,sale_percent,category,image_path,barcode,description,quantity,input_day,width,height,depth,weight,author,cover_type,publisher,publication_date,page_number,language,genre) {

            Book book = new Book(title, value, price, sale_percent, category_id, image_path, barcode, description, quantity, input_day, width, height, depth, weight, author_name, cover_type_id, publisher_name, publication_date, page_number, language_id, genre);
            books.add(book);
        }
        
        return books;
    }
    
    public static int createBook(Book book) {
        int id = book.getId();
        String title = book.getTitle();
        int value = book.getValue();
        int price = book.getPrice();
        int category_id = 1;
        String image_path = book.getImagePath();
        
        return 0;
    }
}
