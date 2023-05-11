/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

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
        
        Fabricante fabri1 = new Fabricante ();
        Automotor auto1 = new Automotor ();
        
        auto1.establecerFabricante(fabri1);
        auto1.calcularValorMatricula();
        
        System.out.printf("%s\n", auto1);
        
        
        Fabricante fabri2 = new Fabricante ("Skoda", "Boleslav");
        Automotor auto2 = new Automotor ("1150534234", fabri2 , 2019, 14243.42);
        
        auto2.establecerFabricante(fabri2);
        auto2.calcularValorMatricula();
            
        System.out.printf("%s\n", auto2);
    }
    
}
