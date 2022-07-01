/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author Usuario iTC
 */
public abstract class Menu {
    protected String nombrePlato;
    protected double valorMenu;
    protected double valorInicial;
    
    public Menu(String nombre, double inicial){
        nombrePlato = nombre;
        valorInicial = inicial;
    }
    
    public void establecerNombre(String n){
        nombrePlato = n;
    }
    
    public void establecerValorInicial(double vInicial){
        valorInicial = vInicial;
    }
    
    public abstract void calcularValorMenu();
    
    public String obtenerNombrePlato(){
        return nombrePlato;
    }
    
    public double obtenerValorMenu(){
        return valorMenu;
    }
    
    public double obtenerValorInicial(){
        return valorInicial;
    }
    
    
}
