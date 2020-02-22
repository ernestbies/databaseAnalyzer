/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import databaseanalyzer.Connect;
import databaseanalyzer.DatabaseData;
import java.sql.Statement;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ernest Bieś, PWSZ Tarnów 2019
 */
public class DatabaseGUI extends javax.swing.JFrame {

    /**
     * Creates new form DatabaseGUI
     */
    private Connect con;
    private boolean isConnect;
    private DatabaseData dbData;
    private String log;
    private ResultSet resultSet;
    private Statement statement;
    
    public DatabaseGUI() {
        initComponents();
        con = null;
        dbData = null;
        isConnect = false;
        log = null;
        statement = null;
        jButtonSaveFile.setEnabled(false);
        jButtonAnalyze.setEnabled(false);
        jTextAreaSQL.setEditable(false);
        jButtonLog.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jTextFieldDbname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldHost = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldPort = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jButtonConnect = new javax.swing.JButton();
        jButtonSaveFile = new javax.swing.JButton();
        jButtonLoadFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSQL = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldView = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldMaterializedView = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldWith = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldTempTable = new javax.swing.JTextField();
        jButtonAnalyze = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldLog = new javax.swing.JTextField();
        jButtonLog = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Database Query Analyzer 1.0 @ Ernest Bieś");

        jLabel2.setText("DBName:");

        jTextFieldDbname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDbnameActionPerformed(evt);
            }
        });

        jLabel3.setText("Host:");

        jTextFieldHost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHostActionPerformed(evt);
            }
        });

        jLabel4.setText("Port:");

        jTextFieldPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPortActionPerformed(evt);
            }
        });

        jLabel5.setText("Username:");

        jTextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameActionPerformed(evt);
            }
        });

        jLabel6.setText("Password:");

        jButtonConnect.setText("Connect to database");
        jButtonConnect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConnectActionPerformed(evt);
            }
        });

        jButtonSaveFile.setText("Save file");
        jButtonSaveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveFileActionPerformed(evt);
            }
        });

        jButtonLoadFile.setText("Load file");
        jButtonLoadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoadFileActionPerformed(evt);
            }
        });

        jTextAreaSQL.setColumns(20);
        jTextAreaSQL.setRows(5);
        jScrollPane1.setViewportView(jTextAreaSQL);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("SQL Code:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Access to data Analyzer:");

        jLabel10.setText("Accessing to data by VIEW:");

        jTextFieldView.setEditable(false);

        jLabel11.setText("Accessing to data by MATERIALIZED VIEW:");

        jTextFieldMaterializedView.setEditable(false);

        jLabel12.setText("Accessing to data by WITH:");

        jTextFieldWith.setEditable(false);

        jLabel13.setText("Accessing to data by TEMPORARY TABLE:");

        jTextFieldTempTable.setEditable(false);

        jButtonAnalyze.setText("Analyze query execution time");
        jButtonAnalyze.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalyzeActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Console log:");

        jTextFieldLog.setEditable(false);

        jButtonLog.setText("See full details and data log here");
        jButtonLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("(Warning: DO NOT use ; at the end of the SQL query)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldView)
                            .addComponent(jTextFieldMaterializedView, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldWith, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextFieldTempTable, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldLog, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldDbname, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel3))
                                    .addComponent(jButtonConnect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButtonAnalyze)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSaveFile, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonLoadFile, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1)
                            .addComponent(jLabel14))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDbname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldHost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordFieldPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonConnect)
                    .addComponent(jButtonSaveFile)
                    .addComponent(jButtonLoadFile)
                    .addComponent(jButtonAnalyze))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldMaterializedView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldWith, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldTempTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonLog)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextFieldLog)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDbnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDbnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDbnameActionPerformed

    private void jTextFieldHostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHostActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHostActionPerformed

    private void jTextFieldPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldPortActionPerformed

    private void jTextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameActionPerformed

    private void jButtonConnectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConnectActionPerformed
    if (jTextFieldDbname.getText().isEmpty() || jTextFieldHost.getText().isEmpty() || jTextFieldPort.getText().isEmpty() || jTextFieldUsername.getText().isEmpty() || jPasswordFieldPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill in all fields.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    
        if (!isConnect) {
            try {
                dbData = new DatabaseData(jTextFieldDbname.getText(), jTextFieldHost.getText(), jTextFieldPort.getText(), jTextFieldUsername.getText(), String.valueOf(jPasswordFieldPass.getPassword()));
                con = new Connect(dbData);
                if(con.getConnection() == null){
                    JOptionPane.showMessageDialog(null, "Error. Couldn't connect to database!", "Warning", JOptionPane.WARNING_MESSAGE);
                    System.err.println("Error while connecting to database. ");
                } else {
                    JOptionPane.showMessageDialog(null, "Connected to database!", "Information", JOptionPane.INFORMATION_MESSAGE);
                    jButtonConnect.setText("Disconnect");
                    isConnect = true;
                    jTextAreaSQL.setEditable(true);
                    jTextFieldDbname.setEditable(false);
                    jTextFieldHost.setEditable(false);
                    jTextFieldPort.setEditable(false);
                    jTextFieldUsername.setEditable(false);
                    jPasswordFieldPass.setEditable(false);
                    jTextFieldView.setText("");
                    jTextFieldMaterializedView.setText("");
                    jTextFieldTempTable.setText("");
                    jTextFieldWith.setText("");
                    jButtonSaveFile.setEnabled(true);
                    jButtonLoadFile.setEnabled(false);
                    jButtonAnalyze.setEnabled(true);
                }
            } catch (NullPointerException npe) {
                JOptionPane.showMessageDialog(null, "Error. Null Pointer Exception!", "Warning", JOptionPane.WARNING_MESSAGE);
                System.err.println("Error. " + npe);
            }
        } else {
            con.close();
            jButtonConnect.setText("Connect");
            isConnect = false;
            jTextFieldDbname.setEditable(true);
            jTextFieldHost.setEditable(true);
            jTextFieldPort.setEditable(true);
            jTextFieldUsername.setEditable(true);
            jPasswordFieldPass.setEditable(true);
            jButtonSaveFile.setEnabled(false);
            jTextAreaSQL.setEditable(false);
            jButtonLoadFile.setEnabled(true);
            jButtonAnalyze.setEnabled(false);
            jButtonLog.setEnabled(false);
            jTextFieldView.setText("");
            jTextFieldMaterializedView.setText("");
            jTextFieldTempTable.setText("");
            jTextFieldWith.setText("");
            jTextFieldLog.setText("");
            jTextAreaSQL.setText("");
        }
    }//GEN-LAST:event_jButtonConnectActionPerformed

    private void jButtonSaveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveFileActionPerformed
        saveFile("databaseinformation.ser");
        JOptionPane.showMessageDialog(null, "Database information saved in file.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButtonSaveFileActionPerformed

    private void jButtonLoadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoadFileActionPerformed
        dbData = loadFile("databaseinformation.ser");
        if (dbData != null) {
            jTextFieldDbname.setText(dbData.getDbname());
            jTextFieldHost.setText(dbData.getHost());
            jTextFieldPort.setText(dbData.getPort());
            jTextFieldUsername.setText(dbData.getUser());
            jPasswordFieldPass.setText(dbData.getPass());
            JOptionPane.showMessageDialog(null, "Database information loaded from file.", "Information", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButtonLoadFileActionPerformed

    private void jButtonAnalyzeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalyzeActionPerformed
        Statement st = null;
        ResultSet rs = null;
        
        try {
                Map<Float, String> executionTimes = new HashMap<>();
                
                dbData = new DatabaseData(jTextFieldDbname.getText(), jTextFieldHost.getText(), jTextFieldPort.getText(), jTextFieldUsername.getText(), String.valueOf(jPasswordFieldPass.getPassword()));
                st = con.getConnection().createStatement();
                
                String sqlSchemas = "SELECT table_schema FROM information_schema.tables WHERE table_schema != 'pg_catalog' AND table_schema != 'information_schema'";
                rs = st.executeQuery(sqlSchemas);
                String schema = "";
                if (rs.next()) {
                    schema = rs.getString("table_schema") + ".";
                }
                
                String sql = 
                        "DROP VIEW IF EXISTS " + schema + "dbanalyzerView;" +
                        "CREATE VIEW " + schema + "dbanalyzerView AS (" + jTextAreaSQL.getText() + ");" +
                        "DROP MATERIALIZED VIEW IF EXISTS " + schema + "dbanalyzerMView;" + 
                        "CREATE MATERIALIZED VIEW " + schema + "dbanalyzerMView AS (" + jTextAreaSQL.getText() + ");" +   
                        "DROP TABLE IF EXISTS dbanalyzerTEMPTABLE;" + 
                        "CREATE TEMP TABLE dbanalyzerTEMPTABLE AS(" + jTextAreaSQL.getText() +");";
                
                String sqlLog = 
                        "DROP VIEW IF EXISTS " + schema + "dbanalyzerView;\n" +
                        "CREATE VIEW " + schema + "dbanalyzerView AS (" + jTextAreaSQL.getText() + ");\n" +
                        "DROP MATERIALIZED VIEW IF EXISTS " + schema + "dbanalyzerMView;\n" + 
                        "CREATE MATERIALIZED VIEW " + schema + "dbanalyzerMView AS (" + jTextAreaSQL.getText() + ");\n" + 
                        "DROP TABLE IF EXISTS dbanalyzerTEMPTABLE;\n" + 
                        "CREATE TEMP TABLE dbanalyzerTEMPTABLE AS(" + jTextAreaSQL.getText() +");\n";         
                
                SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
                Date date = new Date(System.currentTimeMillis());
                String now = formatter.format(date);
                log = "---------- Database Analyzer ----------\n" + "-> Author: Ernest Bieś\n" + "-> Version: 1.0\n" + "-> Description: Analyzing execution time of accessing data by VIEW, MATERIALIZED VIEW, TEMPORARY TABLE and WITH\n" + "-> Date of analysis: " + now + "\n" + "-> PWSZ Tarnów, 2019\n\n" + "---------- BEGIN OF DETAILS LOG ----------\n\n" + "----- Passed SQL -----\n"+sqlLog;
                st.executeUpdate(sql);
                
                statement = con.getConnection().createStatement();
                resultSet = statement.executeQuery("SELECT * FROM " + schema + "dbanalyzerView;");
        
                String analyze = "";
                String sqlAnalyze = "EXPLAIN ANALYZE SELECT * FROM " + schema + "dbanalyzerView;";
                
                log = log + "\n" + sqlAnalyze + "\n";
                rs = st.executeQuery(sqlAnalyze);
                log = log + "\n----- Analyzing accessing data using VIEW -----\n";
                while (rs.next()){
                    analyze = rs.getString(1);
                    log = log + analyze + "\n";
                }
                
                String result = analyze.substring(analyze.indexOf("Execution"), analyze.length());
                String res = result.substring(result.indexOf(":") + 1, result.indexOf("ms") - 1);
                float resultView = Float.parseFloat(res);
                executionTimes.put(resultView, "View");
                jTextFieldView.setText(result);
                
                sqlAnalyze = "EXPLAIN ANALYZE SELECT * FROM " + schema + "dbanalyzerMVIEW;";
                log = log + "\n" + sqlAnalyze + "\n";
                rs = st.executeQuery(sqlAnalyze);
                log = log + "\n----- Analyzing accessing data using MATERIALIZED VIEW -----\n";
                while (rs.next()){
                    analyze = rs.getString(1);
                    log = log + analyze + "\n";
                }
                
                result = analyze.substring(analyze.indexOf("Execution"), analyze.length());
                res = result.substring(result.indexOf(":") + 1, result.indexOf("ms") - 1);
                float resultMView = Float.parseFloat(res);
                executionTimes.put(resultMView, "Materialized View");
                jTextFieldMaterializedView.setText(result);
                
                sqlAnalyze = "EXPLAIN ANALYZE SELECT * FROM dbanalyzerTEMPTABLE;";
                log = log + "\n" + sqlAnalyze + "\n";
                rs = st.executeQuery(sqlAnalyze);
                log = log + "\n----- Analyzing accessing data using TEMPORARY TABLE -----\n";
                while (rs.next()){
                    analyze = rs.getString(1);
                    log = log + analyze + "\n";
                }

                result = analyze.substring(analyze.indexOf("Execution"), analyze.length());
                res = result.substring(result.indexOf(":") + 1, result.indexOf("ms") - 1);
                float resultTempTable = Float.parseFloat(res);
                executionTimes.put(resultTempTable, "Temporary Table");
                jTextFieldTempTable.setText(result);
                
                sqlAnalyze = "EXPLAIN ANALYZE WITH dbanalyzerWITH AS(" + jTextAreaSQL.getText() +") SELECT * FROM dbanalyzerWITH;";
                String sqlAnalyzeLog = "EXPLAIN ANALYZE WITH dbanalyzerWITH AS(" + jTextAreaSQL.getText() +") \nSELECT * FROM dbanalyzerWITH;";
                log = log + "\n" + sqlAnalyzeLog + "\n";
                rs = st.executeQuery(sqlAnalyze);
                log = log + "\n----- Analyzing accessing data using WITH -----\n";
                while (rs.next()){
                    analyze = rs.getString(1);
                    log = log + analyze + "\n";
                }
                
                result = analyze.substring(analyze.indexOf("Execution"), analyze.length());
                res = result.substring(result.indexOf(":") + 1, result.indexOf("ms") - 1);
                float resultWITH = Float.parseFloat(res);
                executionTimes.put(resultWITH, "WITH");
                jTextFieldWith.setText(result);
                
                Float min = Collections.min(executionTimes.keySet());  
                JOptionPane.showMessageDialog(null, "Analysis completed.\nMost efficient option in this case is " + executionTimes.get(min) + "\nExecution time: " + min, "Information", JOptionPane.INFORMATION_MESSAGE);
                sql = "DROP VIEW IF EXISTS " + schema +"dbanalyzerView; DROP MATERIALIZED VIEW IF EXISTS " + schema + "dbanalyzerMView; DROP TABLE IF EXISTS " + schema + "dbanalyzerTEMPTABLE;";
                st.executeUpdate(sql);
                log = log + "\n" + sql;
                String msg = "Best option is: " + executionTimes.get(min) + ". Execution time: " + min;

                log = log + "\n" + msg;
                jTextFieldLog.setText(msg); 
                log = log + "\n\n---------- END OF DETAILS LOG ----------";
                System.out.println(log);
                jButtonLog.setEnabled(true);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "SQLException!", "Warning", JOptionPane.WARNING_MESSAGE);
                System.err.println("SQL Error. " + ex);
            } catch (NullPointerException npe) {
                JOptionPane.showMessageDialog(null, "NullPointerException!", "Warning", JOptionPane.WARNING_MESSAGE);
                System.err.println("NullPointerException. " + npe);
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (st != null) {
                        st.close();
                    }
                } catch (SQLException sqle) {
                    System.err.println("Error while closing ResultSet & Statement. SQLException. " + sqle);
                }
            }
    }//GEN-LAST:event_jButtonAnalyzeActionPerformed

    private void jButtonLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogActionPerformed
        DetailsLog detailsLog = new DetailsLog(log);
        DataLog dataLog = new DataLog(resultSet);
        detailsLog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        detailsLog.setVisible(true);
        dataLog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        dataLog.setVisible(true);
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException ex) {
                System.err.println("Error while closing statement. " + ex);
            }
        }
        jButtonLog.setEnabled(false);
    }//GEN-LAST:event_jButtonLogActionPerformed


    //Metoda do odczytu danych konfiguracyjnych bazy danych zapisanych w pliku
    public DatabaseData loadFile(String fileName) {
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(fileName)))) {
            dbData = (DatabaseData) in.readObject();
            return dbData;
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Couldn't load file. FileNotFoundException!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Couldn't load file. IOException!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Couldn't load file. ClassNotFoundException!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    //Metoda do zapisu danych konfiguracyjnych bazy danych w pliku
    public void saveFile(String fileName){
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(fileName)))) {
            out.writeObject(dbData);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Couldn't save file. FileNotFoundException!", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Couldn't save file. IOException!", "Error", JOptionPane.ERROR_MESSAGE);
        }       
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAnalyze;
    private javax.swing.JButton jButtonConnect;
    private javax.swing.JButton jButtonLoadFile;
    private javax.swing.JButton jButtonLog;
    private javax.swing.JButton jButtonSaveFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSQL;
    private javax.swing.JTextField jTextFieldDbname;
    private javax.swing.JTextField jTextFieldHost;
    private javax.swing.JTextField jTextFieldLog;
    private javax.swing.JTextField jTextFieldMaterializedView;
    private javax.swing.JTextField jTextFieldPort;
    private javax.swing.JTextField jTextFieldTempTable;
    private javax.swing.JTextField jTextFieldUsername;
    private javax.swing.JTextField jTextFieldView;
    private javax.swing.JTextField jTextFieldWith;
    // End of variables declaration//GEN-END:variables
}
