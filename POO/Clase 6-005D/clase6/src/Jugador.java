public class Jugador {
    private String nombre;
    private int edad;

    public Jugador(String nombre, int edad) {
        //validar cuando el dato no cumple la regla
        if (nombre==null || nombre.isBlank()){
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        // Excepción personalizada que valida la edad del jugador
        if(edad<12){
            throw new EdadInvalidaException("La edad debe ser mayor a 12 años");
        }

        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString(){
        return nombre + " - " + edad + " años";
    }
}
