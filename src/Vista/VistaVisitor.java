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
public class VistaVisitor extends javax.swing.JFrame {

    /**
     * Creates new form VistaVisitor
     */
    public VistaVisitor() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btndescuento = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        txtprecio = new javax.swing.JTextField();
        btnNormal = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtmensaje = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 102, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VISITOR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ingrese el precio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, -1, -1));

        btndescuento.setText("Descuento");
        jPanel1.add(btndescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        btnVolver.setBackground(new java.awt.Color(255, 0, 0));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, -1, -1));
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 130, -1));

        btnNormal.setText("Normal");
        jPanel1.add(btnNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 80, -1));

        txtmensaje.setColumns(20);
        txtmensaje.setLineWrap(true);
        txtmensaje.setRows(5);
        txtmensaje.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtmensaje);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnNormal() {
        return btnNormal;
    }

    public void setBtnNormal(JButton btnNormal) {
        this.btnNormal = btnNormal;
    }

    public JButton getBtnVolver() {
        return btnVolver;
    }
    
    public void setBtnVolver(JButton btnVolver) {
        this.btnVolver = btnVolver;
    }

    public JButton getBtndescuento() {
        return btndescuento;
    }

    public void setBtndescuento(JButton btndescuento) {
        this.btndescuento = btndescuento;
    }

    public JTextArea getTxtmensaje() {
        return txtmensaje;
    }

    public void setTxtmensaje(JTextArea txtmensaje) {
        this.txtmensaje = txtmensaje;
    }

    public JTextField getTxtprecio() {
        return txtprecio;
    }

    public void setTxtprecio(JTextField txtprecio) {
        this.txtprecio = txtprecio;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNormal;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btndescuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtmensaje;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
