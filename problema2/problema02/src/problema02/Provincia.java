/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author carlo
 */
public class Provincia {
    
    private String nombreProvincia;
    private int habitantes;

    public Provincia() {
        nombreProvincia = "Chimborazo";
        habitantes = 74525;
    }

    public Provincia(String nombre, int hab) {
        nombreProvincia = nombre;
        habitantes = hab;
    }

    public void establecerNombreProvincia(String nombre) {
        nombreProvincia = nombre;
    }

    public void establecerHabitantes(int hab) {
        habitantes = hab;
    }

    public String obtenerNombreProvincia() {
        return nombreProvincia;
    }

    public int obtenerHabitantes() {
        return habitantes;
    }
    
    
    
    
    
    
}
