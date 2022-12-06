/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.Mediator;

/**
 *
 * @author Saul
 */
public interface IUsuarioChat {
    public void recibe(String de, String msj);
    public void envia(String a, String msj);
}
