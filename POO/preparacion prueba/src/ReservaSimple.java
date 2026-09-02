public class ReservaSimple extends Reserva {

    public ReservaSimple(String codigo, String huesped, int cant_noches){
        super(codigo,huesped,cant_noches);
    }
    @Override
    public String getTipo(){
        return "Reserva Simple";
    }

    @Override
    public int calcularTotal() {
        return 45000 * getCant_noches();
    }
}
