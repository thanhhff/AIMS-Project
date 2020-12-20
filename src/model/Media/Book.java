/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Media;

/**
 *
 * @author Toshiba T75
 */
public class Book extends PhysicalGood {
    private String author;
    private int cover_type_id;
    private String publisher;
    private String publication_date;
    private int page_number;
    private int language_id;
    private String genre;
    
    public Book(String title, int value, int price, int sale_percent, int category, String image_path, String barcode, String description, int quantity, String input_day, int width, int height, int depth, int weight, String author, int cover_type_id, String publisher, String publication_date, int page_number, int language, String genre) {
        super(title, value, price, sale_percent, category, image_path, barcode, description, quantity, input_day, width, height, depth, weight);
        this.author = author;
        this.cover_type_id = cover_type_id;
        this.publisher = publisher;
        this.publication_date = publication_date;
        this.page_number = page_number;
        this.language_id = language;
        this.genre = genre;
    }
    
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getCoverTypeID() {
        return cover_type_id;
    }

    public void setCoverTypeId(int cover_type_id) {
        this.cover_type_id = cover_type_id;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(String publication_date) {
        this.publication_date = publication_date;
    }

    public int getPageNumber() {
        return page_number;
    }

    public void setPageNumber(int page_number) {
        this.page_number = page_number;
    }

    public int getLanguageId() {
        return language_id;
    }

    public void setLanguage(int language) {
        this.language_id = language;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
