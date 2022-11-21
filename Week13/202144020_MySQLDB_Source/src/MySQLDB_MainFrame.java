/**
 *
 * @author hansohee
 */
public class MySQLDB_MainFrame extends javax.swing.JFrame {

    DB_MAN DBM = new DB_MAN();
    String strSQL = "Select * From Carinfo";
    
    public MySQLDB_MainFrame() {
        initComponents();
        
        try {
            DBM.dbOpen();;
            getDBData(strSQL);
            DBM.dbClose();
        } catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }

    public final void getDBData(String strQuery) {
        String strOutput = "번호 \t 차종 \t 배기량 \t 연비 \t 가격 \n";
        jTextArea1.setText(strOutput);
        try {
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while(DBM.DB_rs.next()) {
            strOutput = "";
            strOutput += DBM.DB_rs.getString("No") + "\t";
            strOutput += DBM.DB_rs.getString("Type") + "\t";
            strOutput += DBM.DB_rs.getString("Displacement") + "\t";
            strOutput += DBM.DB_rs.getString("Performance") + "\t";
            strOutput += DBM.DB_rs.getString("Price") + "\n";
            jTextArea1.append(strOutput);
            }
            DBM.DB_rs.close();
        } catch (Exception e) {
            System.out.println("SQL Exception : "+e.getMessage());
        }
    }
    
    public String makeSQLWhere(String strQuery) {
        switch (cboSearch.getSelectedIndex()) {
            case 0:
                strQuery += "WHERE Carinfo.No = '" + txtNo.getText() + "'";
                 break;
                 
            case 1:
                strQuery += "WHERE Carinfo.Type = '" + txtCarType.getText() + "'";
                break;
                
            case 2:
                strQuery += "WHERE Carinfo.Displacement = '" + txtCC.getText() + "'";
                break;
                
            case 3:
                strQuery += "WHERE Carinfo.Performance = '" + txtKM.getText() + "'";
                break;
                
            case 4:
                strQuery += "WHERE Carinfo.Price = '" + txtPrice.getText() + "'";
                break;
                
            default:
                strQuery = "SELECT * FROM Carinfo";
                break;
        }
        
        return strQuery;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNo = new javax.swing.JTextField();
        txtCarType = new javax.swing.JTextField();
        txtCC = new javax.swing.JTextField();
        txtKM = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtSQL = new javax.swing.JTextField();
        cboSearch = new javax.swing.JComboBox<>();
        btnSelect = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnExecute = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("자동차 정보 관리");

        jLabel2.setText("번호");

        jLabel3.setText("차종");

        jLabel4.setText("배기량");

        jLabel5.setText("연비");

        jLabel6.setText("가격");

        jLabel7.setText("SQL문");

        jLabel8.setText("검색 기준");

        txtSQL.setText("SELECT * FROM Carinfo");

        cboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "번호", "차종", "배기량", "연비", "가격" }));

        btnSelect.setText("검 색");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnInsert.setText("추 가");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("수 정");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("삭 제");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("종 료");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnExecute.setText("실 행");
        btnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecuteActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtPrice))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(29, 29, 29)
                                        .addComponent(txtKM))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtSQL))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel8)
                                                .addGap(26, 26, 26)
                                                .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtCarType)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCC)))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSelect)
                                    .addComponent(btnInsert)
                                    .addComponent(btnUpdate)
                                    .addComponent(btnDelete)
                                    .addComponent(btnExit)
                                    .addComponent(btnExecute))))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCarType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSQL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExecute))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        strSQL = "Select * From Carinfo";
        strSQL = makeSQLWhere(strSQL);
        
        try {
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            
            while(DBM.DB_rs.next()) {
                txtNo.setText(DBM.DB_rs.getString("No"));
                txtCarType.setText(DBM.DB_rs.getString("Type"));
                txtCC.setText(DBM.DB_rs.getString("Displacement"));
                txtKM.setText(DBM.DB_rs.getString("Performance"));
                txtPrice.setText(DBM.DB_rs.getString("Price"));
            }
            
            DBM.DB_rs.close();
            DBM.dbClose();
        } catch (Exception e) {
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        strSQL = "Insert Into Carinfo Values (";
        strSQL += "'" + txtNo.getText() + "', ";
        strSQL += "'" + txtCarType.getText() + "', ";
        strSQL += "'" + txtCC.getText() + "', ";
        strSQL += "'" + txtKM.getText() + "', ";
        strSQL += "'" + txtPrice.getText() + "') ";
        
        try {
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            strSQL = "Select * From Carinfo";
            getDBData(strSQL);
            DBM.dbClose();
        } catch (Exception e) {
            System.out.println("SQLExceotion : " + e.getMessage());
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        strSQL = "Update Carinfo Set";
        strSQL += "NO = '" + txtNo.getText()+"',";
        strSQL += "Type = '" + txtCarType.getText()+"',";
        strSQL += "Displacement = '" + txtCC.getText()+"',";
        strSQL += "Performance = '" + txtKM.getText()+"',";
        strSQL += "Price = '" + txtPrice.getText()+"'";
        strSQL = makeSQLWhere(strSQL);
        
        try {
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            strSQL = "Select * From Car";
            getDBData(strSQL);
            DBM.dbClose();;
        } catch (Exception e) {
            System.out.println("SQL Exception : " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        strSQL = "Delete From Carinfo";
        strSQL = makeSQLWhere(strSQL);
        
        try {
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            strSQL = "Select * From Carinfo";
            getDBData(strSQL);
            DBM.dbClose();
        } catch (Exception e) {
            System.out.println("SQL Exception : " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecuteActionPerformed
        String strData = "Select * From Cainfo";
        strSQL = txtSQL.getText();
        strData = strSQL.toUpperCase();
        
        try {
            DBM.dbOpen();
            if(strData.contains("SELCET")) {
                getDBData(strSQL);
            } else {
                DBM.DB_stmt.executeUpdate(strSQL);
            }
            DBM.dbClose();
        } catch (Exception e) {
            System.out.println("SQL Exception : " + e.getMessage());
        }
    }//GEN-LAST:event_btnExecuteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MySQLDB_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MySQLDB_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MySQLDB_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MySQLDB_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MySQLDB_MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExecute;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtCarType;
    private javax.swing.JTextField txtKM;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSQL;
    // End of variables declaration//GEN-END:variables
}
