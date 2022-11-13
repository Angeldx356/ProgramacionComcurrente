/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionconcurrente;

/**
 *
 * @author FERba
 */
public class ThreadEjemplo1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " "
                    + Thread.currentThread().getName());
        }
        System.out.println("Termina thread "
                + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new ThreadEjemplo(), "Lenguajes").start();
        new Thread(new ThreadEjemplo(), "Concurrentes").start();
        System.out.println("Termina thread main");
    }
}
