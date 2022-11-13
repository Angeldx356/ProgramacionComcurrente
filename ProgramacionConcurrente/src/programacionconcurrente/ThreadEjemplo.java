/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente;

/**
 *
 * @author FERba
 */
public class ThreadEjemplo extends Thread { 
public ThreadEjemplo(String str) { 
 super(str); 
 } 

    ThreadEjemplo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
public void run() { 
 for (int i = 0; i < 10 ; i++) 
 System.out.println(i + " " + getName()); 
 System.out.println("Termina thread " + getName()); 
 } 
public static void main (String [] args) { 
 new ThreadEjemplo("Lenguajes").start(); 
 new ThreadEjemplo("Concurrentes").start(); 
 System.out.println("Termina thread main"); 
 } 
}
