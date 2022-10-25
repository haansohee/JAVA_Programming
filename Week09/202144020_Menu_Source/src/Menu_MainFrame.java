
/**
 *
 * @author hansohee
 */

import java.awt.*;

public class Menu_MainFrame extends javax.swing.JFrame {

    int iMenu_idx = 0;      // Menu Index
    int ix, iy, width, height;
    Color cData = new Color(0, 0, 255);  // Color initialize(Blue)
    
    Font objFont;   // Font Object
    String strData = null;  // Output String Variable
    
    public Menu_MainFrame() {
        initComponents();
        
        jPopupMenu1.add(mnuFileOpen);  // add mnuFileOpen to PopUp Menu
        jPopupMenu1.add(mnuFileSave);
        jPopupMenu1.addSeparator();
        jPopupMenu1.add(munExit);
    }

    public void paint(Graphics g) {
        // g.clearRect(0, 53, this.getWidth(), this,getHeight();
        super.paintComponents(g);
        g.setColor(cData);
        
        switch(iMenu_idx) {
            case 31 :
                g.drawLine(ix, iy, 250, 250);
                break;
                
            case 32 :
                g.drawOval(ix, iy, width, height);
                g.fillOval(ix, iy, width, height);
                break;
                
            case 33 :
                g.drawRect(ix, iy, width, height);
                g.fillRect(ix, iy, width, height);
                break;
                
            case 41 :
                strData = "Arial Font";
                g.setFont(objFont);
                g.drawString(strData, ix, iy);
                break;
                
            case 42 :
                strData = "궁서체 폰트";
                g.setFont(objFont);
                g.drawString(strData, ix, iy);
                break;
                
            case 43 :
                strData = "돋움체 폰트";
                g.setFont(objFont);
                g.drawString(strData, ix, iy);
                break;
                
            default :
                break;
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        munExit = new javax.swing.JMenu();
        mnuFileOpen = new javax.swing.JMenuItem();
        mnuFileSave = new javax.swing.JMenuItem();
        mnuExit = new javax.swing.JMenuItem();
        mnuEdit = new javax.swing.JMenu();
        mnuGraphic_Ellipse = new javax.swing.JMenu();
        mnuGraphic_Line = new javax.swing.JMenuItem();
        mnuGraphic_Eliipse = new javax.swing.JMenuItem();
        mnuGraphic_Rectangle = new javax.swing.JMenuItem();
        mnuFont = new javax.swing.JMenu();
        munFont_Arial = new javax.swing.JMenuItem();
        mnuFont_Gungseo = new javax.swing.JMenuItem();
        mnuFont_Dotnum = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jFileChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jFileChooser1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        munExit.setText("File");

        mnuFileOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFileOpen.setText("열기 (Oepn)");
        mnuFileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileOpenActionPerformed(evt);
            }
        });
        munExit.add(mnuFileOpen);

        mnuFileSave.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFileSave.setText("저장 (Save)");
        mnuFileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileSaveActionPerformed(evt);
            }
        });
        munExit.add(mnuFileSave);

        mnuExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuExit.setText("종료 (Exit)");
        mnuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExitActionPerformed(evt);
            }
        });
        munExit.add(mnuExit);

        jMenuBar1.add(munExit);

        mnuEdit.setText("Edit");
        jMenuBar1.add(mnuEdit);

        mnuGraphic_Ellipse.setText("Graphic");

        mnuGraphic_Line.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuGraphic_Line.setText("Line");
        mnuGraphic_Line.addMenuKeyListener(new javax.swing.event.MenuKeyListener() {
            public void menuKeyPressed(javax.swing.event.MenuKeyEvent evt) {
                mnuGraphic_LineMenuKeyPressed(evt);
            }
            public void menuKeyReleased(javax.swing.event.MenuKeyEvent evt) {
            }
            public void menuKeyTyped(javax.swing.event.MenuKeyEvent evt) {
            }
        });
        mnuGraphic_Line.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGraphic_LineActionPerformed(evt);
            }
        });
        mnuGraphic_Ellipse.add(mnuGraphic_Line);

        mnuGraphic_Eliipse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuGraphic_Eliipse.setText("Ellipse");
        mnuGraphic_Eliipse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGraphic_EliipseActionPerformed(evt);
            }
        });
        mnuGraphic_Eliipse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnuGraphic_EliipseKeyPressed(evt);
            }
        });
        mnuGraphic_Ellipse.add(mnuGraphic_Eliipse);

        mnuGraphic_Rectangle.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuGraphic_Rectangle.setText("Rectangle");
        mnuGraphic_Rectangle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuGraphic_RectangleActionPerformed(evt);
            }
        });
        mnuGraphic_Rectangle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnuGraphic_RectangleKeyPressed(evt);
            }
        });
        mnuGraphic_Ellipse.add(mnuGraphic_Rectangle);

        jMenuBar1.add(mnuGraphic_Ellipse);

        mnuFont.setText("Font");

        munFont_Arial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        munFont_Arial.setText("Arial");
        munFont_Arial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                munFont_ArialActionPerformed(evt);
            }
        });
        munFont_Arial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                munFont_ArialKeyPressed(evt);
            }
        });
        mnuFont.add(munFont_Arial);

        mnuFont_Gungseo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFont_Gungseo.setText("궁서체");
        mnuFont_Gungseo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFont_GungseoActionPerformed(evt);
            }
        });
        mnuFont_Gungseo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnuFont_GungseoKeyPressed(evt);
            }
        });
        mnuFont.add(mnuFont_Gungseo);

        mnuFont_Dotnum.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mnuFont_Dotnum.setText("돋움체");
        mnuFont_Dotnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFont_DotnumActionPerformed(evt);
            }
        });
        mnuFont_Dotnum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mnuFont_DotnumKeyPressed(evt);
            }
        });
        mnuFont.add(mnuFont_Dotnum);

        jMenuBar1.add(mnuFont);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuGraphic_LineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGraphic_LineActionPerformed
        this.setTitle("Line Menu Click!");
        ix = 100;
        iy = 100;
        iMenu_idx = 31;
        this.repaint();
        
    }//GEN-LAST:event_mnuGraphic_LineActionPerformed

    private void mnuGraphic_LineMenuKeyPressed(javax.swing.event.MenuKeyEvent evt) {//GEN-FIRST:event_mnuGraphic_LineMenuKeyPressed
        this.setTitle("LIne Menu Click! (키 사용)");
        ix = 100;
        iy = 100;
        iMenu_idx = 31;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_LineMenuKeyPressed

    private void mnuGraphic_EliipseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGraphic_EliipseActionPerformed
        this.setTitle("Ellipse Menu Click!");
        ix = iy = 100;
        width = height = 100;
        iMenu_idx = 32;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_EliipseActionPerformed

    private void mnuGraphic_EliipseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnuGraphic_EliipseKeyPressed
        this.setTitle("Ellipse Menu Click! (키 사용)");
        ix = iy = 100;
        width = height = 100;
        iMenu_idx = 32;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_EliipseKeyPressed

    private void mnuGraphic_RectangleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuGraphic_RectangleActionPerformed
        this.setTitle("Rectangle Menu Click!");
        ix = iy = 100;
        width = height = 100;
        iMenu_idx = 33;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_RectangleActionPerformed

    private void mnuGraphic_RectangleKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnuGraphic_RectangleKeyPressed
        this.setTitle("Rectangle Menu Click! (키 사용)");
        ix = iy = 100;
        width = height = 100;
        iMenu_idx = 33;
        this.repaint();
    }//GEN-LAST:event_mnuGraphic_RectangleKeyPressed

    private void mnuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuExitActionPerformed

    private void mnuFileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileOpenActionPerformed
        jFileChooser1.showOpenDialog(null);
    }//GEN-LAST:event_mnuFileOpenActionPerformed

    private void mnuFileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileSaveActionPerformed
        jFileChooser1.showSaveDialog(null);
    }//GEN-LAST:event_mnuFileSaveActionPerformed

    private void jFileChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jFileChooser1MouseClicked
        // evt.getButton() = 1 / 2/ 3 (Left / Middle / Right) Mouse Button
        if (evt.getButton() == 3) {
            jPopupMenu1.show(this, evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_jFileChooser1MouseClicked

    private void munFont_ArialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_munFont_ArialActionPerformed
        ix = 10;
        iy = 100;
        objFont = new Font("Arial", Font.PLAIN, 24);
        iMenu_idx = 41;
        this.repaint();
    }//GEN-LAST:event_munFont_ArialActionPerformed

    private void mnuFont_GungseoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFont_GungseoActionPerformed
        ix = 10;
        iy = 100;
        objFont = new Font("궁서체", Font.BOLD, 24);
        iMenu_idx = 42;
        this.repaint();
    }//GEN-LAST:event_mnuFont_GungseoActionPerformed

    private void mnuFont_DotnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFont_DotnumActionPerformed
        ix = 10;
        iy = 100;
        objFont = new Font("돋움체", Font.ITALIC, 24);
        iMenu_idx = 43;
        this.repaint();
    }//GEN-LAST:event_mnuFont_DotnumActionPerformed

    private void munFont_ArialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_munFont_ArialKeyPressed
        ix = 10;
        iy = 100;
        objFont = new Font("Arial", Font.PLAIN, 24);
        iMenu_idx = 41;
        this.repaint();
    }//GEN-LAST:event_munFont_ArialKeyPressed

    private void mnuFont_GungseoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnuFont_GungseoKeyPressed
        ix = 10;
        iy = 100;
        objFont = new Font("궁서체", Font.BOLD, 24);
        iMenu_idx = 42;
        this.repaint();
    }//GEN-LAST:event_mnuFont_GungseoKeyPressed

    private void mnuFont_DotnumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mnuFont_DotnumKeyPressed
        ix = 10;
        iy = 100;
        objFont = new Font("돋움체", Font.ITALIC, 24);
        iMenu_idx = 43;
        this.repaint();
    }//GEN-LAST:event_mnuFont_DotnumKeyPressed

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
            java.util.logging.Logger.getLogger(Menu_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenu mnuEdit;
    private javax.swing.JMenuItem mnuExit;
    private javax.swing.JMenuItem mnuFileOpen;
    private javax.swing.JMenuItem mnuFileSave;
    private javax.swing.JMenu mnuFont;
    private javax.swing.JMenuItem mnuFont_Dotnum;
    private javax.swing.JMenuItem mnuFont_Gungseo;
    private javax.swing.JMenuItem mnuGraphic_Eliipse;
    private javax.swing.JMenu mnuGraphic_Ellipse;
    private javax.swing.JMenuItem mnuGraphic_Line;
    private javax.swing.JMenuItem mnuGraphic_Rectangle;
    private javax.swing.JMenu munExit;
    private javax.swing.JMenuItem munFont_Arial;
    // End of variables declaration//GEN-END:variables
}
