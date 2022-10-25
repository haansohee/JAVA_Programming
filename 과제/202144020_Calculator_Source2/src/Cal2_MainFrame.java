
public class Cal2_MainFrame extends javax.swing.JFrame {

    public Cal2_MainFrame() {
        initComponents();
        enabledBtn("Oct");
        enabledBtn("StaClose");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jFrameSta = new javax.swing.JFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lblTitle = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        radioHex = new javax.swing.JRadioButton();
        radioDec = new javax.swing.JRadioButton();
        radioOct = new javax.swing.JRadioButton();
        radioBin = new javax.swing.JRadioButton();
        radioDegrees = new javax.swing.JRadioButton();
        radioRadians = new javax.swing.JRadioButton();
        radioGrands = new javax.swing.JRadioButton();
        checkBoxInv = new javax.swing.JCheckBox();
        checkBoxHyp = new javax.swing.JCheckBox();
        btnSta = new javax.swing.JButton();
        btnAve = new javax.swing.JButton();
        btnSum = new javax.swing.JButton();
        btnS = new javax.swing.JButton();
        btnDat = new javax.swing.JButton();
        btnFE = new javax.swing.JButton();
        btnDms = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btn2square = new javax.swing.JButton();
        btnBracket1 = new javax.swing.JButton();
        btnExp = new javax.swing.JButton();
        btnYsquare = new javax.swing.JButton();
        btn3square = new javax.swing.JButton();
        btnFountainValue = new javax.swing.JButton();
        btnBracket2 = new javax.swing.JButton();
        btnLn = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();
        btnPi = new javax.swing.JButton();
        btnMC = new javax.swing.JButton();
        btnMR = new javax.swing.JButton();
        btnMS = new javax.swing.JButton();
        btnMp = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnA = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btnChs = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnPeriod = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnDivi = new javax.swing.JButton();
        btnMulti = new javax.swing.JButton();
        btnSub = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        bntMod = new javax.swing.JButton();
        btnOr = new javax.swing.JButton();
        btnLsh = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnAnd = new javax.swing.JButton();
        btnXor = new javax.swing.JButton();
        btnNot = new javax.swing.JButton();
        btnInt = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClearEntry = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();

        jFrameSta.setTitle("통계 상자");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "1", "2" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        lblTitle.setText("통계 상자");

        javax.swing.GroupLayout jFrameStaLayout = new javax.swing.GroupLayout(jFrameSta.getContentPane());
        jFrameSta.getContentPane().setLayout(jFrameStaLayout);
        jFrameStaLayout.setHorizontalGroup(
            jFrameStaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameStaLayout.createSequentialGroup()
                .addGroup(jFrameStaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameStaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrameStaLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(lblTitle)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jFrameStaLayout.setVerticalGroup(
            jFrameStaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameStaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.setText("0");

        buttonGroup1.add(radioHex);
        radioHex.setText("Hex");
        radioHex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioHexActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioDec);
        radioDec.setText("Dec");
        radioDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioDecActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioOct);
        radioOct.setSelected(true);
        radioOct.setText("Oct");
        radioOct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioOctActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioBin);
        radioBin.setText("Bin");
        radioBin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBinActionPerformed(evt);
            }
        });

        buttonGroup2.add(radioDegrees);
        radioDegrees.setSelected(true);
        radioDegrees.setText("Degrees");

        buttonGroup2.add(radioRadians);
        radioRadians.setText("Radians");

        buttonGroup2.add(radioGrands);
        radioGrands.setText("Grads");

        checkBoxInv.setText("Inv");

        checkBoxHyp.setText("Hyp");

        btnSta.setText("Sta");
        btnSta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaActionPerformed(evt);
            }
        });

        btnAve.setText("Ave");
        btnAve.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnAve.setMaximumSize(new java.awt.Dimension(51, 23));
        btnAve.setMinimumSize(new java.awt.Dimension(51, 23));

        btnSum.setText("Sum");
        btnSum.setMargin(new java.awt.Insets(2, 0, 2, 0));

        btnS.setText("S");
        btnS.setMargin(new java.awt.Insets(2, 0, 2, 0));

        btnDat.setText("Dat");
        btnDat.setMargin(new java.awt.Insets(2, 0, 2, 0));

        btnFE.setText("F-E");
        btnFE.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnFE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFEActionPerformed(evt);
            }
        });

        btnDms.setText("dms");
        btnDms.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnDms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDmsActionPerformed(evt);
            }
        });

        btnSin.setText("sin");
        btnSin.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btnCos.setText("cos");
        btnCos.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnTan.setText("tan");
        btnTan.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btn2square.setText("x^2");
        btn2square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2squareActionPerformed(evt);
            }
        });

        btnBracket1.setText("(");

        btnExp.setText("Exp");
        btnExp.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExpActionPerformed(evt);
            }
        });

        btnYsquare.setText("x^y");
        btnYsquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYsquareActionPerformed(evt);
            }
        });

        btn3square.setText("x^3");
        btn3square.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3squareActionPerformed(evt);
            }
        });

        btnFountainValue.setText("1/x");
        btnFountainValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFountainValueActionPerformed(evt);
            }
        });

        btnBracket2.setText(")");

        btnLn.setText("In");
        btnLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLnActionPerformed(evt);
            }
        });

        btnLog.setText("log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });

        btnFactorial.setText("n!");
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });

        btnPi.setText("pi");
        btnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiActionPerformed(evt);
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

        btnMp.setText("M+");
        btnMp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMpActionPerformed(evt);
            }
        });

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });

        btnA.setText("A");
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btnChs.setText("+/-");
        btnChs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChsActionPerformed(evt);
            }
        });

        btnB.setText("B");
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btnPeriod.setText(".");
        btnPeriod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeriodActionPerformed(evt);
            }
        });

        btnC.setText("C");
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnDivi.setText("/");
        btnDivi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiviActionPerformed(evt);
            }
        });

        btnMulti.setText("*");
        btnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiActionPerformed(evt);
            }
        });

        btnSub.setText("-");
        btnSub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubActionPerformed(evt);
            }
        });

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnD.setText("D");
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        bntMod.setText("Mod");
        bntMod.setMargin(new java.awt.Insets(2, 0, 2, 0));
        bntMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntModActionPerformed(evt);
            }
        });

        btnOr.setText("Or");
        btnOr.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnOr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrActionPerformed(evt);
            }
        });

        btnLsh.setText("Lsh");
        btnLsh.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnLsh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLshActionPerformed(evt);
            }
        });

        btnResult.setText("=");
        btnResult.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        btnE.setText("E");
        btnE.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnAnd.setText("And");
        btnAnd.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnAnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAndActionPerformed(evt);
            }
        });

        btnXor.setText("Xor");
        btnXor.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnXor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXorActionPerformed(evt);
            }
        });

        btnNot.setText("Not");
        btnNot.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnNot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotActionPerformed(evt);
            }
        });

        btnInt.setText("Int");
        btnInt.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnInt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIntActionPerformed(evt);
            }
        });

        btnF.setText("F");
        btnF.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClearEntry.setText("CE");
        btnClearEntry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearEntryActionPerformed(evt);
            }
        });

        btnBackspace.setText("Backspace");
        btnBackspace.setMargin(new java.awt.Insets(2, 0, 2, 0));
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(checkBoxInv)
                        .addGap(7, 7, 7)
                        .addComponent(checkBoxHyp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClearEntry, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnDat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAve, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnFE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDms, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnCos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnTan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnExp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnYsquare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn3square, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn2square, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBracket1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnLog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBracket2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFountainValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnFactorial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnMC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioHex)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioDec)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioOct)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBin)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioDegrees)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioRadians)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioGrands)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(13, 13, 13)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnChs, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnPeriod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnC, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnDivi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnOr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLsh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(btnResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bntMod, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnXor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnNot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnInt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAnd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioHex)
                    .addComponent(radioDec)
                    .addComponent(radioOct)
                    .addComponent(radioBin)
                    .addComponent(radioDegrees)
                    .addComponent(radioRadians)
                    .addComponent(radioGrands))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkBoxInv)
                    .addComponent(checkBoxHyp)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnClear)
                        .addComponent(btnClearEntry)
                        .addComponent(btnBackspace)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnDivi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMulti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSub)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnD))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSum)
                            .addComponent(btnSin))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnS)
                            .addComponent(btnCos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDat)
                            .addComponent(btnTan)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDms))
                    .addComponent(btnBracket1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBracket2)
                        .addGap(33, 33, 33)
                        .addComponent(btnLog))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnMC)
                                .addComponent(btn7)
                                .addComponent(btn8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMR)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMS)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnMp)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnPi))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnExp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnYsquare)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3square)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn2square))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLn)
                                .addGap(33, 33, 33)
                                .addComponent(btnFactorial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFountainValue))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnPeriod))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btn2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(btnChs)
                                                    .addComponent(btn0)))
                                            .addComponent(btn1)))
                                    .addComponent(btn4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnA)
                            .addComponent(btnB)
                            .addComponent(btnC)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAnd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnXor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnInt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bntMod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOr)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLsh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        input_screen("0");
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        input_screen("1");
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        input_screen("2");
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        input_screen("3");
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        input_screen("4");
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        input_screen("5");
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        input_screen("6");
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        input_screen("7");
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        input_screen("8");
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        input_screen("9");
    }//GEN-LAST:event_btn9ActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        jTextField1.setText("0");
        init("Clear");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnPeriodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeriodActionPerformed
        input_screen(".");
    }//GEN-LAST:event_btnPeriodActionPerformed

    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        operate("=");
        System.out.println("(=)resultNum : " + resultNum);
        jTextField1.setText(Double.toString(resultNum));
        //init("=");
    }//GEN-LAST:event_btnResultActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        operate("+");
         jTextField1.setText("0");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubActionPerformed
        operate("-");
        jTextField1.setText("0");
    }//GEN-LAST:event_btnSubActionPerformed

    private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
        operate("*");
        jTextField1.setText("0");
    }//GEN-LAST:event_btnMultiActionPerformed

    private void btnDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiviActionPerformed
        operate("/");
        jTextField1.setText("0");
    }//GEN-LAST:event_btnDiviActionPerformed

    private void btnClearEntryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearEntryActionPerformed
        jTextField1.setText("0");
        init("ClearEntry");
    }//GEN-LAST:event_btnClearEntryActionPerformed

    private void btnMCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMCActionPerformed
        jTextField1.setText("0");
        init("ClearMemory");
    }//GEN-LAST:event_btnMCActionPerformed

    private void btnMRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMRActionPerformed
        jTextField1.setText(Double.toString(memoryNum));
    }//GEN-LAST:event_btnMRActionPerformed

    private void btnMSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMSActionPerformed
        memoryNum = Double.parseDouble(jTextField1.getText());
    }//GEN-LAST:event_btnMSActionPerformed

    private void btnMpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMpActionPerformed
        double num = Double.parseDouble(jTextField1.getText());
        if(num < 0) {
            num = num * -1;
        }
        memoryNum = num;
    }//GEN-LAST:event_btnMpActionPerformed

    private void btnChsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChsActionPerformed
        resultNum *= -1;
    }//GEN-LAST:event_btnChsActionPerformed

    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackspaceActionPerformed
        if(jTextField1.getText().equals("0") || jTextField1.getText().length() <= 1) {
            jTextField1.setText("0");
        } else if (jTextField1.getText().length() > 0) {
            String subString = jTextField1.getText().substring(0, jTextField1.getText().length() - 1);
            jTextField1.setText(subString);
        }
    }//GEN-LAST:event_btnBackspaceActionPerformed

    private void bntModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntModActionPerformed
        operate("%");
        jTextField1.setText("0");
    }//GEN-LAST:event_bntModActionPerformed

    private void btnAndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAndActionPerformed
        operate("&");
        jTextField1.setText("0");
    }//GEN-LAST:event_btnAndActionPerformed

    private void btnOrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrActionPerformed
        operate("|");
        jTextField1.setText("0");
    }//GEN-LAST:event_btnOrActionPerformed

    private void btnXorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXorActionPerformed
        operate("^");
        jTextField1.setText("0");
    }//GEN-LAST:event_btnXorActionPerformed

    private void btnLshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLshActionPerformed
        operate("<");
        jTextField1.setText("0");
    }//GEN-LAST:event_btnLshActionPerformed

    private void btnNotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotActionPerformed
        // 비트별 역수 구하기
