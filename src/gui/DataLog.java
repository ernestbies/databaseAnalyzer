/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ernest Bieś, PWSZ Tarnów 2019
 */
public class DataLog extends javax.swing.JFrame {

    /**
     * Creates new form DataLog
     */
    private ResultSet resultSet = null;
    
    public DataLog(ResultSet rs) {
        initComponents();
        resultSet = rs;
        showData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Database Query Analyzer 1.0  FULL DATA LOG @ Ernest Bieś");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(129, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(335, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(36, 36, 36)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(37, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metoda do wyświetlenia danych w tabeli otrzymanych z ResultSeta
    void showData() {
        try {
            ResultSetMetaData meta = resultSet.getMetaData();
            int numberColumns = meta.getColumnCount();
            
            DefaultTableModel dtm = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
            List<String> columnNames = new ArrayList<>();
            for (int i = 1; i <= numberColumns; i++) {
                String key = meta.getColumnName(i);
                columnNames.add(key);
                String columnType = meta.getColumnTypeName(i);
                dtm.addColumn(key + " (" + columnType + ")");
            }
            
            while (resultSet.next()) {
                Object[] row = new Object[numberColumns];
                for (int i = 1; i <= numberColumns; i++) {
                    Object value;
                    try{
                        value = resultSet.getObject(i);
                    }catch(SQLException e){
                        //W przypadku wyjątku - nieznany typ obiektu
                        //przypadek: typ monetarny (money)
                        value = resultSet.getString(i);
                    }
                    row[i - 1] = value;
                }
                dtm.addRow(row);
            }
            
            jTable1.setModel(dtm);
        } catch (SQLException ex) {
            System.err.println("SQLException. " + ex);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
