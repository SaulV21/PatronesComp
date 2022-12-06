/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo.Mediator;

/**
 *
 * @author Saul
 */
public interface ISalondeChat {
    public abstract void registra(Usuario participante);
    public abstract void envia(String de, String a, String msj);
}
