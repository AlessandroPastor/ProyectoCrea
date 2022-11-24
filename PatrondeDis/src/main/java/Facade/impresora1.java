/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Facade;

/**
 *
 * @author LAN SPARTACO
 */
public class impresora1 {
    private String tipodocumento;
    private String hoja;
    private boolean color;
    private String texto;
    
    
    public String getTipoDeDocumento(){
        return tipodocumento;}
    public void setTipoDeDocumento(String tipodocumento){
        this.tipodocumento= tipodocumento;}
    public String getHoja(){
        return hoja;}
    public void setHoja(String hoja){
        this.hoja= hoja;}
    public boolean isColor(){
        return color;}
    public void setColor(boolean color){
        this.color= color;}
    public String getTexto(){
        return texto;}
    public void setTexto(String texto){
        this.texto= texto;}
    
    public void imprimirDocumento(){
        
        System.out.println("imprimiendo:"+texto+",color:"+
                color+",tipo:"+tipodocumento+",hoja:"+hoja);
    
    
    }
    
}
