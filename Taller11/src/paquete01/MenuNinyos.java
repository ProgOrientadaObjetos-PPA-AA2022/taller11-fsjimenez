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
public class MenuNinyos extends Menu{
    private double valorHelado;
    private double valorPastel;
    
    public MenuNinyos(double helado, double pastel){
        valorHelado = helado;
        valorPastel = pastel;
    }
    
    @Override
    public void calcularValorMenu(){
        valorMenu = valorInicial + valorHelado + valorPastel;
    }
    
    public double obtenerHelado(){
        return valorHelado;
    }
    
    public double obtenerPastel(){
        return valorPastel;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menú de Niños: \n"
                + "Plato: %s\nValor Inicial: %.2f\nValor helado: %.2f\n"
                + "Valor pastel: %.2f\nValor del Menú: %.2f\n",
                nombrePlato,
                valorInicial,
                valorHelado,
                valorPastel,
                valorMenu);
        return cadena;
    }
    
    /*
    Factura
Cliente: René Elizalde
Menu del Día:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50
    */
}
