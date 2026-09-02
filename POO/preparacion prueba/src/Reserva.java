public abstract class Reserva implements Calculable {

    private String codigo;
    private String huesped;
    private int cant_noches;

    public Reserva(String codigo, String huesped, int cant_noches) {

        if(codigo.isBlank()||huesped.isBlank()||cant_noches <=0){
            throw new IllegalArgumentException("Datos invalidos");
        }

        this.codigo = codigo;
        this.huesped = huesped;
        this.cant_noches = cant_noches;
    }

    public int getCant_noches() {
        return cant_noches;
    }

    //metodo abstracto para saber el tipo de reserva
    public abstract String getTipo();

    public String mostrarDetalle(){
        return codigo
                + " | " + huesped
                + " | " + getTipo()
                + " | " + cant_noches + " noches"
                + " | Total: $" + calcularTotal();
    }

}
