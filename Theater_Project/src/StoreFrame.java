
import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import user.userDAO;

/**
 *
 * @author hansohee
 */
public class StoreFrame extends javax.swing.JFrame {
    static String id;
    int total = 0;  // 제품 총 합계 표시할 변수
    
    Connection conn;
    PreparedStatement pstmt;
    ResultSet rs;
    
    public StoreFrame(String userID) {
        initComponents();
        id = userID;
        setLocationRelativeTo(null);
        setVisible(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setResizingAllowed(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnDrinkCoke = new javax.swing.JButton();
        btnDrinkSoda = new javax.swing.JButton();
        btnDrinkFanta = new javax.swing.JButton();
        btnDrinkWater = new javax.swing.JButton();
        btnDrinkIceTea = new javax.swing.JButton();
        btnDrinkIceAmericano = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnPopcornSweet = new javax.swing.JButton();
        btnPopcornNutty = new javax.swing.JButton();
        btnPopcornOnion = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSnackSquid = new javax.swing.JButton();
        btnSnackHotdog = new javax.swing.JButton();
        btnSnackNacho = new javax.swing.JButton();
        btnSnackCheeseball = new javax.swing.JButton();
        btnPay = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAllCancle = new javax.swing.JButton();
        btnSelectedCancle = new javax.swing.JButton();
        backFrame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(769, 769));

        lblTitle.setFont(new java.awt.Font("Helvetica Neue", 0, 36)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("주유소 영화관 매점");
        lblTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N

        btnDrinkCoke.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnDrinkCoke.setText("콜라 (2,500원)");
        btnDrinkCoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkCokeActionPerformed(evt);
            }
        });

