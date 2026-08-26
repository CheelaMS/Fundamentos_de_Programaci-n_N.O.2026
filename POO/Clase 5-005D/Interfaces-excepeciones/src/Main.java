import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido a mi sistema de pagos");
        System.out.println("1- Pagar con tarjeta");
        System.out.println("2- Pagar con transferencia");
        //Excepcion
        //try
        try{
            System.out.println("Seleccione su opción");
            int opcion=  Integer.parseInt(teclado.nextLine());
            System.out.println("Ingrese el monto: $");
            double monto = Double.parseDouble(
                    teclado.nextLine(). replace(",","."));
            //variable que puede guardar objetos

            MetodoPago metodoPago;

            if(opcion==1){
                metodoPago = new PagoTarjeta(15000);
            } else if (opcion==2) {
                System.out.println("Ingrese el banco: ");
                String banco = teclado.nextLine();
                metodoPago = new PagoTransferencia(banco);

            }else{
                System.out.println("Opcion no existe");
                return;
            }
            System.out.println("Metodo de pago: " + metodoPago.obtenerNombre());
            metodoPago.pagar(monto);



        }catch(NumberFormatException e){
            System.out.println("Debe ingresar nùmeros vàlidos");
        }
        finally {
            teclado.close();
            System.out.println("Programa finalizado");
        }

    }
}
