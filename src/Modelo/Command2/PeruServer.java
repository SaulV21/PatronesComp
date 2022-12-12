/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Command2;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Saul
 */
public class PeruServer implements IServer{
    Icon off = new ImageIcon(getClass().getResource("/Imagenes/off.png"));
    Icon on = new ImageIcon(getClass().getResource("/Imagenes/on.png"));
    Icon con = new ImageIcon(getClass().getResource("/Imagenes/online.png"));
    Icon ver = new ImageIcon(getClass().getResource("/Imagenes/verificar.png"));
    Icon save = new ImageIcon(getClass().getResource("/Imagenes/save.png"));
    Icon close = new ImageIcon(getClass().getResource("/Imagenes/offline.png"));
    @Override
    public void apagate() {
        JOptionPane.showMessageDialog(null,"Apagando el servidor de Peru", "", JOptionPane.PLAIN_MESSAGE, off);
        System.out.println("Apagando el servidor");
    }

    @Override
    public void prendete() {
        JOptionPane.showMessageDialog(null,"Prendiendo el servidor de Peru", "", JOptionPane.PLAIN_MESSAGE, on);
        System.out.println("Prendiendo el servidor");
    }

    @Override
    public void conectate() {
        JOptionPane.showMessageDialog(null,"Conectando el servidor Peru", "", JOptionPane.PLAIN_MESSAGE, con);
        System.out.println("Conectando el servidor");
    }

    @Override
    public void verificaConex() {
        JOptionPane.showMessageDialog(null,"Verificando Conexion", "", JOptionPane.PLAIN_MESSAGE, ver);
       System.out.println("Verificando Conexion");
    }

    @Override
    public void guardaLog() {
        JOptionPane.showMessageDialog(null,"Guardando LOG", "", JOptionPane.PLAIN_MESSAGE, save);
        System.out.println("Guardando LOG");
    }

    @Override
    public void cerraConex() {
        JOptionPane.showMessageDialog(null,"Cerrando conexion Peru", "", JOptionPane.PLAIN_MESSAGE, close);
        System.out.println("Cerrando conexion");
    }

}
