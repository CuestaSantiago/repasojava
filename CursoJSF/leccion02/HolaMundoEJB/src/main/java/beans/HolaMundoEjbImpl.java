/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import javax.ejb.Stateless;

/**
 *
 * @author scuesta
 */
@Stateless
public class HolaMundoEjbImpl implements HolaMundoEJB{

    @Override
    public int sumar(int a, int b) {
        System.out.println("Ejecutando metodo sumar en el servidor");
        return a +b;
    }
   
}
