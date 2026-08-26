public class PagoTransferencia implements MetodoPago{

    private String banco;

    public PagoTransferencia(String banco) {
        this.banco = banco;
    }

    @Override
    public void pagar(double monto) {
        if(monto <=0){
            System.out.println("El monto debe ser mayor a cero");
            return;
        }
        System.out.println("Transferencia realizada");
        System.out.println("Banco: "+banco);
        System.out.println("Monto: "+monto);
    }

    @Override
    public String obtenerNombre() {
        return "Transferencia";
    }
}
