
import movie.movieDAO;
import movie.movieDTO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author juhoonlee
 */
public class chooseSeat extends javax.swing.JFrame {

    /**
     * Creates new form chooseSeat
     */
    
    public chooseSeat(movieDTO dto) {
        initComponents();
        movieDAO dao = new movieDAO();
        int available[] = dao.seat(dto.Getmovie());
        if(available[0] == 1){
            seatA1.setEnabled(false);
        }
        if(available[1] == 1){
            seatA2.setEnabled(false);
        }
        if(available[2] == 1){
            seatA3.setEnabled(false);
        }
        if(available[3] == 1){
            seatA4.setEnabled(false);
        }
        if(available[4] == 1){
            seatA5.setEnabled(false);
        }
        if(available[5] == 1){
            seatA6.setEnabled(false);
        }
        if(available[6] == 1){
            seatA7.setEnabled(false);
        }
        if(available[7] == 1){
            seatA8.setEnabled(false);
        }
        if(available[8] == 1){
            seatB1.setEnabled(false);
        }
        if(available[9] == 1){
            seatB2.setEnabled(false);
        }
        if(available[10] == 1){
            seatB3.setEnabled(false);
        }
        if(available[11] == 1){
            seatB4.setEnabled(false);
        }
        if(available[12] == 1){
            seatB5.setEnabled(false);
        }
        if(available[13] == 1){
            seatB6.setEnabled(false);
        }
        if(available[14] == 1){
            seatB7.setEnabled(false);
        }
        if(available[15] == 1){
            seatB8.setEnabled(false);
        }
        if(available[16] == 1){
            seatC1.setEnabled(false);
        }
        if(available[17] == 1){
            seatC2.setEnabled(false);
        }
        if(available[18] == 1){
            seatC3.setEnabled(false);
        }
        if(available[19] == 1){
            seatC4.setEnabled(false);
        }
        if(available[20] == 1){
            seatC5.setEnabled(false);
        }
        if(available[21] == 1){
            seatC6.setEnabled(false);
        }
        if(available[22] == 1){
            seatC7.setEnabled(false);
        }
        if(available[23] == 1){
            seatC8.setEnabled(false);
        }
        if(available[24] == 1){
            seatD1.setEnabled(false);
        }
        if(available[25] == 1){
            seatD2.setEnabled(false);
        }
        if(available[26] == 1){
            seatD3.setEnabled(false);
        }
        if(available[27] == 1){
            seatD4.setEnabled(false);
        }
        if(available[28] == 1){
            seatD5.setEnabled(false);
        }
        if(available[29] == 1){
            seatD6.setEnabled(false);
        }
        if(available[30] == 1){
            seatD7.setEnabled(false);
        }
        if(available[31] == 1){
            seatD8.setEnabled(false);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        seatScreen = new javax.swing.JLabel();
        seatA1 = new javax.swing.JCheckBox();
        seatA2 = new javax.swing.JCheckBox();
        seatB1 = new javax.swing.JCheckBox();
        seatB2 = new javax.swing.JCheckBox();
        seatC1 = new javax.swing.JCheckBox();
        seatC2 = new javax.swing.JCheckBox();
        seatD1 = new javax.swing.JCheckBox();
        seatD2 = new javax.swing.JCheckBox();
        seatC4 = new javax.swing.JCheckBox();
        seatD3 = new javax.swing.JCheckBox();
        seatD4 = new javax.swing.JCheckBox();
        seatA3 = new javax.swing.JCheckBox();
        seatA4 = new javax.swing.JCheckBox();
        seatB3 = new javax.swing.JCheckBox();
        seatB4 = new javax.swing.JCheckBox();
        seatC3 = new javax.swing.JCheckBox();
        seatC6 = new javax.swing.JCheckBox();
        seatD5 = new javax.swing.JCheckBox();
        seatD6 = new javax.swing.JCheckBox();
        seatA5 = new javax.swing.JCheckBox();
        seatA6 = new javax.swing.JCheckBox();
        seatB5 = new javax.swing.JCheckBox();
        seatB6 = new javax.swing.JCheckBox();
        seatC5 = new javax.swing.JCheckBox();
        seatC8 = new javax.swing.JCheckBox();
        seatD7 = new javax.swing.JCheckBox();
        seatD8 = new javax.swing.JCheckBox();
        seatA7 = new javax.swing.JCheckBox();
        seatA8 = new javax.swing.JCheckBox();
        seatB7 = new javax.swing.JCheckBox();
        seatB8 = new javax.swing.JCheckBox();
        seatC7 = new javax.swing.JCheckBox();
        seatPrice = new javax.swing.JLabel();
        seatCount = new javax.swing.JLabel();
        seatPay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        seatScreen.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        seatScreen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        seatScreen.setText("screen");

        seatA1.setText("A1");
        seatA1.setSize(new java.awt.Dimension(30, 30));
        seatA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatA1ActionPerformed(evt);
            }
        });

        seatA2.setText("A2");
        seatA2.setSize(new java.awt.Dimension(30, 30));
        seatA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatA2ActionPerformed(evt);
            }
        });

        seatB1.setText("B1");
        seatB1.setSize(new java.awt.Dimension(30, 30));
        seatB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatB1ActionPerformed(evt);
            }
        });

        seatB2.setText("B2");
        seatB2.setSize(new java.awt.Dimension(30, 30));
        seatB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatB2ActionPerformed(evt);
            }
        });

        seatC1.setText("C1");
        seatC1.setSize(new java.awt.Dimension(30, 30));
        seatC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatC1ActionPerformed(evt);
            }
        });

        seatC2.setText("C2");
        seatC2.setSize(new java.awt.Dimension(30, 30));
        seatC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatC2ActionPerformed(evt);
            }
        });

        seatD1.setText("D1");
        seatD1.setSize(new java.awt.Dimension(30, 30));
        seatD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatD1ActionPerformed(evt);
            }
        });

        seatD2.setText("D2");
        seatD2.setSize(new java.awt.Dimension(30, 30));
        seatD2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatD2ActionPerformed(evt);
            }
        });

        seatC4.setText("C4");
        seatC4.setSize(new java.awt.Dimension(30, 30));
        seatC4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatC4ActionPerformed(evt);
            }
        });

        seatD3.setText("D3");
        seatD3.setSize(new java.awt.Dimension(30, 30));
        seatD3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatD3ActionPerformed(evt);
            }
        });

        seatD4.setText("D4");
        seatD4.setSize(new java.awt.Dimension(30, 30));
        seatD4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatD4ActionPerformed(evt);
            }
        });

        seatA3.setText("A3");
        seatA3.setSize(new java.awt.Dimension(30, 30));
        seatA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatA3ActionPerformed(evt);
            }
        });

        seatA4.setText("A4");
        seatA4.setSize(new java.awt.Dimension(30, 30));
        seatA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatA4ActionPerformed(evt);
            }
        });

        seatB3.setText("B3");
        seatB3.setSize(new java.awt.Dimension(30, 30));
        seatB3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatB3ActionPerformed(evt);
            }
        });

        seatB4.setText("B4");
        seatB4.setSize(new java.awt.Dimension(30, 30));
        seatB4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatB4ActionPerformed(evt);
            }
        });

        seatC3.setText("C3");
        seatC3.setSize(new java.awt.Dimension(30, 30));
        seatC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatC3ActionPerformed(evt);
            }
        });

        seatC6.setText("C6");
        seatC6.setSize(new java.awt.Dimension(30, 30));
        seatC6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatC6ActionPerformed(evt);
            }
        });

        seatD5.setText("D5");
        seatD5.setSize(new java.awt.Dimension(30, 30));
        seatD5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatD5ActionPerformed(evt);
            }
        });

        seatD6.setText("D6");
        seatD6.setSize(new java.awt.Dimension(30, 30));
        seatD6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatD6ActionPerformed(evt);
            }
        });

        seatA5.setText("A5");
        seatA5.setSize(new java.awt.Dimension(30, 30));
        seatA5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatA5ActionPerformed(evt);
            }
        });

        seatA6.setText("A6");
        seatA6.setSize(new java.awt.Dimension(30, 30));
        seatA6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatA6ActionPerformed(evt);
            }
        });

        seatB5.setText("B5");
        seatB5.setSize(new java.awt.Dimension(30, 30));
        seatB5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatB5ActionPerformed(evt);
            }
        });

        seatB6.setText("B6");
        seatB6.setSize(new java.awt.Dimension(30, 30));
        seatB6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatB6ActionPerformed(evt);
            }
        });

        seatC5.setText("C5");
        seatC5.setSize(new java.awt.Dimension(30, 30));
        seatC5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatC5ActionPerformed(evt);
            }
        });

        seatC8.setText("C8");
        seatC8.setSize(new java.awt.Dimension(30, 30));
        seatC8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatC8ActionPerformed(evt);
            }
        });

        seatD7.setText("D7");
        seatD7.setSize(new java.awt.Dimension(30, 30));
        seatD7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatD7ActionPerformed(evt);
            }
        });

        seatD8.setText("D8");
        seatD8.setSize(new java.awt.Dimension(30, 30));
        seatD8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatD8ActionPerformed(evt);
            }
        });

        seatA7.setText("A7");
        seatA7.setSize(new java.awt.Dimension(30, 30));
        seatA7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatA7ActionPerformed(evt);
            }
        });

        seatA8.setText("A8");
        seatA8.setSize(new java.awt.Dimension(30, 30));
        seatA8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatA8ActionPerformed(evt);
            }
        });

        seatB7.setText("B7");
        seatB7.setSize(new java.awt.Dimension(30, 30));
        seatB7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatB7ActionPerformed(evt);
            }
        });

        seatB8.setText("B8");
        seatB8.setSize(new java.awt.Dimension(30, 30));
        seatB8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatB8ActionPerformed(evt);
            }
        });

        seatC7.setText("C7");
        seatC7.setSize(new java.awt.Dimension(30, 30));
        seatC7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatC7ActionPerformed(evt);
            }
        });

        seatPrice.setText("금액: 0");

        seatCount.setText("인원수: 0");

        seatPay.setText("결제하기");
        seatPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seatPayActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seatA1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seatA2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(seatB1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seatB2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(seatC1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seatC2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(seatD1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seatD2)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seatA3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seatA4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(seatB3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seatB4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(seatC3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seatC4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(seatD3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(seatD4)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seatA5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seatA6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(seatCount)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(seatB5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(seatB6))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(seatC5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(seatC6))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(seatD5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(seatD6)))
                                    .addComponent(seatPrice)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seatScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(seatA7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(seatA8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(seatPay)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(seatB7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(seatB8))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(seatC7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(seatC8))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(seatD7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(seatD8))))))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(seatScreen)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatA1)
                                .addComponent(seatA2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatB1)
                                .addComponent(seatB2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatC1)
                                .addComponent(seatC2))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatD1)
                                .addComponent(seatD2)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatA3)
                                .addComponent(seatA4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatB3)
                                .addComponent(seatB4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatC3)
                                .addComponent(seatC4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatD3)
                                .addComponent(seatD4)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatA5)
                                .addComponent(seatA6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatB5)
                                .addComponent(seatB6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatC5)
                                .addComponent(seatC6))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(seatD5)
                                .addComponent(seatD6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatA7)
                            .addComponent(seatA8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatB7)
                            .addComponent(seatB8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatC7)
                            .addComponent(seatC8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seatD7)
                            .addComponent(seatD8))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(seatPrice)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seatPay, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(seatCount, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void seatPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatPayActionPerformed
        movieDAO dao = new movieDAO();
        
    }//GEN-LAST:event_seatPayActionPerformed

    private void seatA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatA1ActionPerformed

    private void seatA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatA2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatA2ActionPerformed

    private void seatA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatA3ActionPerformed

    private void seatA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatA4ActionPerformed

    private void seatA5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatA5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatA5ActionPerformed

    private void seatA6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatA6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatA6ActionPerformed

    private void seatA7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatA7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatA7ActionPerformed

    private void seatA8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatA8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatA8ActionPerformed

    private void seatB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatB1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatB1ActionPerformed

    private void seatB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatB2ActionPerformed

    private void seatB3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatB3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatB3ActionPerformed

    private void seatB4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatB4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatB4ActionPerformed

    private void seatB5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatB5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatB5ActionPerformed

    private void seatB6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatB6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatB6ActionPerformed

    private void seatB7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatB7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatB7ActionPerformed

    private void seatB8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatB8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatB8ActionPerformed

    private void seatC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatC1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatC1ActionPerformed

    private void seatC2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatC2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatC2ActionPerformed

    private void seatC3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatC3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatC3ActionPerformed

    private void seatC4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatC4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatC4ActionPerformed

    private void seatC5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatC5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatC5ActionPerformed

    private void seatC6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatC6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatC6ActionPerformed

    private void seatC7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatC7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatC7ActionPerformed

    private void seatC8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatC8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatC8ActionPerformed

    private void seatD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatD1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatD1ActionPerformed

    private void seatD2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatD2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatD2ActionPerformed

    private void seatD3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatD3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatD3ActionPerformed

    private void seatD4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatD4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatD4ActionPerformed

    private void seatD5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatD5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatD5ActionPerformed

    private void seatD6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatD6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatD6ActionPerformed

    private void seatD7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatD7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatD7ActionPerformed

    private void seatD8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seatD8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_seatD8ActionPerformed

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
            java.util.logging.Logger.getLogger(chooseSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(chooseSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(chooseSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(chooseSeat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox seatA1;
    private javax.swing.JCheckBox seatA2;
    private javax.swing.JCheckBox seatA3;
    private javax.swing.JCheckBox seatA4;
    private javax.swing.JCheckBox seatA5;
    private javax.swing.JCheckBox seatA6;
    private javax.swing.JCheckBox seatA7;
    private javax.swing.JCheckBox seatA8;
    private javax.swing.JCheckBox seatB1;
    private javax.swing.JCheckBox seatB2;
    private javax.swing.JCheckBox seatB3;
    private javax.swing.JCheckBox seatB4;
    private javax.swing.JCheckBox seatB5;
    private javax.swing.JCheckBox seatB6;
    private javax.swing.JCheckBox seatB7;
    private javax.swing.JCheckBox seatB8;
    private javax.swing.JCheckBox seatC1;
    private javax.swing.JCheckBox seatC2;
    private javax.swing.JCheckBox seatC3;
    private javax.swing.JCheckBox seatC4;
    private javax.swing.JCheckBox seatC5;
    private javax.swing.JCheckBox seatC6;
    private javax.swing.JCheckBox seatC7;
    private javax.swing.JCheckBox seatC8;
    private javax.swing.JLabel seatCount;
    private javax.swing.JCheckBox seatD1;
    private javax.swing.JCheckBox seatD2;
    private javax.swing.JCheckBox seatD3;
    private javax.swing.JCheckBox seatD4;
    private javax.swing.JCheckBox seatD5;
    private javax.swing.JCheckBox seatD6;
    private javax.swing.JCheckBox seatD7;
    private javax.swing.JCheckBox seatD8;
    private javax.swing.JButton seatPay;
    private javax.swing.JLabel seatPrice;
    private javax.swing.JLabel seatScreen;
    // End of variables declaration//GEN-END:variables
}
