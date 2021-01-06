/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.MediaList;

import controller.Media.MediaController;
import controller.Search.SearchController;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Media.Media;
import model.Media.MediaItem;

/**
 *
 * @author User
 */
public class mediaListPanel extends javax.swing.JPanel {
     private ArrayList<MediaItem> list = new ArrayList<MediaItem>();
     private int status;  // 1 random, 2 search, 3 book, 4 cd, 5 dvd, 6 lp
     private int page; // so thu tu trang
     private String searchStr = null;
     
    /**
     * Creates new form categoryPanel
     */
    public mediaListPanel() {
        initComponents();
        //setLayout(null);
        fill();
    }
     public mediaListPanel(String search) {
         searchStr = search;
         initComponents();
        //setLayout(null);
         fill(search);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void fill()
    {   
        status = 1;
        page = 1;
        list.removeAll(list);
        SearchController.SearchRandom(list);
        mediaList media = new mediaList(list);
        mediaListPanel.setLayout(new BorderLayout());
        mediaListPanel.add(media, BorderLayout.CENTER);
        mediaListPanel.updateUI();
    }
    public void fill(String search)
    {
        status = 2;
        page = 1;
        list.removeAll(list);
        SearchController.SearchUser(list,search);
        mediaList media = new mediaList(list);
        mediaListPanel.setLayout(new BorderLayout());
        mediaListPanel.add(media, BorderLayout.CENTER);
        mediaListPanel.updateUI();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        mediaListPanel = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        book = new javax.swing.JButton();
        cd = new javax.swing.JButton();
        dvd = new javax.swing.JButton();
        lp = new javax.swing.JButton();
        Sau = new javax.swing.JButton();
        truoc = new javax.swing.JButton();
        high = new javax.swing.JButton();
        low = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Category");

        javax.swing.GroupLayout mediaListPanelLayout = new javax.swing.GroupLayout(mediaListPanel);
        mediaListPanel.setLayout(mediaListPanelLayout);
        mediaListPanelLayout.setHorizontalGroup(
            mediaListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        mediaListPanelLayout.setVerticalGroup(
            mediaListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        book.setText("Book");
        book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookActionPerformed(evt);
            }
        });

        cd.setText("CD");
        cd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cdActionPerformed(evt);
            }
        });

        dvd.setText("DVD");
        dvd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dvdActionPerformed(evt);
            }
        });

        lp.setText("LP");
        lp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lpActionPerformed(evt);
            }
        });

        Sau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/right-arrow.png"))); // NOI18N
        Sau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SauActionPerformed(evt);
            }
        });

        truoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/left-arrow.png"))); // NOI18N
        truoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                truocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(cd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dvd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(truoc)
                        .addGap(18, 18, 18)
                        .addComponent(Sau)
                        .addGap(0, 28, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dvd, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lp, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(truoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sau, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        high.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/up-price.png"))); // NOI18N
        high.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highActionPerformed(evt);
            }
        });

        low.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/images/low-price.png"))); // NOI18N
        low.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(high, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(low, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(mediaListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(high, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(low, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mediaListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookActionPerformed
        // TODO add your handling code here:
        status = 3;
        page = 1;
        mediaListPanel.removeAll();
         list.removeAll(list);
        SearchController.SearchBook(list);
        mediaList media = new mediaList(list);
        mediaListPanel.setLayout(new BorderLayout());
        mediaListPanel.add(media, BorderLayout.CENTER);
        mediaListPanel.updateUI();
    }//GEN-LAST:event_bookActionPerformed

    private void cdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cdActionPerformed
        // TODO add your handling code here:
        status = 4;
        page = 1;
        mediaListPanel.removeAll();
       list.removeAll(list);
        SearchController.SearchCd(list);
        mediaList media = new mediaList(list);
        mediaListPanel.setLayout(new BorderLayout());
        mediaListPanel.add(media, BorderLayout.CENTER);
        mediaListPanel.updateUI();
    }//GEN-LAST:event_cdActionPerformed

    private void dvdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dvdActionPerformed
        // TODO add your handling code here:
        status = 5;
        page = 1;
        mediaListPanel.removeAll();
      list.removeAll(list);
        SearchController.SearchDvd(list);
        mediaList media = new mediaList(list);
        mediaListPanel.setLayout(new BorderLayout());
        mediaListPanel.add(media, BorderLayout.CENTER);
        mediaListPanel.updateUI();
    }//GEN-LAST:event_dvdActionPerformed

    private void jButton5bookrformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void lpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lpActionPerformed
        // TODO add your handling code here:
        status = 6;
        page = 1;
        mediaListPanel.removeAll();
        list.removeAll(list);
        SearchController.SearchLp(list);
        mediaList media = new mediaList(list);
        mediaListPanel.setLayout(new BorderLayout());
        mediaListPanel.add(media, BorderLayout.CENTER);
        mediaListPanel.updateUI();
    }//GEN-LAST:event_lpActionPerformed

    private void highActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highActionPerformed
        // TODO add your handling code here:
        mediaListPanel.removeAll();
        list = MediaController.sortHighMediaPrice(list);
        mediaList media = new mediaList(list);
        mediaListPanel.setLayout(new BorderLayout());
        mediaListPanel.add(media, BorderLayout.CENTER);
        mediaListPanel.updateUI();
        
    }//GEN-LAST:event_highActionPerformed

    private void lowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lowActionPerformed
        // TODO add your handling code here:
        mediaListPanel.removeAll();
        list = MediaController.sortLowMediaPrice(list);
        mediaList media = new mediaList(list);
        mediaListPanel.setLayout(new BorderLayout());
        mediaListPanel.add(media, BorderLayout.CENTER);
        mediaListPanel.updateUI();
    }//GEN-LAST:event_lowActionPerformed

    private void SauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SauActionPerformed
        // TODO add your handling code here:
         ArrayList<MediaItem> list_tmp = new ArrayList<MediaItem>();
         mediaListPanel.removeAll();
         //list.removeAll(list);
         SearchController.SearchNext(list_tmp, searchStr, status, page);
         if(list_tmp.size() != 0)
         {  
             list.removeAll(list);
             for(int i = 0 ; i < list_tmp.size(); i++)
             {
                 list.add(list_tmp.get(i));
             }
            page +=1;
            mediaList media = new mediaList(list);
            mediaListPanel.setLayout(new BorderLayout());
            mediaListPanel.add(media, BorderLayout.CENTER);
            mediaListPanel.updateUI();
         }
         else
               JOptionPane.showMessageDialog(null, "No more products", "Error", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_SauActionPerformed

    private void truocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_truocActionPerformed
        // TODO add your handling code here:
        if(page != 1)
        {
         ArrayList<MediaItem> list_tmp = new ArrayList<MediaItem>();
         mediaListPanel.removeAll();
         SearchController.SearchPrevious(list_tmp, searchStr, status, page);    
         if(list.size() != 0)
         {
            list.removeAll(list);
             for(int i = 0 ; i < list_tmp.size(); i++)
             {
                 list.add(list_tmp.get(i));
             } 
            page -=1;
            mediaList media = new mediaList(list);
            mediaListPanel.setLayout(new BorderLayout());
            mediaListPanel.add(media, BorderLayout.CENTER);
            mediaListPanel.updateUI();
         }
         else
               JOptionPane.showMessageDialog(null, "You are on the first page", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "You are on the first page", "Error", JOptionPane.ERROR_MESSAGE);
         
    }//GEN-LAST:event_truocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Sau;
    private javax.swing.JButton book;
    private javax.swing.JButton cd;
    private javax.swing.JButton dvd;
    private javax.swing.JButton high;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton low;
    private javax.swing.JButton lp;
    private javax.swing.JPanel mediaListPanel;
    private javax.swing.JButton truoc;
    // End of variables declaration//GEN-END:variables
}
