/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema04;

/**
 *
 * @author carlo
 */
public class InstitucionFinanciera {

    private Cliente cliente;
    private EntidadBancaria banco;
    private double valorCheque;
    private double comision;

    public InstitucionFinanciera() {
        valorCheque = 6550;
    }

    public InstitucionFinanciera(Cliente clien, EntidadBancaria eBan, double valorC) {
        cliente = clien;
        banco = eBan;
        valorCheque = valorC;
    }

    public void establecerCliente(Cliente c) {
        cliente = c;
    }

    public void establecerBanco(EntidadBancaria b) {
        banco = b;
    }

    public void calcularVCheque(double valorC) {
        valorCheque = valorC;
    }

    public void calcularComision() {
        comision = 0.00003 * valorCheque;
    }

    public Cliente obtenerCliente() {
        return cliente;
    }

    public EntidadBancaria obtenerBanco() {
        return banco;
    }

    public double obtenerValorCheque() {
        return valorCheque;
    }

    public double obtenerComision() {
        return comision;
    }

    @Override
    public String toString() {
        String mensaje;
        mensaje = String.format("Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Identificacion o cedula: %s\n"
                + "Nombre de su banco: %s\n"
                + "Numero de sucursales de su banco: %d\n"
                + "Valor del cheque: %.2f\n"
                + "Comision: %.2f\n",
                obtenerCliente().obtenerNombres(),
                obtenerCliente().obtenerApellidos(),
                obtenerCliente().obtenerIdentificacion(),
                obtenerBanco().obtenerNombreBanco(),
                obtenerBanco().obtenerNumeroSucursales(),
                obtenerValorCheque(),
                obtenerComision());
        return mensaje;
    }

}
