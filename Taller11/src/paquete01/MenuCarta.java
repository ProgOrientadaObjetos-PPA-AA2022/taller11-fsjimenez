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
public class MenuCarta extends Menu{
    private double valorPorcion;
    private double valorBebida;
    private double porcentaje;
    
    public MenuCarta(String nombre, double vInicial, double porcion, double bebida, 
            double por){
        super(nombre, vInicial);
        valorPorcion = porcion;
        valorBebida = bebida;
        porcentaje = por;
    }
    
    @Override
    public void calcularValorMenu(){
        double adicional = (valorInicial * porcentaje)/100;
        valorMenu = adicional + valorPorcion + valorBebida;
    }
    
    @Override
    public String toString(){
        String cadena = String.format("Menú a la Carta: \n"
                + "Plato: %s\nValor Inicial: %.2f\nValor guarnicion: %.2f\n"
                + "Valor bebida: %.2f\nPorcentaje Adicional: %.2f\n"
                + "Valor del Menú: %.2f\n\n",
                nombrePlato,
                valorInicial,
                valorPorcion,
                valorBebida,
                porcentaje,
                valorMenu);
        return cadena;
    }
    
    /*
    Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10
    */
}
