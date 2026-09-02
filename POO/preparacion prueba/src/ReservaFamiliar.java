public class ReservaFamiliar extends Reserva {

    public ReservaFamiliar(String codigo, String huesped, int cant_noches){
        super(codigo,huesped,cant_noches);
    }
    @Override
    public String getTipo(){
        return "Reserva Familiar";
    }

    @Override
    public int calcularTotal() {
        return 80000 * getCant_noches();
    }
}
