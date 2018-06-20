/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class QLNV extends javax.swing.JFrame {

    //kai bao list
    ArrayList<NhanVien> listNV = new ArrayList<>();

    int vitri;
    DefaultTableModel model = new DefaultTableModel();

    public QLNV() {
        initComponents();
        model = (DefaultTableModel) tbNhanVien.getModel();
        // khoi tao cac tp

        listNV.add(new NhanVien("NV004", "Nguyễn Văn Tài", "tai004@gmail.com", 9, 22));
        listNV.add(new NhanVien("NV005", "Nguyễn Trí Thể", "the005@gmail.com", 8, 19));
        listNV.add(new NhanVien("NV006", "Phạm Thu Nga", "nga006@gmail.com", 5, 21));
        listNV.add(new NhanVien("NV008", "Nguyễn Anh Tú", "tu008@gmail.com", 7, 19));
        listNV.add(new NhanVien("NV009", "Nguyễn Mai Huệ", "hue009@gmail.com", 5, 20));

        addTable();

        if (listNV.size() <= 0) {
            vitri = -1;

        } else {
            vitri = 0;
            display(vitri);
        }

        Thread time = new Thread() {
            @Override
            public void run() {
                SimpleDateFormat sdf = new SimpleDateFormat();
                sdf.applyPattern("hh:mm aa");
                while (true) {
                    try {
                        Date d = new Date();
                        String text = sdf.format(d);
                        lbTime.setText(text);
                        Thread.sleep(60000);
                    } catch (Exception ex) {
                        break;
                    }
                }
            }
//            Date now = new Date();
//            SimpleDateFormat format = new SimpleDateFormat();
//
//            @Override
//            public void run() {
//                try {
//                    format.applyPattern("hh:mm:ss aa");
//                    while (true) {
//                        String time = format.format(now);
//                        Thread.sleep(1000);
//                        lbTime.setText(time);
//                    }
//
//                } catch (Exception e) {
//
//                }
//
//            }

        };
        time.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnBackground = new javax.swing.JPanel();
        pnNhapLieu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tfCode = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tfSalary = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btNew = new javax.swing.JButton();
        btSave = new javax.swing.JButton();
        btOpen = new javax.swing.JButton();
        btFind = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btBack = new javax.swing.JButton();
        btFirst = new javax.swing.JButton();
        btLast = new javax.swing.JButton();
        btNext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        tfRecord = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUẢN LÝ NHÂN VIÊN");
        setBackground(new java.awt.Color(255, 255, 255));

        pnBackground.setBackground(new java.awt.Color(255, 255, 255));

        pnNhapLieu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("MÃ NHÂN VIÊN");

        tfCode.setBackground(new java.awt.Color(230, 230, 230));
        tfCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodeActionPerformed(evt);
            }
        });

        tfName.setBackground(new java.awt.Color(230, 230, 230));
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });

        jLabel3.setText("HỌ VÀ TÊN");

        tfAge.setBackground(new java.awt.Color(230, 230, 230));
        tfAge.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfAgeActionPerformed(evt);
            }
        });

        jLabel4.setText("TUỔI");

        tfEmail.setBackground(new java.awt.Color(230, 230, 230));
        tfEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEmailActionPerformed(evt);
            }
        });

        jLabel5.setText("EMAIL");

        tfSalary.setBackground(new java.awt.Color(230, 230, 230));
        tfSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSalaryActionPerformed(evt);
            }
        });

        jLabel6.setText("LƯƠNG");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btNew.setText("New");
        btNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNewActionPerformed(evt);
            }
        });

        btSave.setText("Save");
        btSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSaveActionPerformed(evt);
            }
        });

        btOpen.setText("Open");
        btOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOpenActionPerformed(evt);
            }
        });

        btFind.setText("Find");
        btFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFindActionPerformed(evt);
            }
        });

        btExit.setText("Exit");
        btExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExitActionPerformed(evt);
            }
        });

        btDelete.setText("Delete");
        btDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btNew, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btFind, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btNew, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btFind, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btBack.setText("<<");
        btBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBackActionPerformed(evt);
            }
        });

        btFirst.setText("|<");
        btFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFirstActionPerformed(evt);
            }
        });

        btLast.setText(">|");
        btLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLastActionPerformed(evt);
            }
        });

        btNext.setText(">>");
        btNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNextActionPerformed(evt);
            }
        });

        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ", "HỌ VÀ TÊN", "TUỔI", "EMAIL", "LƯƠNG"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNhanVien.setRowHeight(20);
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNhanVien);
        if (tbNhanVien.getColumnModel().getColumnCount() > 0) {
            tbNhanVien.getColumnModel().getColumn(0).setResizable(false);
            tbNhanVien.getColumnModel().getColumn(1).setResizable(false);
            tbNhanVien.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setFont(new java.awt.Font("UVN Bai Sau", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("QUẢN LÝ NHÂN VIÊN");

        lbTime.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTime.setForeground(new java.awt.Color(255, 255, 255));
        lbTime.setText("Thoi gian");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 259, Short.MAX_VALUE)
                .addComponent(lbTime)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        tfRecord.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tfRecord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tfRecord.setText("...");

        javax.swing.GroupLayout pnNhapLieuLayout = new javax.swing.GroupLayout(pnNhapLieu);
        pnNhapLieu.setLayout(pnNhapLieuLayout);
        pnNhapLieuLayout.setHorizontalGroup(
            pnNhapLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhapLieuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(pnNhapLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(pnNhapLieuLayout.createSequentialGroup()
                        .addGroup(pnNhapLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnNhapLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfName)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(pnNhapLieuLayout.createSequentialGroup()
                                    .addGroup(pnNhapLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnNhapLieuLayout.createSequentialGroup()
                                            .addComponent(btFirst)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(btBack)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tfRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tfSalary, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btNext)
                                    .addGap(10, 10, 10)
                                    .addComponent(btLast)))
                            .addComponent(tfCode, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNhapLieuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnNhapLieuLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel2, tfCode});

        pnNhapLieuLayout.setVerticalGroup(
            pnNhapLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnNhapLieuLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(pnNhapLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnNhapLieuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addGroup(pnNhapLieuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btBack)
                            .addComponent(btFirst)
                            .addComponent(btLast)
                            .addComponent(btNext)
                            .addComponent(tfRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnNhapLieuLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)))
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pnNhapLieuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {tfAge, tfCode, tfEmail, tfName, tfSalary});

        pnNhapLieuLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btLast, tfRecord});

        tfCode.getAccessibleContext().setAccessibleName("");
        tfCode.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout pnBackgroundLayout = new javax.swing.GroupLayout(pnBackground);
        pnBackground.setLayout(pnBackgroundLayout);
        pnBackgroundLayout.setHorizontalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnNhapLieu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnBackgroundLayout.setVerticalGroup(
            pnBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnNhapLieu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodeActionPerformed

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNameActionPerformed

    private void tfAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfAgeActionPerformed
        try {
            Integer.parseInt(tfAge.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tuổi phải nhập số!");
        }
    }//GEN-LAST:event_tfAgeActionPerformed

    private void tfEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEmailActionPerformed

    private void tfSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSalaryActionPerformed

    private void btFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFirstActionPerformed
        try {
            vitri = 0;
            display(vitri);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Loi!!" + e);
        }

    }//GEN-LAST:event_btFirstActionPerformed

    private void btNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNextActionPerformed
        try {
            if (vitri < listNV.size() - 1) {
                vitri++;
                display(vitri);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "MAX" + e);
        }


    }//GEN-LAST:event_btNextActionPerformed

    private void btBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBackActionPerformed
        try {
            if (vitri > 0) {
                vitri--;
                display(vitri);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "MIN" + e);
        }
    }//GEN-LAST:event_btBackActionPerformed

    private void btLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLastActionPerformed
        try {
            vitri = listNV.size() - 1;
            display(vitri);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Loi!!" + e);
        }
    }//GEN-LAST:event_btLastActionPerformed

    private void btExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExitActionPerformed
        try {
            int hoi = JOptionPane.showConfirmDialog(null, "Bạn chắc chắn muốn thoát?");
            if (hoi == JOptionPane.YES_OPTION) {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data.txt"));
                oos.writeObject(listNV);
                oos.flush();
                oos.close();
                System.exit(0);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi!" + e);
        }


    }//GEN-LAST:event_btExitActionPerformed

    private void btNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNewActionPerformed
        clearForm();
    }//GEN-LAST:event_btNewActionPerformed

    private void btSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSaveActionPerformed
        try {
            if (vitri == -1) {

                addNhanvien();
                vitri = listNV.size() - 1;
                display(vitri);

            } else {
                updateNhanvien();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Lỗi!");
        }
    }//GEN-LAST:event_btSaveActionPerformed

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked

        int row = tbNhanVien.getSelectedRow();
        if (row >= 0) {
            vitri = row;
            display(vitri);
            JOptionPane.showMessageDialog(null, listNV.get(vitri).toString());
        }

    }//GEN-LAST:event_tbNhanVienMouseClicked

    private void btDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeleteActionPerformed
        try {
            if (listNV.isEmpty()) {

                JOptionPane.showMessageDialog(null, "Không còn giữu liệu để xóa!");
                return;
            }
            remove();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Chọn vị trí cần xóa!");

        }


    }//GEN-LAST:event_btDeleteActionPerformed

    private void btOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOpenActionPerformed
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data.txt"));
            listNV = (ArrayList<NhanVien>) ois.readObject();
            addTable();
            if (listNV.size() > 0) {
                vitri = 0;
                display(vitri);
                JOptionPane.showMessageDialog(null, "Mở thành công!");
            } else {
                clearForm();
                JOptionPane.showMessageDialog(null, "Không có gì để mở!");
            }
            ois.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Loi!!" + e);
        }
    }//GEN-LAST:event_btOpenActionPerformed

    private void btFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFindActionPerformed
        try {
            String ma = JOptionPane.showInputDialog("Nhap id can tim");
            boolean kq = false;
            for (NhanVien x : listNV) {
                if (x.getManv().equalsIgnoreCase(ma)) {
                    vitri = listNV.indexOf(x);
                    kq = true;
                    display(vitri);
                    break;
                }
            }
            if (kq) {
                JOptionPane.showMessageDialog(null, "Tim thanh cong!");
            } else {
JOptionPane.showMessageDialog(null, "Không tim thay!");
            }
        } catch (Exception e) {
              JOptionPane.showMessageDialog(null, "Loi!!" + e);
        }
    }//GEN-LAST:event_btFindActionPerformed