        btnDrinkSoda.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnDrinkSoda.setText("사이다 (2,500원)");
        btnDrinkSoda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkSodaActionPerformed(evt);
            }
        });

        btnDrinkFanta.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnDrinkFanta.setText("환타 (2,500원)");
        btnDrinkFanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkFantaActionPerformed(evt);
            }
        });

        btnDrinkWater.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnDrinkWater.setText("생수 (2,500원)");
        btnDrinkWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkWaterActionPerformed(evt);
            }
        });

        btnDrinkIceTea.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnDrinkIceTea.setText("아이스티 (3,000원)");
        btnDrinkIceTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkIceTeaActionPerformed(evt);
            }
        });

        btnDrinkIceAmericano.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnDrinkIceAmericano.setText("아이스아메리카노 (4,000원)");
        btnDrinkIceAmericano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDrinkIceAmericanoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDrinkSoda, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(btnDrinkFanta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDrinkCoke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDrinkIceTea, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDrinkIceAmericano)
                    .addComponent(btnDrinkWater, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDrinkCoke)
                    .addComponent(btnDrinkWater))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDrinkSoda)
                    .addComponent(btnDrinkIceTea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDrinkFanta)
                    .addComponent(btnDrinkIceAmericano))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("음료", jPanel1);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPopcornSweet.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnPopcornSweet.setText("달콤 팝콘 (5,000원)");
        btnPopcornSweet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopcornSweetActionPerformed(evt);
            }
        });

        btnPopcornNutty.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnPopcornNutty.setText("고소 팝콘 (5,500원)");
        btnPopcornNutty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopcornNuttyActionPerformed(evt);
            }
        });

        btnPopcornOnion.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnPopcornOnion.setText("어니언 팝콘 (5,500원)");
        btnPopcornOnion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopcornOnionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(187, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnPopcornOnion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPopcornNutty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPopcornSweet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(199, 199, 199))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnPopcornSweet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(btnPopcornNutty)
                .addGap(35, 35, 35)
                .addComponent(btnPopcornOnion)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("팝콘", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSnackSquid.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnSnackSquid.setText("즉석구이오징어 (5,000원)");
        btnSnackSquid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnackSquidActionPerformed(evt);
            }
        });

        btnSnackHotdog.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnSnackHotdog.setText("핫도그 (4,500원)");
        btnSnackHotdog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnackHotdogActionPerformed(evt);
            }
        });

        btnSnackNacho.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnSnackNacho.setText("칠리치즈나쵸 (4,500원)");
        btnSnackNacho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnackNachoActionPerformed(evt);
            }
        });

        btnSnackCheeseball.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        btnSnackCheeseball.setText("치즈볼 (4,500원)");
        btnSnackCheeseball.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnackCheeseballActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnSnackNacho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSnackSquid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(63, 63, 63)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSnackCheeseball, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addComponent(btnSnackHotdog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSnackSquid)
                    .addComponent(btnSnackHotdog))
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSnackNacho)
                    .addComponent(btnSnackCheeseball))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("스낵", jPanel3);

        btnPay.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        btnPay.setText("결제하기");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        jLabel1.setText("구매 리스트");

        lblTotal.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotal.setText("0");

        jTable1.setFont(new java.awt.Font("Helvetica Neue", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "제품", "개수", "금액"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setText("총 합");

        btnAllCancle.setText("주문 전체 취소");
        btnAllCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllCancleActionPerformed(evt);
            }
        });

        btnSelectedCancle.setText("선택한 주문 취소");
        btnSelectedCancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectedCancleActionPerformed(evt);
            }
        });

        backFrame.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        backFrame.setText("뒤로가기");
        backFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSelectedCancle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAllCancle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(backFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 579, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backFrame, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnAllCancle)
                        .addGap(18, 18, 18)
                        .addComponent(btnSelectedCancle)
                        .addGap(12, 12, 12))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDrinkCokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkCokeActionPerformed
        String productName = "콜라";
        int productPrice = 2500;
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnDrinkCokeActionPerformed

    private void btnDrinkSodaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkSodaActionPerformed
        int productPrice = 2500;
        String productName = "사이다";
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnDrinkSodaActionPerformed

    private void btnDrinkFantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkFantaActionPerformed
        int productPrice = 2500;
        String productName = "환타";
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnDrinkFantaActionPerformed

    private void btnDrinkWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkWaterActionPerformed
        int productPrice = 2500;
        String productName = "생수";
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnDrinkWaterActionPerformed

    private void btnDrinkIceTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkIceTeaActionPerformed
        int productPrice = 3000;
        String productName = "아이스티";
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnDrinkIceTeaActionPerformed

    private void btnDrinkIceAmericanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDrinkIceAmericanoActionPerformed
        int productPrice = 4000;
        String productName = "아이스아메리카노";
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnDrinkIceAmericanoActionPerformed

    private void btnPopcornSweetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopcornSweetActionPerformed
        int productPrice = 5000;
        String productName = "달콤팝콘";
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnPopcornSweetActionPerformed

    private void btnPopcornNuttyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopcornNuttyActionPerformed
        int productPrice = 5500;
        String productName = "고소팝콘";
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnPopcornNuttyActionPerformed

    private void btnPopcornOnionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopcornOnionActionPerformed
        int productPrice = 5500;
        String productName = "어니언팝콘";
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnPopcornOnionActionPerformed

    private void btnSnackSquidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnackSquidActionPerformed
        int productPrice = 5000;
        String productName = "즉석구이오징어";
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnSnackSquidActionPerformed

    private void btnSnackNachoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnackNachoActionPerformed
        int productPrice = 4500;
        String productName = "칠리치즈나쵸";
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnSnackNachoActionPerformed

    private void btnSnackHotdogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnackHotdogActionPerformed
        int productPrice = 4500;
        String productName = "핫도그";
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnSnackHotdogActionPerformed

    private void btnSnackCheeseballActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnackCheeseballActionPerformed
        int productPrice = 4500;
        String productName = "치즈볼";
        inputMenuTable(productName, productPrice);
    }//GEN-LAST:event_btnSnackCheeseballActionPerformed

    private void btnAllCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllCancleActionPerformed
        // 선택했던 제품들 전체 취소 버튼
        DefaultTableModel dm = (DefaultTableModel)jTable1.getModel();
        int rowCount = dm.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount - 1; i >= 0; i--) {
            dm.removeRow(i);
        }
        total = 0;  // 총합 금액은 0으로 초기화해 줌.
        lblTotal.setText(Integer.toString(total));
        
//        int iCntRow = jTable1.getRowCount();
//        System.out.println(iCntRow);
    }//GEN-LAST:event_btnAllCancleActionPerformed

    private void btnSelectedCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectedCancleActionPerformed
        // 선택한 제품만 (행) 취소 버튼
        
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
//        System.out.println(selectedRow);
        int price = (int)(jTable1.getValueAt(selectedRow, 2));
