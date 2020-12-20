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
        }
    }
}