//        operate("Not");
        currentNum = Double.parseDouble(jTextField1.getText());
        resultNum = ~(int)currentNum;
        jTextField1.setText(Double.toString(resultNum));
    }//GEN-LAST:event_btnNotActionPerformed

    private void btnIntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIntActionPerformed
        // int형으로 변환
        currentNum = Double.parseDouble(jTextField1.getText());
        int temp = (int)currentNum;
        resultNum = (int)currentNum;
        jTextField1.setText(Double.toString(temp));
    }//GEN-LAST:event_btnIntActionPerformed

    private void btn2squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2squareActionPerformed
        currentNum = Double.parseDouble(jTextField1.getText());
        resultNum = currentNum * currentNum;
        jTextField1.setText(Double.toString(resultNum));
    }//GEN-LAST:event_btn2squareActionPerformed

    private void btn3squareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3squareActionPerformed
        currentNum = Double.parseDouble(jTextField1.getText());
        resultNum = currentNum * currentNum * currentNum;
        jTextField1.setText(Double.toString(resultNum));
    }//GEN-LAST:event_btn3squareActionPerformed

    private void btnYsquareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYsquareActionPerformed
        operate("y");
        jTextField1.setText("0");
    }//GEN-LAST:event_btnYsquareActionPerformed

    private void btnFountainValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFountainValueActionPerformed
        currentNum = Double.parseDouble(jTextField1.getText());
        resultNum = 1 / currentNum;
        jTextField1.setText(Double.toString(resultNum));
    }//GEN-LAST:event_btnFountainValueActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        currentNum = Double.parseDouble((jTextField1.getText()));
        
        double tempNum = 1.0;
        
        while(currentNum > 1.0) {
            tempNum *= currentNum;
            currentNum--;
        }
        
        jTextField1.setText(Double.toString(resultNum));
    }//GEN-LAST:event_btnFactorialActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        currentNum = Double.parseDouble(jTextField1.getText());
        resultNum = Math.log10(currentNum);
        jTextField1.setText(Double.toString(resultNum));
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLnActionPerformed
        currentNum = Double.parseDouble(jTextField1.getText());
        resultNum = Math.log(currentNum);
        jTextField1.setText(Double.toString(resultNum));
    }//GEN-LAST:event_btnLnActionPerformed

    private void btnExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExpActionPerformed
        currentNum = Double.parseDouble(jTextField1.getText());
        resultNum = Math.exp(currentNum);
        jTextField1.setText(Double.toString(resultNum));
    }//GEN-LAST:event_btnExpActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        currentNum = Double.parseDouble(jTextField1.getText());
        resultNum = Math.sin(Math.toRadians(currentNum));
        jTextField1.setText(Double.toString(resultNum));
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        currentNum = Double.parseDouble(jTextField1.getText());
        resultNum = Math.cos(Math.toRadians(currentNum));
        jTextField1.setText(Double.toString(resultNum));
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        currentNum = Double.parseDouble(jTextField1.getText());
        resultNum = Math.tan(Math.toRadians(currentNum));
        jTextField1.setText(Double.toString(resultNum));
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnFEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFEActionPerformed

    private void btnDmsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDmsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDmsActionPerformed

    private void btnPiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiActionPerformed
        currentNum = Math.PI;
        jTextField1.setText(Double.toString(currentNum));
    }//GEN-LAST:event_btnPiActionPerformed

    private void radioHexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioHexActionPerformed
        enabledBtn("Hex");
    }//GEN-LAST:event_radioHexActionPerformed

    private void radioDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioDecActionPerformed
        enabledBtn("Dec");
    }//GEN-LAST:event_radioDecActionPerformed

    private void radioOctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioOctActionPerformed
        enabledBtn("Oct");
    }//GEN-LAST:event_radioOctActionPerformed

    private void radioBinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBinActionPerformed
        enabledBtn("Bin");
    }//GEN-LAST:event_radioBinActionPerformed

    private void btnStaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaActionPerformed
        enabledBtn("Sta");
    }//GEN-LAST:event_btnStaActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        input_screen("A");
        currentNum += 10;
    }//GEN-LAST:event_btnAActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        input_screen("B");
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        input_screen("C");
    }//GEN-LAST:event_btnCActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        input_screen("D");
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        input_screen("E");
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        input_screen("F");
    }//GEN-LAST:event_btnFActionPerformed

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
            java.util.logging.Logger.getLogger(Cal2_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cal2_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cal2_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cal2_MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cal2_MainFrame().setVisible(true);
            }
        });
    }
    
    private double resultNum = 0;   //결과값을 저장할 전역변수
    private double currentNum = 0;  //현재값을 저장할 전역변수
    private String currentOper = ""; //현재 연산자를 저장할 변수 null로 할 경우 에러
    boolean isPeriod = false;   // "."의 중복 제거
    
    private double memoryNum = 0;
    
    private void init(String i) {
        if(i.equals("Clear")) {
            resultNum = 0;
            currentNum = 0;
            currentOper = "";
            memoryNum = 0;
        } else if (i.equals("ClearEntry")) {
            currentNum = 0;
        } else if (i.equals("ClearMemory")) {
            memoryNum = 0;
        }
    }
    
    private void input_screen(String num) {
        
        String str = jTextField1.getText();
        
        
        System.out.println(isPeriod);
        if(str.equals("0") && num.equals("0")) {    // 0 중복 불가
            jTextField1.setText("0");
        } else if(isPeriod == true && num.equals(".")) {
            
        } else if (str.equals("0") && num.equals(".")) { //0일 때 .를 입력하면 0. 으로 출력
            jTextField1.setText("0.");
            isPeriod = true;
        } else if(str.equals("0") && !num.equals("0")) { //0일 때 다른 숫자를 입력할 경우 0을 제거 하고 숫자 입력
            jTextField1.setText(num);
        }  else {
            jTextField1.setText(str + num);
        }
        
        if (num.equals(".")) {
            isPeriod = true;
        }
        
    }
    
    public void operate(String oper) {
        currentNum = Double.parseDouble(jTextField1.getText());
        System.out.println("연산전 currentNum : " + currentNum);
        System.out.println("연산전 resultNum : " + resultNum);
        System.out.println("oper : " + oper);
        System.out.println("currentOper : " + currentOper);
        isPeriod = false;   // .을 사용할 수 있게 해줌
        switch(currentOper) {
            case "+" :  // 덧셈
                resultNum += currentNum;
                currentOper = oper;
                break;
            case "-" :  // 뺄셈
                resultNum -= currentNum;
                currentOper = oper;
                break;
            case "*" :  // 곱셈
                resultNum *= currentNum;
                currentOper = oper;
                break;
            case "/" :  // 나눗셈
                resultNum /= currentNum;
                currentOper = oper;
                break;
            case "%" :  // Mod
                resultNum %= currentNum;
                currentOper = oper;
                break;
            case "&" :  // And
                resultNum = (int)resultNum & (int)currentNum;
                break;
            case "|" :  // Or
                resultNum = (int)resultNum | (int)currentNum;
                break;
            case "^" :  // Xor
                resultNum = (int)resultNum ^ (int)currentNum;
                break;
            case "<" :  // Lsh
                resultNum = (int)resultNum << (int)currentNum;
                break;
            case "y" :  // x^y
                resultNum = Math.pow(resultNum, currentNum);
                break;
            
            default:
                resultNum = currentNum;
                currentOper = oper;
                break;
                
        }
        System.out.println("연산 끝 resultNum : " + resultNum);
//        if(oper.equals("=")) {
//            currentOper = "";
//            System.out.println(currentOper);
//        }
    }
    
    public void enabledBtn(String e) {
        
        if(e.equals("Sta")) {
            btnAve.setEnabled(true);
            btnSum.setEnabled(true);
            btnS.setEnabled(true);
            btnDat.setEnabled(true);
            
            jFrameSta.setSize(400, 300);
            jFrameSta.setVisible(true);
        } else if(e.equals("StaClose")) {
            btnAve.setEnabled(false);
            btnSum.setEnabled(false);
            btnS.setEnabled(false);
            btnDat.setEnabled(false);
        }
        
        if(e.equals("Hex")) {
            btn0.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            
            btnA.setEnabled(true);
            btnB.setEnabled(true);
            btnC.setEnabled(true);
            btnD.setEnabled(true);
            btnE.setEnabled(true);
            btnF.setEnabled(true);
        } else if(e.equals("Dec")) {
            btn0.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            
            btnA.setEnabled(true);
            btnB.setEnabled(true);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
        } else if(e.equals("Bin")) {
            btn0.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(false);
            btn3.setEnabled(false);
            btn4.setEnabled(false);
            btn5.setEnabled(false);
            btn6.setEnabled(false);
            btn7.setEnabled(false);
            btn8.setEnabled(false);
            btn9.setEnabled(false);
            
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
        } else {    // "Oct"
            btn0.setEnabled(true);
            btn1.setEnabled(true);
            btn2.setEnabled(true);
            btn3.setEnabled(true);
            btn4.setEnabled(true);
            btn5.setEnabled(true);
            btn6.setEnabled(true);
            btn7.setEnabled(true);
            btn8.setEnabled(true);
            btn9.setEnabled(true);
            
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntMod;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn2square;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn3square;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAnd;
    private javax.swing.JButton btnAve;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnBracket1;
    private javax.swing.JButton btnBracket2;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnChs;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearEntry;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnDat;
    private javax.swing.JButton btnDivi;
    private javax.swing.JButton btnDms;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnExp;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnFE;
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnFountainValue;
    private javax.swing.JButton btnInt;
    private javax.swing.JButton btnLn;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnLsh;
    private javax.swing.JButton btnMC;
    private javax.swing.JButton btnMR;
    private javax.swing.JButton btnMS;
    private javax.swing.JButton btnMp;
    private javax.swing.JButton btnMulti;
    private javax.swing.JButton btnNot;
    private javax.swing.JButton btnOr;
    private javax.swing.JButton btnPeriod;
    private javax.swing.JButton btnPi;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnS;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSta;
    private javax.swing.JButton btnSub;
    private javax.swing.JButton btnSum;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnXor;
    private javax.swing.JButton btnYsquare;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkBoxHyp;
    private javax.swing.JCheckBox checkBoxInv;
    private javax.swing.JFrame jFrameSta;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton radioBin;
    private javax.swing.JRadioButton radioDec;
    private javax.swing.JRadioButton radioDegrees;
    private javax.swing.JRadioButton radioGrands;
    private javax.swing.JRadioButton radioHex;
    private javax.swing.JRadioButton radioOct;
    private javax.swing.JRadioButton radioRadians;
    // End of variables declaration//GEN-END:variables
}
