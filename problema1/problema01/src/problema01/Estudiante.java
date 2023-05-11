/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author carlo
 */
public class Estudiante {

    private String estudiante;
    private Universidad universidad;

    private double calMateria1;
    private double calMateria2;
    private double calMateria3;
    private double promedio;

    public Estudiante(String est, double cal1, double cal2,
            double cal3, Universidad uni) {
        estudiante = est;
        universidad = uni;
        calMateria1 = cal1;
        calMateria2 = cal2;
        calMateria3 = cal3;
    }

    public Estudiante() {
        estudiante = "Carlos Mejia";
        calMateria1 = 9.52;
        calMateria2 = 8.32;
        calMateria3 = 10;

    }

    public void establecerEstudiante(String est) {
        estudiante = est;
    }

    public void establecerUniversidad(Universidad u) {
        universidad = u;
    }

    public void establecerCalMateria1(double mat1) {
        calMateria1 = mat1;
    }

    public void establecerCalMateria2(double mat2) {
        calMateria2 = mat2;
    }

    public void establecerCalMateria3(double mat3) {
        calMateria3 = mat3;
    }

    public void calcularPromedio() {
        promedio = (calMateria1 + calMateria2 + calMateria3) / 3;
    }

    public String obtenerEstudiante() {
        return estudiante;
    }

    public Universidad obtenerUniversidad() {
        return universidad;
    }

    public double obtenerCalMateria1() {
        return calMateria1;
    }

    public double obtenerCalMateria2() {
        return calMateria2;
    }

    public double obtenerCalMateria3() {
        return calMateria3;
    }

    public double obtenerPromedio() {
        return promedio;
    }

    @Override
    public String toString() {
        String m = String.format("Nombre de estudiante: %s\n"
                + "Materia 1 con %.2f / 10\n"
                + "Materia 2 con %.2f / 10\n"
                + "Materia 3 con %.2f / 10\n"
                + "Su promedio final es %.2f\n"
                + "Universidad: %s\n"
                + "Direccion: %s\n",
                obtenerEstudiante(), obtenerCalMateria1(),
                obtenerCalMateria2(), obtenerCalMateria3(),
                obtenerPromedio(), universidad.obtenerNombreUniversidad(),
                universidad.obtenerDireccion());
        return m;

    }
}
