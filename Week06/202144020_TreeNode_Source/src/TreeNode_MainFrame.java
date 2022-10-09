/*
추가 버튼 클릭 시 : 선택한 폴더의 Child Node로 "새 폴더" 추가
삭제 버튼 클릭 시 : 선택한 폴더 삭제
*/
/**
 *
 * @author hansohee
 */
import javax.swing.tree.*;
import java.util.*;

public class TreeNode_MainFrame extends javax.swing.JFrame {

    // Setting Member Variable
    DefaultTreeModel dftTreeModel = null;
    DefaultTreeSelectionModel dftTreeSelectionModel = new DefaultTreeSelectionModel();
    DefaultMutableTreeNode rootNode= new DefaultMutableTreeNode("강의 자료");
    DefaultMutableTreeNode comNode = new DefaultMutableTreeNode("컴퓨터 언어");
   
    public TreeNode_MainFrame() {
        initComponents();
        
        // Selection Mode = SINGLE_SELECTION_MODE Setting
        dftTreeSelectionModel.setSelectionMode(1);
        
        // Create 컴퓨터 언어 node의 childNode
        Vector<DefaultMutableTreeNode> myVC = new Vector<>();
        String [] objFolder = {"Java", "C#", "JSP"};
        
        for (int idx = 0; idx < objFolder.length; idx++) {
        // Create node object to add  Vector element
        myVC.add(new DefaultMutableTreeNode(objFolder[idx]));
        comNode.add(myVC.get(idx));
    }
        
        // Add comNode as child node of rootNode
        rootNode.add(comNode);
        
        //Setting rootNode as DefaultTreeModel
        dftTreeModel = new DefaultTreeModel(rootNode);
        
        // Setting dftTreeModel as TreeModel of jTree1
        jTree1.setModel(dftTreeModel);
        jTree1.setEditable(true);
        jScrollPane1.getViewport().add(jTree1, null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        lblPath = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setText("Tree 예제");

        jTree1.addTreeExpansionListener(new javax.swing.event.TreeExpansionListener() {
            public void treeCollapsed(javax.swing.event.TreeExpansionEvent evt) {
                jTree1TreeCollapsed(evt);
            }
            public void treeExpanded(javax.swing.event.TreeExpansionEvent evt) {
                jTree1TreeExpanded(evt);
            }
        });
        jTree1.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTree1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree1);

        lblPath.setText("Path:");

        btnInsert.setText("추가");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setText("삭제");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblPath))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInsert)
                            .addComponent(btnDelete))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert)
                        .addGap(30, 30, 30)
                        .addComponent(btnDelete)))
                .addGap(18, 18, 18)
                .addComponent(lblPath)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTree1TreeExpanded(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_jTree1TreeExpanded
        lblPath.setText("Path: " + evt.getPath() + "\n");
    }//GEN-LAST:event_jTree1TreeExpanded

    private void jTree1TreeCollapsed(javax.swing.event.TreeExpansionEvent evt) {//GEN-FIRST:event_jTree1TreeCollapsed
        lblPath.setText("Path: " + evt.getPath() + "\n");
    }//GEN-LAST:event_jTree1TreeCollapsed

    private void jTree1ValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTree1ValueChanged
        DefaultMutableTreeNode node;
        node = (DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
        if (node == null) {
            return;
        }
        
        lblPath.setText("Path: " + node.getUserObject() + "선택! \n");
    }//GEN-LAST:event_jTree1ValueChanged

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        int index = 0;  // Save the index of the "new folder" to be added
        
        DefaultMutableTreeNode select_Node;
        select_Node = (DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
        
        DefaultMutableTreeNode newFolder = new DefaultMutableTreeNode("새 폴더");
        index = select_Node.getChildCount();
        dftTreeModel.insertNodeInto(newFolder, select_Node, index);
        
        jTree1.setModel(dftTreeModel);
        jTree1.setSelectionModel(dftTreeSelectionModel);
        jScrollPane1.getViewport().add(jTree1, null);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DefaultMutableTreeNode select_Node;
        select_Node = (DefaultMutableTreeNode)jTree1.getLastSelectedPathComponent();
        
        dftTreeModel.removeNodeFromParent(select_Node);
        
        jTree1.setModel(dftTreeModel);
        jTree1.setSelectionModel(dftTreeSelectionModel);
        jScrollPane1.getViewport().add(jTree1, null);
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(TreeNode_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TreeNode_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TreeNode_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TreeNode_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TreeNode_MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    private javax.swing.JLabel lblPath;
    private javax.swing.JLabel lblTitle;
    // End of variables declaration//GEN-END:variables
}
