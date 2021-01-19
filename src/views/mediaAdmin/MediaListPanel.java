/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.mediaAdmin;

import aims.FormatNumber;
import controller.Media.MediaController;
import controller.User.UserController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import model.Media.Book;
import model.Media.CD;
import model.Media.DVD;
import model.Media.LP;
import model.Media.Media;
import views.order.OrderDetail;

/**
 *
 * @author hsnt
 */
public class MediaListPanel extends javax.swing.JPanel {

    /**
     * Creates new form Med
     */
    private JTable table;
    private List<Media> medias;


    public MediaListPanel(List<Media> medias) {
        this.medias = medias;
        setLayout(null);
        initComponents();
        fillTable();

    }

    private void fillTable() {
        String[] columnNames = {"MediaID", "Title", "Category", "Value(VND)", "Price(VND)", "Select"};
        int i = medias.size();
        int j = 6;
        Object[][] data = new Object[i][j];
        int index = 0;
        String[] categories = {"Book", "DVD", "CD", "LP"};
        for (Media media : medias) {
            data[index][0] = media.getId();
            data[index][2] = categories[media.getCategoryId() - 1];
            data[index][1] = media.getTitle();
            data[index][3] = FormatNumber.formatString(media.getValue() + "");
            data[index][4] = FormatNumber.formatString(media.getPrice() + "");
            data[index++][5] = false;
        }
        table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        table.setFillsViewportHeight(true);
        table.setBounds(12, 12 + 32 + 35 + 12, 669, 434 - 35);
        this.add(table);
        this.add(table.getTableHeader());
        table.getTableHeader().setBounds(12, 12 + 35 + 12, 669, 35);
        
        // new table change code
        table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        table.setColumnSelectionAllowed(false);
        table.setRowSelectionAllowed(true);
        
        // set column width
        table.getColumnModel().getColumn(0).setPreferredWidth(20);
        table.getColumnModel().getColumn(1).setPreferredWidth(150);
        table.getColumnModel().getColumn(2).setPreferredWidth(50);
        table.getColumnModel().getColumn(3).setPreferredWidth(30);
        table.getColumnModel().getColumn(4).setPreferredWidth(30);
        table.getColumnModel().getColumn(5).setPreferredWidth(20);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
        
        this.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        media_add_button = new javax.swing.JButton();
        media_edit_button = new javax.swing.JButton();
        media_show_button = new javax.swing.JButton();
        media_delete_button = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        mediaSearchButton = new javax.swing.JButton();

        media_add_button.setText("Add");
        media_add_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                media_add_buttonActionPerformed(evt);
            }
        });

        media_edit_button.setText("Edit");
        media_edit_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                media_edit_buttonActionPerformed(evt);
            }
        });

        media_show_button.setText("Show");
        media_show_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                media_show_buttonActionPerformed(evt);
            }
        });

        media_delete_button.setText("Delete");
        media_delete_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                media_delete_buttonActionPerformed(evt);
            }
        });

        mediaSearchButton.setText("Search");
        mediaSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mediaSearchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(mediaSearchButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(media_delete_button, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(media_show_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(media_edit_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(media_add_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(media_add_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(media_edit_button)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(media_show_button))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchField)
                            .addComponent(mediaSearchButton, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(media_delete_button)
                .addContainerGap(325, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void media_edit_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_media_edit_buttonActionPerformed
        int[] rows = table.getSelectedRows();
        if (rows.length > 1) {
            JOptionPane.showMessageDialog(null, "Please just select only one media for editing!");
        } else {
            int row = table.getSelectedRow();

            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Please select media");
            } else {
                Media media = medias.get(row);
                int category_id = media.getCategoryId();
                MediaAddFrame media_frame;
                switch (category_id) {
                    case 1:
                        Book book = (Book) media;
                        media_frame = new MediaAddFrame(book, true);
                        break;
                    case 2:
                        DVD dvd = (DVD) media;
                        media_frame = new MediaAddFrame(dvd, true);
                        break;
                    case 3:
                        CD cd = (CD) media;
                        media_frame = new MediaAddFrame(cd, true);
                        break;
                    case 4:
                        LP lp = (LP) media;
                        media_frame = new MediaAddFrame(lp, true);
                        break;
                    default:
                        Book new_book = (Book) media;
                        media_frame = new MediaAddFrame(new_book, true);
                }
                media_frame.setLocationRelativeTo(null);
                media_frame.setVisible(true);
                media_frame.getBackButton().addActionListener((ActionEvent e) -> {
                    this.removeAll();
                    medias = Media.getAllMedia();
                    initComponents();
                    this.fillTable();
                    this.updateUI();
                });
            }
        }
    }//GEN-LAST:event_media_edit_buttonActionPerformed

    private void media_show_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_media_show_buttonActionPerformed
        int[] rows = table.getSelectedRows();
        if (rows.length > 1) {
            JOptionPane.showMessageDialog(null, "Please just select only one media for editing!");
        } else {
            int row = table.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "Please select media");
            } else {
                Media media = medias.get(row);
                int category_id = media.getCategoryId();
                MediaAddFrame media_frame;

                switch (category_id) {
                    case 1:
                        Book book = (Book) media;
                        media_frame = new MediaAddFrame(book, false);
                        break;
                    case 2:
                        DVD dvd = (DVD) media;
                        media_frame = new MediaAddFrame(dvd, false);
                        break;
                    case 3:
                        CD cd = (CD) media;
                        media_frame = new MediaAddFrame(cd, false);
                        break;
                    case 4:
                        LP lp = (LP) media;
                        media_frame = new MediaAddFrame(lp, false);
                        break;
                    default:
                        Book new_book = (Book) media;
                        media_frame = new MediaAddFrame(new_book, false);
                }
                media_frame.setLocationRelativeTo(null);
                media_frame.setVisible(true);
            }
        }
    }//GEN-LAST:event_media_show_buttonActionPerformed

    private void media_delete_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_media_delete_buttonActionPerformed
        // TODO add your handling code here:
        
        // check number of actions greater than 30?
        int numActions = UserController.getNumberOfActionsByCurrentAdmin();
        if (numActions > 30) {
            JOptionPane.showMessageDialog(null, "Admin cannot update/delete more than 30 medias!");
            return;
        }
        
        int[] rows = table.getSelectedRows();
        if (rows.length == 0) {
            JOptionPane.showMessageDialog(null, "Please select media");
        } else if (rows.length > 10) {
            JOptionPane.showMessageDialog(null, "Cannot delete more than 10 medias at a time");
        } else {
            ArrayList<Integer> del_mediaids = new ArrayList<Integer>();
            for (int r: rows) {
                Media media = medias.get(r);
                del_mediaids.add(media.getId());
            }
            int isDelete = JOptionPane.showConfirmDialog(null, "Are you sure to delete this media?");
            if (isDelete == 0) {
                MediaController.deleteListMedias(del_mediaids);
                this.removeAll();
                medias = Media.getAllMedia();
                initComponents();
                this.fillTable();
                this.updateUI();
            }
        }
    }//GEN-LAST:event_media_delete_buttonActionPerformed

    private void media_add_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_media_add_buttonActionPerformed
        // TODO add your handling code here:
        MediaAddFrame media_frame = new MediaAddFrame();
        media_frame.setLocationRelativeTo(null);
        media_frame.setVisible(true);
        media_frame.getBackButton().addActionListener((ActionEvent e) -> {
            this.removeAll();
            medias = Media.getAllMedia();
            initComponents();
            this.fillTable();
            this.updateUI();
        });
    }//GEN-LAST:event_media_add_buttonActionPerformed

    private void mediaSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mediaSearchButtonActionPerformed
        // TODO add your handling code here:
        String searchText = searchField.getText();
        if (searchText.length() == 0) {
            JOptionPane.showMessageDialog(null, "Enter media title!");
        } else {
            this.removeAll();
            medias = Media.getMediasByTitle(searchText);
            initComponents();
            this.fillTable();
            this.updateUI();
        }
    }//GEN-LAST:event_mediaSearchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton mediaSearchButton;
    private javax.swing.JButton media_add_button;
    private javax.swing.JButton media_delete_button;
    private javax.swing.JButton media_edit_button;
    private javax.swing.JButton media_show_button;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}
