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
        ArrayList<Media>medias = Media.getAllMedia();
        System.out.println(medias.size());
        int book_cnt = 0;
        int dvd_cnt = 0;
        int cd_cnt = 0;
        int lp_cnt = 0;
        for (Media media: medias) {
            System.out.println(media.getTitle());
            int category_id = media.getCategoryId();
            switch (category_id) {
                case 1:
                    book_cnt += 1;
                    break;
                case 2:
                    dvd_cnt += 1;
                    break;
                case 3:
                    cd_cnt += 1;
                    break;
                case 4:
                    lp_cnt += 1;
                    break;
            }
        }
        System.out.println("Book: " + book_cnt);
        System.out.println("DVD: " + dvd_cnt);
        System.out.println("CD: " + cd_cnt);
        System.out.println("LP: " + lp_cnt);
    }
}
