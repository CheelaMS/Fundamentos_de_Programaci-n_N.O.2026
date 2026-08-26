public class PagoTarjeta implements MetodoPago{

    private double saldo;

    public PagoTarjeta(double saldo) {
        this.saldo = saldo;
    }

    //implementamos el metodo definido en la interfaz

    @Override
    public void pagar(double monto) {
        //validar que le monto sea el coorecto
        if (monto <= saldo){
            System.out.println("El monto debe ser mayor a cero");
            return;
        }
        if (monto > saldo){
            System.out.println("Saldo insuficiente");
            return;
        }
        // se generala la venta y realizamos el descuento
        saldo -= monto;
        System.out.println("Pago con tarjeta realizado");
        System.out.println("Saldo restante: "+ saldo);

    }


    @Override
    public String obtenerNombre() {
        return "Pago con tarjeta";
    }

}
