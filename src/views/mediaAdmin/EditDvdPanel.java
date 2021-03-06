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
public class EditDvdPanel extends javax.swing.JPanel {

    /**
     * Creates new form EditBookPanel
     */
    public EditDvdPanel() {
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

        dvd_big_label = new javax.swing.JLabel();
        director_label = new javax.swing.JLabel();
        director = new javax.swing.JTextField();
        language_label = new javax.swing.JLabel();
        languages = new javax.swing.JComboBox<>();
        runtime_label = new javax.swing.JLabel();
        publication_label = new javax.swing.JLabel();
        publication_date = new javax.swing.JFormattedTextField();
        studio_label = new javax.swing.JLabel();
        dvd_type_label = new javax.swing.JLabel();
        dvd_types = new javax.swing.JComboBox<>();
        subtitle_label = new javax.swing.JLabel();
        confirmButton = new javax.swing.JButton();
        runtime = new javax.swing.JFormattedTextField();
        studio_name = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        subtitle = new javax.swing.JTextArea();

        setPreferredSize(new java.awt.Dimension(600, 550));

        dvd_big_label.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        dvd_big_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dvd_big_label.setText("EDIT DVD");

        director_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        director_label.setText("Director: : ");

        director.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                directorActionPerformed(evt);
            }
        });

        language_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        language_label.setText("Language: ");

        languages.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vietnamese", "English", "Japanese" }));

        runtime_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        runtime_label.setText("Runtime: ");

        publication_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        publication_label.setText("Publication date: ");

        publication_date.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        studio_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        studio_label.setText("Studio: ");

        dvd_type_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        dvd_type_label.setText("DVD type: ");

        dvd_types.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blu-ray", "HD-DVD" }));

        subtitle_label.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        subtitle_label.setText("Subtitle: ");

        confirmButton.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        confirmButton.setText("Confirm Edit");

        runtime.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0"))));

        subtitle.setColumns(20);
        subtitle.setRows(5);
        jScrollPane1.setViewportView(subtitle);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dvd_big_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(publication_label)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(languages, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(director_label)
                                        .addComponent(language_label)
                                        .addComponent(runtime_label))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(84, 84, 84)
                                            .addComponent(director, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jScrollPane1)
                                                .addComponent(studio_name)
                                                .addComponent(dvd_types, 0, 291, Short.MAX_VALUE)
                                                .addComponent(publication_date)
                                                .addComponent(runtime))))))
                            .addComponent(studio_label)
                            .addComponent(dvd_type_label)
                            .addComponent(subtitle_label))
                        .addGap(0, 129, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(confirmButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dvd_big_label)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(director_label)
                    .addComponent(director, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(language_label)
                    .addComponent(languages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(runtime_label)
                    .addComponent(runtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(publication_label)
                    .addComponent(publication_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studio_label)
                    .addComponent(studio_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dvd_type_label)
                    .addComponent(dvd_types, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtitle_label)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addComponent(confirmButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void directorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_directorActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_directorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField director;
    private javax.swing.JLabel director_label;
    private javax.swing.JLabel dvd_big_label;
    private javax.swing.JLabel dvd_type_label;
    private javax.swing.JComboBox<String> dvd_types;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel language_label;
    private javax.swing.JComboBox<String> languages;
    private javax.swing.JFormattedTextField publication_date;
    private javax.swing.JLabel publication_label;
    private javax.swing.JFormattedTextField runtime;
    private javax.swing.JLabel runtime_label;
    private javax.swing.JLabel studio_label;
    private javax.swing.JTextField studio_name;
    private javax.swing.JTextArea subtitle;
    private javax.swing.JLabel subtitle_label;
    // End of variables declaration//GEN-END:variables
}
