/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class Cuenta {
    private String nombreCliente;
    private ArrayList<Menu> listaMenus;
    private double valorCancelar;
    private double subtotal;
    private double iva;
    

    public Cuenta(String nc, ArrayList<Menu> lista, double iv) {
        nombreCliente = nc;
        listaMenus = lista;
        iva = iv;
    }

    public void establecerValorCancelar() {
        valorCancelar = subtotal + ((subtotal * iva)/100);
    }
    
    public void establecerNombreCliente(String nc) {
        nombreCliente = nc;
    }

    public void establecerSubtotal() {
        subtotal = 0;
        for (Menu m : listaMenus) {
            subtotal += m.obtenerValorMenu();
        }
    }

    public void establecerIva(double i) {
        iva = i;
    }

    public String obtenerNombreCliente() {
        return nombreCliente;
    }

    public ArrayList<Menu> obtenerListaMenus() {
        return listaMenus;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

    public double obtenerSubtotal() {
        return subtotal;
    }

    public double obtenerIva() {
        return iva;
    }
    
    @Override
    public String toString(){
        String cadena = "Factura\n";
        cadena = String.format("%sCliente: %s\n", cadena,
                nombreCliente);
        for (Menu m : listaMenus) {
            cadena += m.toString();
        }
        cadena += String.format("Valor a cancelar: %.2f\n"
                + "Subtotal: %.2f\nIva: %.2f%%\n",
                valorCancelar, 
                subtotal, 
                iva);
                return cadena;
    }
}
