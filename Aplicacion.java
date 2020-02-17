/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import javax.swing.JOptionPane;

/**
 *
 * @author jose
 */
public class Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String respuesta = JOptionPane.showInputDialog("Escribe tu nombre");

        
        
        Libros obx;
        obx = new Libros("jose","pericos de la vida","123drfw",5,20);
        Libros obx1 = new Libros("pERICO","pericos de la vida","asd2",2,20);
        Libros obx2 = new Libros("aran","ericos de la vida","f5454",25,29);
        Libros obx3 = new Libros("bran","swdwdw","12",20,1);
        
        obx.addBook(obx);
        obx.addBook(obx1);
        obx.addBook(obx2);
        obx.addBook(obx3);
        obx.showBooks();
        System.out.println("----------------");
        try{
        obx.remBook("12");
        } finally {  
                System.out.println("null"); 
    }
        obx.showBooks();
        /*
        System.out.println("asda");
        obx.ordArray();
        obx.showBooks();
        System.out.println("asda");
       // obx.swAutor("bran");
        obx.selfBook(obx1);
        System.out.println("------");
          obx.showBooks();*/
    }
    
}
