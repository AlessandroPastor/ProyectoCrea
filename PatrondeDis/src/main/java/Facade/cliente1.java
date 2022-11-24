/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author LAN SPARTACO
 */
public class cliente1 {
    public static void main(String[] arga ){
        
        
        Impresora  i= new Impresora();
        i.setHoja("a4");
        i.setColor(true);
        i.setTipodeDocumento("pdf");
        i.setTexto("Texto1");
        i.imprimirDocumento();
        
        Impresora  i2= new Impresora();
        i2.setHoja("a5");
        i2.setColor(true);
        i2.setTipodeDocumento("word");
        i2.setTexto("Texto2");
        i2.imprimirDocumento();
        
        Impresora  i3= new Impresora();
        i3.setHoja("a3");
        i3.setColor(true);
        i3.setTipodeDocumento("excel");
        i3.setTexto("Texto3");
        i3.imprimirDocumento();
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
