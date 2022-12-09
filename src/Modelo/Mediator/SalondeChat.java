/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo.Mediator;

import java.util.HashMap;

/**
 *
 * @author Saul
 */
public class SalondeChat implements ISalondeChat{
/*Aqui se alamcenaran de manera temporal los usuarios que participaran en el chat*/
    private HashMap<String, Usuario> participantes=new HashMap<String, Usuario>();
    @Override
    public void registra(Usuario user) {
        participantes.put(user.getNombre(), user);
    }

    @Override
    public void envia(String de, String a, String msj) {
        if(participantes.containsKey(de)&&participantes.containsKey(a)){
        Usuario u=participantes.get(a);
        u.recibe(de, msj);
        } else {
            System.out.println("Usuario inexistente");
        }
    }
    
}
