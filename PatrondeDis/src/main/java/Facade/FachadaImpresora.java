/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author LAN SPARTACO
 */
public class FachadaImpresora {
    Impresora impresora;
    public FachadaImpresora(String texto){
        super();
        impresora=new Impresora();
        impresora.setColor(true);
        impresora.setHoja("A4");
        impresora.setTipodeDocumento("PDF");
        impresora.setTexto(texto);
    }
    public void imprimir(){
        
        impresora.imprimirDocumento();
        
                
    }
    
}
