/**
 *
 * @author hansohee
 */
public class Cal_MainFrame extends javax.swing.JFrame {

    public Cal_MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtInput = new javax.swing.JTextField();
        btnBackspace = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnMPlus = new javax.swing.JButton();
        btnNum1 = new javax.swing.JButton();
        btnNum2 = new javax.swing.JButton();
        btnNum3 = new javax.swing.JButton();
        btnNum4 = new javax.swing.JButton();
        btnNum5 = new javax.swing.JButton();
        btnNum6 = new javax.swing.JButton();
        btnNum9 = new javax.swing.JButton();
        btnNum7 = new javax.swing.JButton();
        btnNum8 = new javax.swing.JButton();
        btnNum0 = new javax.swing.JButton();
        btnCHS = new javax.swing.JButton();
        btnPeriod = new javax.swing.JButton();
        btnDiv = new javax.swing.JButton();
        btnMul = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnRem = new javax.swing.JButton();
        btnDiff = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtInput.setText("0");

        btnBackspace.setText("Backspace");
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });

        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnMC.setText("MC");
        btnMC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMCActionPerformed(evt);
            }
        });

        btnMR.setText("MR");
        btnMR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMRActionPerformed(evt);
            }
        });

        btnMS.setText("MS");
        btnMS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMSActionPerformed(evt);
            }
        });

        btnMPlus.setText("M+");
        btnMPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMPlusActionPerformed(evt);
            }
        });

        btnNum1.setText("1");
        btnNum1.setSize(new java.awt.Dimension(60, 23));
        btnNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum1ActionPerformed(evt);
            }
        });

        btnNum2.setText("2");
        btnNum2.setSize(new java.awt.Dimension(60, 23));
        btnNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum2ActionPerformed(evt);
            }
        });

        btnNum3.setText("3");
        btnNum3.setSize(new java.awt.Dimension(60, 23));
        btnNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum3ActionPerformed(evt);
            }
        });

        btnNum4.setText("4");
        btnNum4.setSize(new java.awt.Dimension(60, 23));
        btnNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum4ActionPerformed(evt);
            }
        });

        btnNum5.setText("5");
        btnNum5.setSize(new java.awt.Dimension(60, 23));
        btnNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum5ActionPerformed(evt);
            }
        });

        btnNum6.setText("6");
        btnNum6.setSize(new java.awt.Dimension(60, 23));
        btnNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum6ActionPerformed(evt);
            }
        });

        btnNum9.setText("9");
        btnNum9.setSize(new java.awt.Dimension(60, 23));
        btnNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum9ActionPerformed(evt);
            }
        });

        btnNum7.setText("7");
        btnNum7.setSize(new java.awt.Dimension(60, 23));
        btnNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum7ActionPerformed(evt);
            }
        });

        btnNum8.setText("8");
        btnNum8.setSize(new java.awt.Dimension(60, 23));
        btnNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum8ActionPerformed(evt);
            }
        });

        btnNum0.setText("0");
        btnNum0.setSize(new java.awt.Dimension(60, 23));
        btnNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNum0ActionPerformed(evt);
            }
        });

        btnCHS.setText("+ / -");
        btnCHS.setSize(new java.awt.Dimension(60, 23));
        btnCHS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCHSActionPerformed(evt);
            }
        });

        btnPeriod.setText(".");
        btnPeriod.setSize(new java.awt.Dimension(60, 23));
        btnPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriodActionPerformed(evt);
            }
        });

        btnDiv.setText("/");
        btnDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivActionPerformed(evt);
            }
        });

        btnMul.setText("*");
        btnMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMulActionPerformed(evt);
            }
        });

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnSum.setText("+");
        btnSum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumActionPerformed(evt);
            }
        });

        btnSqrt.setText("sqrt");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });

        btnRem.setText("%");
        btnRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemActionPerformed(evt);
            }
        });

        btnDiff.setText("1 / x");
        btnDiff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiffActionPerformed(evt);
            }
        });

        btnResult.setText("=");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnMC, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBackspace)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(66, 66, 66)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnCHS, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnPeriod, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnDiv, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnMul, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnRem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnSub, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnDiff, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnSum, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnMPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnMS, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMR, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackspace)
                    .addComponent(btnCE)
                    .addComponent(btnC))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMC)
                    .addComponent(btnNum7)
                    .addComponent(btnNum8)
                    .addComponent(btnNum9)
                    .addComponent(btnDiv)
                    .addComponent(btnSqrt))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMR)
                    .addComponent(btnNum4)
                    .addComponent(btnNum5)
                    .addComponent(btnNum6)
                    .addComponent(btnMul)
                    .addComponent(btnRem))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMS)
                    .addComponent(btnNum1)
                    .addComponent(btnNum2)
                    .addComponent(btnNum3)
                    .addComponent(btnSub)
                    .addComponent(btnDiff))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNum0)
                    .addComponent(btnCHS)
                    .addComponent(btnPeriod)
                    .addComponent(btnMPlus)
                    .addComponent(btnSum)
                    .addComponent(btnResult))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
        if(txtInput.getText().equals("0")) {  // 0일 경우 0을 또 찍는 것을 방지
            return;
        }
        
        input_screen("0");
    }//GEN-LAST:event_btnNum0ActionPerformed

    private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