//        System.out.println(price);
        total -= price;
        
        lblTotal.setText(Integer.toString(total));
        model.removeRow(selectedRow);
        
    }//GEN-LAST:event_btnSelectedCancleActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        // 결제하기 버튼 클릭 시 이벤트
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        boolean check = true;
        
        // if 문 이용하여 총합 금액의 텍스트의 문자열이 0이라면 결제 실패 메시지(선택된 제품이 없음) 창 생성
        if ((lblTotal.getText()).equals("0")) {
            JOptionPane.showMessageDialog(null, "선택된 제품이 없습니다. 제품을  선택해 주십시오.",
                                        "결제 실패", JOptionPane.ERROR_MESSAGE);
            check = false;
        }
        
        // 유저 이름 가져오기
        String name = getName();
        
        if (name == null) {
            System.out.println("이름 없음.");
        }
        
        // 값 전달 테스트
        String storeTotal = "";
        String product = "";
        String price = "";
        String count = "";
        String lbl = "<html>";
        
        storeTotal = lblTotal.getText();
        int iCntRow = 0;
        iCntRow = jTable1.getRowCount();
        
        for (int i = 0; i < iCntRow; i++) {
            product = String.valueOf(model.getValueAt(i, 0));
            count = String.valueOf(model.getValueAt(i, 1));
            price = String.valueOf(model.getValueAt(i, 2));
            lbl += product + " " + price + " " + count + "<br>";
            System.out.println(lbl);
        }
        lbl += "</html>";
        
        if (check) {  // 선택된 제품이 있을 경우
            dispose();  // 현재 윈도우만 닫기
            new StoreReceipt(storeTotal, lbl, name);  // 매점 영수증 frame으로 이동 + 구매하는 제품들과 총합 금액도 같이..
        }
        // 값 전달 테스트 끝
    }//GEN-LAST:event_btnPayActionPerformed

    private void backFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backFrameActionPerformed
        dispose();
        new MainFrame2(id);
    }//GEN-LAST:event_backFrameActionPerformed

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
            java.util.logging.Logger.getLogger(StoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StoreFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run(){
//                new StoreFrame().setVisible(true);
//            }
//        });
    }
    
    public void inputMenuTable(String btnName, int price) {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int iCntRow = 0;  // 전체 행 개수
        String product = "";
        int productPrice = 0;
        
        product = btnName;
        productPrice = price;
        total += productPrice;  // 총합계 누적
        
        iCntRow = jTable1.getRowCount();
        
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (jTable1.getValueAt(i, 0) == null) {
                iCntRow = i;
                break;
            }
        }
        model.addRow(new Object[]{product, "1", productPrice});  // 제품 선택할 때마다 테이블 행(row)생성
        
//        jTable1.setValueAt(product, iCntRow, 0);  // 제품
//        jTable1.setValueAt("1", iCntRow, 1);  // 개수 (1로 통일한다)
//        jTable1.setValueAt(productPrice, iCntRow, 2);  // 가격
        
        lblTotal.setText(Integer.toString(total)); // 제품 선택할 때마다 총합 금액 누적
    }
    
    public class MakeRowData {
        public String strProduct;
        public int iPrice;
    }
    
    public String getName(userDAO nUser) {
        String sql = "select userName from user where userId = ?";
        try {
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                return rs.getString("userName");
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backFrame;
    private javax.swing.JButton btnAllCancle;
    private javax.swing.JButton btnDrinkCoke;
    private javax.swing.JButton btnDrinkFanta;
    private javax.swing.JButton btnDrinkIceAmericano;
    private javax.swing.JButton btnDrinkIceTea;
    private javax.swing.JButton btnDrinkSoda;
    private javax.swing.JButton btnDrinkWater;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnPopcornNutty;
    private javax.swing.JButton btnPopcornOnion;
    private javax.swing.JButton btnPopcornSweet;
    private javax.swing.JButton btnSelectedCancle;
    private javax.swing.JButton btnSnackCheeseball;
    private javax.swing.JButton btnSnackHotdog;
    private javax.swing.JButton btnSnackNacho;
    private javax.swing.JButton btnSnackSquid;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    // End of variables declaration//GEN-END:variables
}
