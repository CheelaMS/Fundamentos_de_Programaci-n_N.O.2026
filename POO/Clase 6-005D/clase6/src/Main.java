import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        ArrayList<Jugador> jugadores = new ArrayList<>();


        try{
            System.out.println("Bienvenido a la CLS");
            System.out.println("Ingrese nombre del jugador:");
            String nombre = teclado.nextLine();

            System.out.println("\n Ingrese la edad:");
            int edad = Integer.parseInt(teclado.nextLine());

            Jugador jugador = new Jugador(nombre,edad);
            jugadores.add(jugador);
            System.out.println("Jugador registrado correctamente");
            System.out.println(jugador);

            System.out.println("\n Ingrese la posición:");
            int posicion = Integer.parseInt(teclado.nextLine());

            Jugador encontrado = jugadores.get(posicion);

            System.out.println("Jugador encontrado:");
            System.out.println(encontrado);
            guardarJugador(encontrado);
        }catch (NumberFormatException e){
            System.out.println("Error: Edad o posición debe ser un numero");
        }catch (IndexOutOfBoundsException e){
            //user pone posicion inexistente
            System.out.println("Error: Posición no existe");
        }catch (IllegalArgumentException e){
            System.out.println("Error: Argumento invalido");
        }catch (EdadInvalidaException e){
            System.out.println("Error: Edad Invalida");
        }catch (IOException e){
            System.out.println("Error: Error de guardado");
        }catch(Exception e){
            System.out.println("Error inesperado");
        }finally {
            teclado.close();
            System.out.println("Programa Finalizado");
        }

    }
    public static void guardarJugador(Jugador jugador)
            throws IOException{
        FileWriter archivo = new FileWriter("jugadores.txt", true);
        archivo.write(jugador + "\n");
        archivo.close();
        System.out.println("Jugar creado correctamente en jugadores.txt");
    }
}