//        txtInput.setText("1");
        input_screen("1");
    }//GEN-LAST:event_btnNum1ActionPerformed

    private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
        input_screen("2");
    }//GEN-LAST:event_btnNum2ActionPerformed

    private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
        input_screen("3");
    }//GEN-LAST:event_btnNum3ActionPerformed

    private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
        input_screen("4");
    }//GEN-LAST:event_btnNum4ActionPerformed

    private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
        input_screen("5");
    }//GEN-LAST:event_btnNum5ActionPerformed

    private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
        input_screen("6");
    }//GEN-LAST:event_btnNum6ActionPerformed

    private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
        input_screen("7");
    }//GEN-LAST:event_btnNum7ActionPerformed

    private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
        input_screen("8");
    }//GEN-LAST:event_btnNum8ActionPerformed

    private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
        input_screen("9");
    }//GEN-LAST:event_btnNum9ActionPerformed

    private void btnSumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumActionPerformed
        // 더하기
        operate("+");
        txtInput.setText("0");
        
    }//GEN-LAST:event_btnSumActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        // 뺄셈
        operate("-");
        txtInput.setText("0");
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMulActionPerformed
        // 곱셈
        operate("*");
        txtInput.setText("0");
    }//GEN-LAST:event_btnMulActionPerformed

    private void btnDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivActionPerformed
        // 나누기
        operate("/");
        txtInput.setText("0");
    }//GEN-LAST:event_btnDivActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        // "="
        operate("=");
        System.out.println("(=)resultNum : " + resultNum);
        txtInput.setText(Double.toString(resultNum));
    }//GEN-LAST:event_btnResultActionPerformed

    private void btnDiffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiffActionPerformed
        // 1 / x
        double num = Double.parseDouble(txtInput.getText());
        double dob = 1.0 / num;
        txtInput.setText(Double.toString(dob));
    }//GEN-LAST:event_btnDiffActionPerformed

    private void btnRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemActionPerformed
        // % 연산
        currentNum = Double.parseDouble(txtInput.getText());
        double per = currentNum / 100;
        double num = currentNum * per;
        txtInput.setText(Double.toString(num));
    }//GEN-LAST:event_btnRemActionPerformed

    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSqrtActionPerformed
        // sqrt (제곱) 연산
        String str = txtInput.getText();
        double num = Math.sqrt(Double.parseDouble(str));
        txtInput.setText(Double.toString(num));
    }//GEN-LAST:event_btnSqrtActionPerformed

    private void btnPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriodActionPerformed
        input_screen(".");
    }//GEN-LAST:event_btnPeriodActionPerformed

    private void btnMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCActionPerformed
        // Memory Clear (메모리 제거) -> 저장된 메모리 지우기
        txtInput.setText("0");
        init("ClearMemory");
    }//GEN-LAST:event_btnMCActionPerformed

    private void btnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRActionPerformed
        // Memory Recall (메모리 상기) -> 저장된 메모리 읽어오기
        txtInput.setText(Double.toString(memoryNum));
    }//GEN-LAST:event_btnMRActionPerformed

    private void btnMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSActionPerformed
        // Memory Save (메모리 저장) -> 메모리 저장하기
        memoryNum = Double.parseDouble(txtInput.getText());
    }//GEN-LAST:event_btnMSActionPerformed

    private void btnMPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMPlusActionPerformed
        // Memory Addition (메모리 추가) -> 메모리의 부호를 "+"로 바꿈 (양의 값의 메모리를 기억)
        double num = Double.parseDouble(txtInput.getText());
        if (num < 0) {
            num = num * -1;
        }
        
        memoryNum = num;
    }//GEN-LAST:event_btnMPlusActionPerformed

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceActionPerformed
        if(txtInput.getText().equals("0") || txtInput.getText().length() <= 1) {
            txtInput.setText("0");
        } else if (txtInput.getText().length() > 0) {
            String subString = txtInput.getText().substring(0, txtInput.getText().length() -1 );
            txtInput.setText(subString);
        }
    }//GEN-LAST:event_btnBackspaceActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        txtInput.setText("0");
        init("ClearEntry");
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        txtInput.setText("0");
        init("Clear");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnCHSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCHSActionPerformed
        // (변경 기호) 양음수 전환
        resultNum += -1;
    }//GEN-LAST:event_btnCHSActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cal_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cal_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cal_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cal_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cal_MainFrame().setVisible(true);
            }
        });
    }
    
    private double resultNum = 0;  // 결과값 저장할 전역 변수
    private double currentNum = 0;  // 현재값 저장할 전역 변수
    private String currentOper = "";  // 현재 연산자 저장할 변수. null : 에러
    boolean isPeriod = false;  // dot(.)의 중복 제거
    
    private double memoryNum = 0;  // 메모리 값 저장할 전역 변수
    
    private void init(String i) {
        if (i.equals("Celar")) {
            resultNum = 0;
            currentNum = 0;
            currentOper = "";
        } else if (i.equals("ClearEntry")) {
            currentNum = 0;
        } else if (i.equals("ClearMemory")) {
            memoryNum = 0;
        }
    }
    
    private void input_screen(String num) {
        String str = txtInput.getText();
        
        System.out.println(isPeriod);
        System.out.println(num);               
        
        if(str.equals("0") && num.equals("0")) {  // 0의 중복 불가
            txtInput.setText("0"); 
        } else if (isPeriod == true && num.equals(".")) {
            txtInput.setText(str + num);
            
        } else if (str.equals("0") && num.equals(".")) {  // 0일 때 . 입력하면 0. 으로 출력
            txtInput.setText("0.");
            isPeriod = true;
        } else if (str.equals("0") && !num.equals("0")) {  // 0일 때 다른 숫자 입력할 경우, 0 제거 하고 해당 숫자 입력
            txtInput.setText(num);
        } else {
            txtInput.setText(str + num);
        }
        
        if (num.equals(".")) {
            isPeriod = true;
        }
    }
    
    void operate(String oper) {
        currentNum = Double.parseDouble(txtInput.getText());
        
        System.out.println("연산 전 currentNum = " + currentNum);
        System.out.println("연산 후 resultNum = " + resultNum);
        System.out.println("oper : " + oper);
        System.out.println("currentOper" + currentOper);;
        
        isPeriod = false;  // . 사용 가능하도록
        
        switch(currentOper) {
            case "+" :
                resultNum += currentNum;
                currentOper = oper;
                break;
                
            case "-" :
                resultNum -= currentNum;
                currentOper = oper;
                break;
                
            case "*" :
                resultNum *= currentNum;
                currentOper = oper;
                break;
                
            case "/" :
                resultNum /= currentNum;
                currentOper = oper;
                break;
                
            default :
                resultNum = currentNum;
                currentOper = oper;
                break;
        }
        
        System.out.println("연산 끝! resultNum = " + resultNum);
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCHS;
    private javax.swing.JButton btnDiff;
    private javax.swing.JButton btnDiv;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMPlus;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnMul;
    private javax.swing.JButton btnNum0;
    private javax.swing.JButton btnNum1;
    private javax.swing.JButton btnNum2;
    private javax.swing.JButton btnNum3;
    private javax.swing.JButton btnNum4;
    private javax.swing.JButton btnNum5;
    private javax.swing.JButton btnNum6;
    private javax.swing.JButton btnNum7;
    private javax.swing.JButton btnNum8;
    private javax.swing.JButton btnNum9;
    private javax.swing.JButton btnPeriod;
    private javax.swing.JButton btnRem;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnSum;
    private javax.swing.JTextField txtInput;
    // End of variables declaration//GEN-END:variables
}
