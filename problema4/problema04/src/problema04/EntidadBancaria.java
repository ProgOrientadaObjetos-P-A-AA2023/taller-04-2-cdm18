/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema04;

/**
 *
 * @author carlo
 */
public class EntidadBancaria {

    private String nombreBanco;
    private int numeroSucursales;

    public EntidadBancaria() {
        nombreBanco = "Banco del Austro";
        numeroSucursales = 10;
    }

    public EntidadBancaria(String nom, int numero) {
        nombreBanco = nom;
        numeroSucursales = numero;
    }

    public void establecerNombreBanco(String n) {
        nombreBanco = n;
    }

    public void establecerNumeroSucursales(int n) {
        numeroSucursales = n;
    }

    public String obtenerNombreBanco() {
        return nombreBanco;
    }

    public int obtenerNumeroSucursales() {
        return numeroSucursales;
    }
}
