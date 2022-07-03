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
public class MenuEconomico extends Menu{
    private double porcentaje;
    
    public MenuEconomico(String nombre, double vInicial, double p){
        super(nombre, vInicial);
        porcentaje = p;
    }
    
    @Override
    public void calcularValorMenu(){
        double descuento = (valorInicial * porcentaje)/100;
        valorMenu = valorInicial - descuento;
    }
    
    
    @Override
    public String toString(){
        String cadena = String.format("Menú Econónomico: \n"
                + "Plato: %s\nValor Inicial: %.2f\nPorcentaje Descuento: %.2f\n"
                + "Valor del Menú: %.2f\n\n",
                nombrePlato,
                valorInicial,
                porcentaje,
                valorMenu);
        return cadena;
    }
    
    /*
    Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00
    */
}
