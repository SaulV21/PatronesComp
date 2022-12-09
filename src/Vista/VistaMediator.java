/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Saul
 */
public class VistaMediator extends javax.swing.JFrame {

    /**
     * Creates new form VistaMediator
     */
    public VistaMediator() {
        initComponents();
    }

    public JButton getBtnEnviar1() {
        return btnEnviar1;
    }

    public void setBtnEnviar1(JButton btnEnviar1) {
        this.btnEnviar1 = btnEnviar1;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }

    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JButton getBtnenviar2() {
        return btnenviar2;
    }

    public void setBtnenviar2(JButton btnenviar2) {
        this.btnenviar2 = btnenviar2;
    }

    public JTextArea getTxtMensaje1() {
        return txtMensaje1;
    }

    public void setTxtMensaje1(JTextArea txtMensaje1) {
        this.txtMensaje1 = txtMensaje1;
    }

    public JTextArea getTxtMensaje2() {
        return txtMensaje2;
    }

    public void setTxtMensaje2(JTextArea txtMensaje2) {
        this.txtMensaje2 = txtMensaje2;
    }

    public JTextField getTxtuser1() {
        return txtuser1;
    }

    public void setTxtuser1(JTextField txtuser1) {
        this.txtuser1 = txtuser1;
    }

    public JTextField getTxtuser2() {
        return txtuser2;
    }

    public void setTxtuser2(JTextField txtuser2) {
        this.txtuser2 = txtuser2;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnEnviar1 = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtuser1 = new javax.swing.JTextField();
        txtuser2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMensaje1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        btnenviar2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMensaje2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("MEDIATOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jLabel2.setText("Usuario 1:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, -1, -1));

        jLabel3.setText("Usuario 2:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, -1, -1));

        btnEnviar1.setText("Enviar");
        jPanel1.add(btnEnviar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        btnVolver.setBackground(new java.awt.Color(0, 51, 255));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, -1, -1));
        jPanel1.add(txtuser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 230, -1));
        jPanel1.add(txtuser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 230, -1));

        txtMensaje1.setColumns(20);
        txtMensaje1.setLineWrap(true);
        txtMensaje1.setRows(5);
        txtMensaje1.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtMensaje1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 230, 150));

        jLabel4.setText("Mensaje:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        btnenviar2.setText("Enviar");
        jPanel1.add(btnenviar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        jLabel5.setText("Mensaje:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        txtMensaje2.setColumns(20);
        txtMensaje2.setLineWrap(true);
        txtMensaje2.setRows(5);
        txtMensaje2.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtMensaje2);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 230, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar1;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnenviar2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtMensaje1;
    private javax.swing.JTextArea txtMensaje2;
    private javax.swing.JTextField txtuser1;
    private javax.swing.JTextField txtuser2;
    // End of variables declaration//GEN-END:variables
}
