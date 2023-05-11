/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

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

        Cliente cliente1 = new Cliente();
        EntidadBancaria banco1 = new EntidadBancaria();
        InstitucionFinanciera insti1 = new InstitucionFinanciera();
        
        
        insti1.establecerCliente(cliente1);
        insti1.establecerBanco(banco1);
        insti1.calcularComision();
        
        System.out.printf("%s\n", insti1);

        
        Cliente cliente2 = new Cliente("Juan David", "Orgimenes Valverde",
                "110181222901");
        EntidadBancaria banco2 = new EntidadBancaria("Banco de Guayaquil", 2);
        InstitucionFinanciera insti2 = new InstitucionFinanciera(cliente2,
                                                            banco2, 14300);
        
        insti2.establecerCliente(cliente2);
        insti2.establecerBanco(banco2);
        insti2.calcularComision();
        
        System.out.printf("%s", insti2);
    }

}
