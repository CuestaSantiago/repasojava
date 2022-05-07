/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import beans.HolaMundoEJB;
import beans.HolaMundoEjbImpl;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author scuesta
 */
public class TestHolaMundoEjb {

    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            HolaMundoEJB holaMundoEjb = (HolaMundoEJB) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEJB");
            int resultado = holaMundoEjb.sumar(5, 3);
            System.out.println("suma: "+resultado);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}
