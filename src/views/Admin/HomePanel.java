/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.Admin;

import controller.Sale.SalesController;
import controller.Search.SearchController;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Cart.Order;
import model.Media.Media;
import model.Sale.Sale;
import model.User.User;
import views.Admin.Sales.MediaSaleItemPanel;
import views.Admin.Sales.MediaSalePanel;
import views.Admin.Sales.SaleListPanel;
import views.Admin.User.UserPanel;
import views.mediaAdmin.MediaPanel;
import views.order.OrderListPanel;

/**
 *
 * @author thanhhff
 */
public class HomePanel extends javax.swing.JPanel {

    /**
     * Creates new form HomePanel
     */
    public HomePanel() {
        initComponents();
        fill();
    }

    public void fill() {
        FillInfor.removeAll();
        ArrayList<Media> medias = Media.getAllMedia();
        MediaPanel mediaPanel = new MediaPanel(medias);
        FillInfor.setLayout(new BorderLayout());
        FillInfor.add(mediaPanel, BorderLayout.CENTER);
        FillInfor.updateUI();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Sidebar = new javax.swing.JPanel();
        jButtonProduct = new javax.swing.JButton();
        jButtonSale = new javax.swing.JButton();
        jButtonOrder = new javax.swing.JButton();
        jButtonUser = new javax.swing.JButton();
        FillInfor = new javax.swing.JPanel();

        Sidebar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonProduct.setText("Product");
        jButtonProduct.setToolTipText("");
        jButtonProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductActionPerformed(evt);
            }
        });

        jButtonSale.setText("Sales");
        jButtonSale.setToolTipText("");
        jButtonSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaleActionPerformed(evt);
            }
        });

        jButtonOrder.setText("Order");
        jButtonOrder.setToolTipText("");
        jButtonOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrderActionPerformed(evt);
            }
        });

        jButtonUser.setText("User");
        jButtonUser.setToolTipText("");
        jButtonUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SidebarLayout = new javax.swing.GroupLayout(Sidebar);
        Sidebar.setLayout(SidebarLayout);
        SidebarLayout.setHorizontalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSale, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        SidebarLayout.setVerticalGroup(
            SidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SidebarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButtonProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSale, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonUser, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );

        FillInfor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout FillInforLayout = new javax.swing.GroupLayout(FillInfor);
        FillInfor.setLayout(FillInforLayout);
        FillInforLayout.setHorizontalGroup(
            FillInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 891, Short.MAX_VALUE)
        );
        FillInforLayout.setVerticalGroup(
            FillInforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(FillInfor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FillInfor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductActionPerformed
        // TODO add your handling code here:
        fill();
    }//GEN-LAST:event_jButtonProductActionPerformed

    private void jButtonSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaleActionPerformed
        // TODO add your handling code here:
        FillInfor.removeAll();
        FillInfor.setLayout(null);
        JTextField searchField = new JTextField();
        JButton searchButton = new JButton();
        searchButton.setText("Search");
        searchField.setFocusable(true);
        searchButton.setFocusPainted(false);
        searchField.setBounds(50, 50, 300, 40);
        searchButton.setBounds(50 + 300 + 50, 50, 100, 40);
        SaleListPanel saleListPanel = new SaleListPanel(Sale.getAllSales());
        saleListPanel.setBounds(40, 100, 742, 492);
        FillInfor.add(saleListPanel);
        FillInfor.add(searchButton);
        FillInfor.add(searchField);
        searchButton.addActionListener((ActionEvent e) -> {
            String title = searchField.getText();
            if (title.equals("")) {
                JOptionPane.showMessageDialog(null, "Please enter keywords you want to search");
            } else {
                List<Media> medias = SearchController.searchByTitle(title);
                if (medias == null) {
                    JOptionPane.showMessageDialog(null, "Can't found media has title '" + title + "'");
                } else {
                    FillInfor.removeAll();

                    MediaSalePanel salePanel = new MediaSalePanel(medias);

                    salePanel.getSubmit().addActionListener((ActionEvent e1) -> {
                        if (salePanel.checkDay()) {
                            salePanel.getMediaSales().removeAll(salePanel.getMediaSales());
                            for (MediaSaleItemPanel mediaSaleItemPanel : salePanel.getMediaSaleItemPanels()) {
                                if (mediaSaleItemPanel.isStatus()) {
                                    salePanel.getMediaSales().add(mediaSaleItemPanel.getMediaSale());
                                }
                            }
                            int select = JOptionPane.showConfirmDialog(null, "Sale " + salePanel.getMediaSales().size() + " media(s)");
                            if (select == JOptionPane.YES_OPTION && salePanel.getMediaSales().size() > 0) {
                                SalesController.create(salePanel.getMediaSales(), salePanel.getStartDate(), salePanel.getEndDate());
                                JOptionPane.showMessageDialog(null, "Successfull");
                                jButtonSaleActionPerformed(null);
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "EndDay is an earlier date than StartDay");
                        }
                    });

                    salePanel.setBounds(20, 20, salePanel.getWidth(), salePanel.getHeight());
                    FillInfor.setLayout(new BorderLayout());
                    FillInfor.add(salePanel, BorderLayout.CENTER);
                    FillInfor.updateUI();
                }
            }
        });
        searchField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10) {
                    String title = searchField.getText();
                    if (title.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please enter keywords you want to search");
                    } else {
                        List<Media> medias = SearchController.searchByTitle(title);
                        if (medias == null) {
                            JOptionPane.showMessageDialog(null, "Can't found media has title '" + title + "'");
                        } else {
                            FillInfor.removeAll();

                            MediaSalePanel salePanel = new MediaSalePanel(medias);

                            salePanel.getSubmit().addActionListener((ActionEvent e1) -> {
                                if (salePanel.checkDay()) {
                                    salePanel.getMediaSales().removeAll(salePanel.getMediaSales());
                                    for (MediaSaleItemPanel mediaSaleItemPanel : salePanel.getMediaSaleItemPanels()) {
                                        if (mediaSaleItemPanel.isStatus()) {
                                            salePanel.getMediaSales().add(mediaSaleItemPanel.getMediaSale());
                                        }
                                    }
                                    int select = JOptionPane.showConfirmDialog(null, "Sale " + salePanel.getMediaSales().size() + " media(s)");
                                    if (select == JOptionPane.YES_OPTION && salePanel.getMediaSales().size() > 0) {
                                        SalesController.create(salePanel.getMediaSales(), salePanel.getStartDate(), salePanel.getEndDate());
                                        JOptionPane.showMessageDialog(null, "Successfull");
                                        jButtonSaleActionPerformed(null);
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "EndDay is an earlier date than StartDay");
                                }
                            });

                            salePanel.setBounds(20, 20, salePanel.getWidth(), salePanel.getHeight());
                            FillInfor.setLayout(new BorderLayout());
                            FillInfor.add(salePanel, BorderLayout.CENTER);
                            FillInfor.updateUI();
                        }
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        });
        FillInfor.updateUI();
    }//GEN-LAST:event_jButtonSaleActionPerformed

    private void jButtonOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrderActionPerformed
        // TODO add your handling code here:

        FillInfor.removeAll();
        List<Order> orders = User.getAllOrders();
        if (orders == null) {
            JOptionPane.showMessageDialog(null, "Order empty");
        } else {
            OrderListPanel orderListPanel = new OrderListPanel(orders, User.stateAllOrder());
//        FillInfor.setLayout(new BorderLayout());
            FillInfor.setLayout(null);
            orderListPanel.setBounds(20, 20, orderListPanel.getWidth(), orderListPanel.getHeight());
            FillInfor.add(orderListPanel, BorderLayout.CENTER);
            FillInfor.updateUI();
        }
    }//GEN-LAST:event_jButtonOrderActionPerformed

    private void jButtonUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUserActionPerformed
        // TODO add your handling code here:

        FillInfor.removeAll();
        UserPanel user = new UserPanel();

        FillInfor.setLayout(new BorderLayout());
        FillInfor.add(user, BorderLayout.CENTER);
        FillInfor.updateUI();
    }//GEN-LAST:event_jButtonUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel FillInfor;
    private javax.swing.JPanel Sidebar;
    private javax.swing.JButton jButtonOrder;
    private javax.swing.JButton jButtonProduct;
    private javax.swing.JButton jButtonSale;
    private javax.swing.JButton jButtonUser;
    // End of variables declaration//GEN-END:variables
}
