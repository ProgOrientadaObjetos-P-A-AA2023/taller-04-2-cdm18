/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author carlo
 */
public class Fabricante {

    private String nombreFabricante;
    private String ciudadOrigen;

    public Fabricante() {
        nombreFabricante = "Porsche";
        ciudadOrigen = "Maffersdorf";
    }

    public Fabricante(String fab, String ciud) {
        nombreFabricante = fab;
        ciudadOrigen = ciud;
    }

    public void establecerNombreFabricante(String nombre) {
        nombreFabricante = nombre;
    }

    public void establecerCiudadOrigen(String ciud) {
        ciudadOrigen = ciud;
    }

    public String obtenerNombreFabricante() {
        return nombreFabricante;
    }

    public String obtenerCiudadOrigen() {
        return ciudadOrigen;
    }

}