//---------------------------------------------------------------------------------------------
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
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBack;
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btFind;
    private javax.swing.JButton btFirst;
    private javax.swing.JButton btLast;
    private javax.swing.JButton btNew;
    private javax.swing.JButton btNext;
    private javax.swing.JButton btOpen;
    private javax.swing.JButton btSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbTime;
    private javax.swing.JPanel pnBackground;
    private javax.swing.JPanel pnNhapLieu;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfCode;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfName;
    private javax.swing.JLabel tfRecord;
    private javax.swing.JTextField tfSalary;
    // End of variables declaration//GEN-END:variables
public void display(int vitri) {
        tfCode.setText(listNV.get(vitri).getManv());
        tfName.setText(listNV.get(vitri).getTennv());
        tfAge.setText(listNV.get(vitri).getTuoi() + "");
        tfEmail.setText(listNV.get(vitri).getEmail());
        tfSalary.setText(listNV.get(vitri).getLuong() + "");
        tbNhanVien.setRowSelectionInterval(vitri, vitri);

        tfRecord.setText((vitri + 1) + " / " + listNV.size());
    }

    public void clearForm() {
        tfAge.setText("");
        tfCode.setText("");
        tfName.setText("");
        tfEmail.setText("");
        tfSalary.setText("");
        vitri = -1;
        tfRecord.setText("...");
    }

    public void addTable() {
        model.setRowCount(0);
        for (NhanVien x : listNV) {
            model.addRow(new Object[]{
                x.getManv(), x.getTennv(), x.getTuoi(), x.getEmail(), x.getLuong()
            });

        }
        if (model.getRowCount() > 0) {
            tbNhanVien.setRowSelectionInterval(0, 0);
        }
    }

    public void addNhanvien() {

        listNV.add(new NhanVien(
                tfCode.getText(),
                tfName.getText(),
                tfEmail.getText(),
                Double.parseDouble(tfSalary.getText()),
                Integer.parseInt(tfAge.getText())
        ));
        model.addRow(new Object[]{
            tfCode.getText(),
            tfName.getText(),
            Integer.parseInt(tfAge.getText()),
            tfEmail.getText(),
            Double.parseDouble(tfSalary.getText())

        });
        JOptionPane.showMessageDialog(null, "Thêm thành công!");
//        }

    }

    public void updateNhanvien() {

        listNV.set(vitri, new NhanVien(tfCode.getText(),
                tfName.getText(),
                tfEmail.getText(),
                Double.parseDouble(tfSalary.getText()),
                Integer.parseInt(tfAge.getText())));

        model.setValueAt(tfCode.getText(), vitri, 0);
        model.setValueAt(tfName.getText(), vitri, 1);
        model.setValueAt(Integer.parseInt(tfAge.getText()), vitri, 2);
        model.setValueAt(tfEmail.getText(), vitri, 3);
        model.setValueAt(Double.parseDouble(tfSalary.getText()), vitri, 4);
//        }
        JOptionPane.showMessageDialog(null, "Sửa thành công!");
    }

    public void remove() {
        int thongbao = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa phần tử này không?");
        if (thongbao == JOptionPane.YES_OPTION) {
            listNV.remove(vitri);
            model.removeRow(vitri);
            if (listNV.isEmpty()) {
                clearForm();
            } else {
                vitri = 0;
                display(vitri);
            }

        }

    }

}
