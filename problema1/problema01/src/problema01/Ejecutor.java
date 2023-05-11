/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

/**
 *
 * @author carlo
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante alumno1 = new Estudiante ();
        Universidad uni1 = new Universidad ();
        
        alumno1.establecerUniversidad(uni1);
        alumno1.calcularPromedio();
        
        System.out.printf("%s\n", alumno1);
        
        
        Universidad uni2 = new Universidad ("UNACH", "Av de los Shiris");
        Estudiante alumno2 = new Estudiante ("Daniel Febres", 9.2 ,8.2 ,7.3, uni2);
        
        alumno2.calcularPromedio();
        alumno2.establecerUniversidad(uni2);
            
        System.out.printf("%s\n", alumno2);
    }
    
}
