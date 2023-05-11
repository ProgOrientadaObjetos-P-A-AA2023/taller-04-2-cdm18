/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema03;

/**
 *
 * @author carlo
 */
public class Automotor {

    private String cedula;

    private Fabricante fabricante;

    private int anioFabricacion;

    private double valorVehiculo;
    private double valorMatricula;

    public Automotor(String id, Fabricante fab, int anioF, double valorV) {
        cedula = id;
        fabricante = fab;
        anioFabricacion = anioF;
        valorVehiculo = valorV;
    }

    public Automotor() {
        cedula = "1141555612";
        anioFabricacion = 2012;
        valorVehiculo = 21500;

    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerFabricante(Fabricante fab) {
        fabricante = fab;
    }

    public void establecerAnio(int an) {
        anioFabricacion = an;
    }

    public void establecerValorVehiculo(double valorV) {
        valorVehiculo = valorV;
    }

    public void calcularValorMatricula() {
        valorMatricula = valorVehiculo * 0.00002 * (2023 - anioFabricacion);
    }

    public String obtenerCedula() {
        return cedula;
    }

    public Fabricante obtenerFabricante() {
        return fabricante;
    }

    public int obtenerAnio() {
        return anioFabricacion;
    }

    public double obtenerValorVehiculo() {
        return valorVehiculo;
    }

    public double obtenerValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        String m = String.format("Cedula de dueño del automotor: %s\n"
                + "Fabricante del vehiculo: %s\n"
                + "Ciudad de origen: %s\n"
                + "Año de fabricacion: %d\n"
                + "Valor del vehiculo: $%.2f\n"
                + "Valor de matricula: $%.2f\n",
                obtenerCedula(),
                fabricante.obtenerNombreFabricante(),
                fabricante.obtenerCiudadOrigen(),
                obtenerAnio(),
                obtenerValorVehiculo(),
                valorMatricula);
        return m;

    }
}
