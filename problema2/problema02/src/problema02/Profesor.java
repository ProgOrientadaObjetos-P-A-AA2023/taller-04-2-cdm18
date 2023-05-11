/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema02;

/**
 *
 * @author carlo
 */
public class Profesor {

    private String nombre;
    private String apellido;
    private String cedula;

    private Provincia provincia;

    private double sueldoBasico;
    private double sueldoTotal;

    public Profesor(String nomb, String apel, String id, double sueldoB,
            Provincia prov) {
        nombre = nomb;
        apellido = apel;
        cedula = id;
        provincia = prov;
        sueldoBasico = sueldoB;
    }

    public Profesor() {
        nombre = "Edwin";
        apellido = "Silavilla";
        cedula = "1150123123";
        sueldoBasico = 450;

    }

    public void establecerNombreProfesor(String nomb) {
        nombre = nomb;
    }

    public void establecerApellidoProfesor(String ape) {
        apellido = ape;
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerSueldoBasico(double sueldoB) {
        sueldoBasico = sueldoB;
    }

    public void establecerProvincia(Provincia prov) {
        provincia = prov;
    }

    public void calcularSueldoTotal() {
        sueldoTotal = (sueldoBasico * 0.2) + sueldoBasico;
    }

    public String obtenerNombreProfesor() {
        return nombre;
    }

    public String obtenerApellidoProfesor() {
        return apellido;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public double obtenerSueldoBasico() {
        return sueldoBasico;
    }

    public Provincia obtenerProvincia() {
        return provincia;
    }

    public double obtenerSueldoTotal() {
        return sueldoTotal;
    }

    @Override
    public String toString() {
        String m = String.format("Nombre de profesor: %s\n"
                + "Apellido: %s\n"
                + "Sueldo basico $%.2f\n"
                + "Su sueldo total es: $%.2f\n"
                + "Numero de cedula: %s\n"
                + "Provincia de nacimiento: %s\n"
                + "Numero de habitantes: %d\n",
                obtenerNombreProfesor(), obtenerApellidoProfesor(),
                obtenerSueldoBasico(), obtenerSueldoTotal(), obtenerCedula(),
                provincia.obtenerNombreProvincia(),
                provincia.obtenerHabitantes());
        return m;

    }
}
