/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author LAN SPARTACO
 */
public class Cliente2 {
    public static void main(String[] args) {
        FachadaImpresora f1=new FachadaImpresora("Texto1");
        f1.imprimir();
        FachadaImpresora f2=new FachadaImpresora("texto2");
        f2.imprimir();
        Impresora i3= new Impresora();
        i3.setHoja("a4");
        i3.setColor(true);
        i3.setTipodeDocumento("excel");
        i3.setTexto("texto3");
        i3.imprimirDocumento();
        
                
    }
    
}
