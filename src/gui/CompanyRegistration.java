/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MySQL2;

/**
 *
 * @author AmiChan
 */
public class CompanyRegistration extends javax.swing.JDialog {

    SupplierRegistration sr;

    /**
     * Creates new form CompanyRegistration
     *
     * @param parent
     * @param modal
     */
    public CompanyRegistration(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        loadCompanies();
        sr = (SupplierRegistration) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Company Registration");
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Dubai", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Company Registration");

        jLabel1.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Company Name :");

        jLabel3.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Hotline : ");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Company Name", "Hotline"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton3.setText("Clear All");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int row = jTable1.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Select a record to update", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            String name = jTextField1.getText();
            String hotline = jTextField2.getText();

            String selectedId = String.valueOf(jTable1.getValueAt(row, 0));
            String selectedName = String.valueOf(jTable1.getValueAt(row, 1));
            String selectedHotline = String.valueOf(jTable1.getValueAt(row, 2));

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter the company name", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (hotline.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Enter hotline number", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!hotline.matches("^(?:0|94|\\+94|0094)?(?:(11|21|23|24|25|26|27|31|32|33|34|35|36|37|38|41|45|47|51|52|54|55|57|63|65|66|67|81|91)(0|2|3|4|5|7|9)|7(0|1|2|4|5|6|7|8)\\d)\\d{6}$")) {
                JOptionPane.showMessageDialog(this, "Please enter a valid hotline number", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (selectedName.equals(name) && selectedHotline.equals(hotline)) {
                JOptionPane.showMessageDialog(this, "Can't update the same record", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
//            Success
                ResultSet resultSet = MySQL2.executeSearch("SELECT * FROM `company` WHERE (`name` = '" + name + "' OR `hotline` = '" + hotline + "') AND `id`!='" + selectedId + "'");
                try {
                    if (resultSet.next()) {
                        JOptionPane.showMessageDialog(this, "Company name or hotline Already Exists", "Warning", JOptionPane.WARNING_MESSAGE);
                    } else {
                        try {
                            MySQL2.executeIUD("UPDATE `company` SET `name`='" + name + "',`hotline`='" + hotline + "' WHERE `id`='" + selectedId + "' ");
                            JOptionPane.showMessageDialog(this, "Record updated successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
                            reset();
                        } catch (HeadlessException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(CompanyRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String name = jTextField1.getText();
        String hotline = jTextField2.getText();

        if (name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter the company name", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (hotline.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter hotline number", "Warning", JOptionPane.WARNING_MESSAGE);
        } else if (!hotline.matches("^(?:0|94|\\+94|0094)?(?:(11|21|23|24|25|26|27|31|32|33|34|35|36|37|38|41|45|47|51|52|54|55|57|63|65|66|67|81|91)(0|2|3|4|5|7|9)|7(0|1|2|4|5|6|7|8)\\d)\\d{6}$")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid hotline number", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
//            Success
            ResultSet resultSet = MySQL2.executeSearch("SELECT * FROM `company` WHERE `name` = '" + name + "' OR `hotline` = '" + hotline + "'   ");
            try {
                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(this, "Company name or hotline Already Exists", "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                    try {
                        MySQL2.executeIUD("INSERT INTO `company` (`name`, `hotline`) VALUES ('" + name + "', '" + hotline + "')");
                        JOptionPane.showMessageDialog(this, "Company registered successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
                        reset();
                    } catch (HeadlessException e) {
                        e.printStackTrace();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(CompanyRegistration.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();

        jTextField1.setText(String.valueOf(jTable1.getValueAt(row, 1)));
        jTextField2.setText(String.valueOf(jTable1.getValueAt(row, 2)));

        jButton1.setEnabled(false);

        if (evt.getClickCount() == 2) {
            String name = (String) jTable1.getValueAt(row, 1);
            sr.setCompany(name);
            sr.setCompanyId(String.valueOf(jTable1.getValueAt(row, 0)));
            this.dispose();
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        reset();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private void loadCompanies() {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet resultSet = MySQL2.executeSearch("SELECT * FROM `company`");

            while (resultSet.next()) {
                Vector<String> vector = new Vector<>();

                vector.add(resultSet.getString("id"));
                vector.add(resultSet.getString("name"));
                vector.add(resultSet.getString("hotline"));

                dtm.addRow(vector);

            }
        } catch (SQLException e) {
        }
    }

    private void reset() {
        jTextField1.setText("");
        jTextField1.grabFocus();
        jTextField2.setText("");

        jTable1.clearSelection();

        jButton1.setEnabled(true);

        loadCompanies();
    }
}
