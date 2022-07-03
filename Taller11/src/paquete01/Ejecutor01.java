/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MenuNinyos ninyos1 = new MenuNinyos("Niños 01", 2, 1, 1.5);

        
        MenuNinyos ninyos2 = new MenuNinyos("Niños 02", 3, 1, 1.5);

        
        MenuEconomico eco1 = new MenuEconomico("Econo 001", 4, 25);

        
        MenuDia dia1 = new MenuDia("Dia 001", 5, 1, 1);

        
        MenuCarta carta1 = new MenuCarta("Carta 001", 6, 1.5, 2, 10);
    
        
        ArrayList<Menu> lista = new ArrayList<>();
        lista.add(ninyos1);
        lista.add(ninyos2);
        lista.add(eco1);
        lista.add(dia1);
        lista.add(carta1);
        
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).calcularValorMenu();
        }
        
        Cuenta cuenta = new Cuenta("Felipe jimenez", lista, 12);
        cuenta.establecerSubtotal();
        cuenta.establecerValorCancelar();
        
        System.out.println(cuenta);
    }
    
    
}
// lo que debe presentar
/*
Factura
Cliente: René Elizalde
Menu de Niños:
	Plato: Niños 01
	Valor Inicial: 2,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 4,50

Menu de Niños:
	Plato: Niños 02
	Valor Inicial: 3,00
	Valor helado: 1,00
	Valor pastel: 1,50
	Valor del Menú: 5,50

Menu Económico:
	Plato: Econo 001
	Valor Inicial: 4,00
	Porcentaje Descuento: 25,00
	Valor del Menú: 3,00

Menu del Día:
	Plato: Dia 001
	Valor Inicial: 5,00
	Valor bebida: 1,00
	Valor postre: 1,00
	Valor del Menú: 7,00

Menu a la Carta:
	Plato: Carta 001
	Valor Inicial: 6.0
	Valor guarnición: 1.5
	Valor bebida: 2.0
	Porcentaje Adicional: 10,00
	Valor del Menú: 10,10

Subtotal: 30,1
IVA: 10,0%
Total a pagar: 33,110

*/