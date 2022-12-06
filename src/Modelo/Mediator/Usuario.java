/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Mediator;

import javax.swing.JOptionPane;

/**
 *
 * @author Saul
 */
public class Usuario implements IUsuarioChat {

    private String nombre;
    private SalondeChat salon;

    public Usuario(SalondeChat salondechat) {
        salon = salondechat;
    }
    
    
    @Override
    public void recibe(String de, String msj) {
       String s="El usuario "+de+" te dice "+msj;
       JOptionPane.showMessageDialog(null, msj,de, JOptionPane.PLAIN_MESSAGE);
        System.out.println(nombre+": "+s);
    }

    @Override
    public void envia(String a, String msj) {
       salon.envia(nombre, a, msj);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}
