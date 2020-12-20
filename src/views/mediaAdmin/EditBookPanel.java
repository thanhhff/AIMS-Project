/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views.mediaAdmin;

/**
 *
 * @author Toshiba T75
 */
public class EditBookPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditBookPanel
     */
    public EditBookPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        book_big_label = new javax.swing.JLabel();
        book_author_label = new javax.swing.JLabel();
        author_name = new javax.swing.JTextField();
        language_label = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        publisher_label = new javax.swing.JLabel();
        publisher_name = new javax.swing.JTextField();
        publication_label = new javax.swing.JLabel();
        publication_date = new javax.swing.JFormattedTextField();
        page_label = new javax.swing.JLabel();
        page_number = new javax.swing.JFormattedTextField();
        cover_label = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        genre_label = new javax.swing.JLabel();
        genre = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(600, 550));

        book_big_label.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        book_big_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        book_big_label.setText("EDIT BOOK");

        book_author_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        book_author_label.setText("Author: ");

        language_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        language_label.setText("Language: ");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vietnamese", "English", "Japanese" }));

        publisher_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        publisher_label.setText("Publisher: ");

        publication_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        publication_label.setText("Publication date: ");

        publication_date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        page_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        page_label.setText("Pages: ");

        page_number.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));

        cover_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        cover_label.setText("Cover type: ");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paperback", "Hardcover" }));

        genre_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        genre_label.setText("Genre: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(book_big_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(publication_label)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(book_author_label)
                                        .addComponent(language_label)
                                        .addComponent(publisher_label))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(84, 84, 84)
                                            .addComponent(author_name, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(genre)
                                                .addComponent(jComboBox2, 0, 291, Short.MAX_VALUE)
                                                .addComponent(page_number)
                                                .addComponent(publication_date)
                                                .addComponent(publisher_name))))))
                            .addComponent(page_label)
                            .addComponent(cover_label)
                            .addComponent(genre_label))
                        .addGap(0, 111, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(book_big_label)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(book_author_label)
                    .addComponent(author_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(language_label)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publisher_label)
                    .addComponent(publisher_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publication_label)
                    .addComponent(publication_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(page_label)
                    .addComponent(page_number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cover_label)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genre_label)
                    .addComponent(genre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(232, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField author_name;
    private javax.swing.JLabel book_author_label;
    private javax.swing.JLabel book_big_label;
    private javax.swing.JLabel cover_label;
    private javax.swing.JTextField genre;
    private javax.swing.JLabel genre_label;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel language_label;
    private javax.swing.JLabel page_label;
    private javax.swing.JFormattedTextField page_number;
    private javax.swing.JFormattedTextField publication_date;
    private javax.swing.JLabel publication_label;
    private javax.swing.JLabel publisher_label;
    private javax.swing.JTextField publisher_name;
    // End of variables declaration//GEN-END:variables
}
