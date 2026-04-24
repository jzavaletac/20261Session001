
import java.util.Scanner;
import modelo.Operaciones;
public class Session01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Operaciones operacion = new Operaciones();
        System.out.print("Ingrese primer valor :");
        int numero = teclado.nextInt();
        operacion.setOperador1(numero);
        System.out.print("Ingrese segundo valor:");
        numero = teclado.nextInt();
        operacion.setOperador2(numero);
        System.out.println("La suma es " + operacion.sumar());
        System.out.println("La resta es " + operacion.restar());
        System.out.println("El producto es " + operacion.multiplicar());
    }
}
