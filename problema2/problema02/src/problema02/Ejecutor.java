/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

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
        
        Profesor prof1 = new Profesor ();
        Provincia prov1 = new Provincia ();
        
        prof1.establecerProvincia(prov1);
        prof1.calcularSueldoTotal();
        
        System.out.printf("%s\n", prof1);
        
        
        Provincia prov2 = new Provincia ("Galapagos", 5000);
        Profesor prof2 = new Profesor ("Juan", "Sanchez" ,"1151231", 425, prov2);
        
        prof2.calcularSueldoTotal();
        prof2.establecerProvincia(prov2);
            
        System.out.printf("%s\n", prof2);
    }
    
}
