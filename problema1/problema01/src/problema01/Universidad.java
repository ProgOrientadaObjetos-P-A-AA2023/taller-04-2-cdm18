/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author carlo
 */
public class Universidad {

    private String nombreUniversidad;
    private String direccion;

    public Universidad() {
        nombreUniversidad = "Universidad del Azuay";
        direccion = "Loja, San Cayetano Alto";
    }

    public Universidad(String nombre, String direc) {
        nombreUniversidad = nombre;
        direccion = direc;
    }

    public void establecerNombreUniversidad(String nombreU) {
        nombreUniversidad = nombreU;
    }

    public void establecerDireccion(String direc) {
        direccion = direc;
    }

    public String obtenerNombreUniversidad() {
        return nombreUniversidad;
    }

    public String obtenerDireccion() {
        return direccion;
    }

}
