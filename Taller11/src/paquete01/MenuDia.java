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
public class MenuDia extends Menu{
    private double valorPostre;
    private double valorBebida;
    
    public MenuDia(double postre, double bebida){
        valorPostre = postre;
        valorBebida = bebida;
    }
    
    @Override
    public void calcularValorMenu(){
        valorMenu = valorInicial + valorPostre + valorBebida;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menú del Día: \n"
                + "Plato: %s\nValor Inicial: %.2f\nValor bebida: %.2f\n"
                + "Valor postre: %.2f\nValor del Menú: %.2f\n",
                nombrePlato,
                valorInicial,
                valorBebida,
                valorPostre,
                valorMenu);
        return cadena;
    }
    
    /*
    Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00
    */
}
