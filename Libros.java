/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author jose
 */
public class Libros implements Comparable<Libros>{
 // título , autor , ISBN (String ) , prezo , e numero de unidades.
    //Atributos
     String autor    = null;   
      String titulo   = null;  
      String ISBN     = null;
      float  precio    = 0;
      int    cantidad = 0;
    //Array
      ArrayList<Libros> arBook = new ArrayList<Libros>();
    
    public Libros(){    
    
    }
    public Libros(String autor,String titulo,String ISBN,int precio,int cantidad){    
    
        this.titulo = titulo;
        this.autor = autor;     
        this.ISBN = ISBN;
        this.precio = precio;
        this.cantidad = cantidad;
        
    }
    
    //engadir libros
    public String addBook(Libros obj){
          
          arBook.add(obj);
          
        return null;            
    }
    
    public void showBooks(){
    //ordArray();
    for (Libros i : arBook) {
      System.out.println(" Autor: "+i.autor+" Titulo:"+i.titulo+" Precio: "+i.precio+"ISBN "+i.ISBN+" cantidad "+i.cantidad);
    }
    
    
    //vender ( borrar ) libros
    }
    public  void remBook(String ISBN){
         
        for (Libros i : arBook) {
            if(i.ISBN==ISBN){            
                if(i.cantidad >1){
                    i.cantidad--;
                }else{
                    arBook.remove(i.arBook);
                    //arBook.removeIf(arBook -> arBook.cantidad==1);        
                }
                } 
        }
          
    }
    //amosar  os libros que temos  ( Os libros deben estar ordenados polo campo titulo )
    public void ordArray(){
    
        
        
        Collections.sort(arBook);
        
         
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrecio() {
        return cantidad;
    }

    public ArrayList<Libros> getArBook() {
        return arBook;
    }

    @Override
    public int compareTo(Libros o) {
      
        return this.autor.compareTo(o.autor);
        
    }
    
    //consultar un libro determinado
     public void swAutor(String autor){
    
         this.autor.compareToIgnoreCase(autor);
                 System.out.println(arBook.indexOf(this.autor));
              
            
    }
     
     //dar de baixa os libros con numero de unidades =0
     public  void selfBook(String ISBN){
         
         //arBook.indexOf();
                 
                 
        /* if (obx.cantidad>1){
            obx.cantidad--;
         }else{
            arBook.removeIf(arBook -> arBook.cantidad==0);
         }   */                                 
     }       
     public void zeroBooks(){
     
           if(this.cantidad == 0){
           
                
           }else{
               this.cantidad--;
           }
     
     }
}
       
