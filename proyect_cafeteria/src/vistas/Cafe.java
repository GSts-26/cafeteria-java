/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vistas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Cafe implements Runnable {

    public static void main(String[] args) {
        Thread f = new Thread(new Cafe());

        f.start();

    }

    @Override

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(4000);
                JOptionPane.showMessageDialog(null, "ok");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Cafe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
