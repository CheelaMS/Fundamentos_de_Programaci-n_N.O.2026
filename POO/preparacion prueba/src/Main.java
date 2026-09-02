import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);

    static ArrayList<Reserva> reservas = new ArrayList<>();

    public static void main(String[] args){

        int opcion = 0;

        while (opcion != 3){
            System.out.println("\n ======BIENVENIDO AL HOTEL IBIS======");
            System.out.println("1.Registrar reserva");
            System.out.println("2.Listar reserva");
            System.out.println("3.Salir");

            try {
                opcion= leerEntero("Selecciona una opción: ");
                switch (opcion){
                    case 1:
                        registrarReserva();
                        break;
                    case 2:
                        listarReservas();
                        break;
                    case 3:
                        System.out.println("Programa finalizado");
                        break;
                    default:
                        System.out.println("Opción no valida");
                        break;

                }
            }catch (Exception error){
                System.out.println("Error" + error.getMessage());
            }

        }
        entrada.close();



    }
    static void registrarReserva(){
        System.out.println("Ingresa el codigo de la reserva");
        String codigo = entrada.nextLine().trim();
        System.out.println("Ingresa el nombre del Huesped");
        String huesped = entrada.nextLine().trim();
        int cant_noches = leerEntero("Ingrese la cantidad de noches");

        System.out.println("1. Habitacion simple");
        System.out.println("2. Habitacion familiar");
        int tipo = leerEntero("Seleccione el tipo de habitación");
        Reserva reserva;

        if (tipo==1){
            reserva = new ReservaSimple(codigo,huesped,cant_noches);
        }else if(tipo==2) {
            reserva = new ReservaFamiliar(codigo,huesped,cant_noches);
        }
        else{
            throw new IllegalArgumentException("El tipo de reserva debe ser 1 o 2");
        }
        reservas.add(reserva);
        System.out.println("Reserva agregada exitosamente");
    }
    static void listarReservas(){
        //verificamos que la lista no este vacia
        if (reservas.isEmpty()){
            System.out.println("No existen reservas");
            return;
        }
        for (Reserva reserva : reservas){
            System.out.println(reserva.mostrarDetalle());
            System.out.println("==============");

        }

    }
    static int leerEntero(String mensaje){
        System.out.println(mensaje);
        return Integer.parseInt(entrada.nextLine());
    }
}
