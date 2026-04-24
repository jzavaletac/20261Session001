
import controlador.ControladorOperaciones;
import java.util.Scanner;
import modelo.Operaciones;
import vista.frmOperaciones;
public class Session01 {
    public static void main(String[] args) {
        
        Operaciones modelo = new Operaciones(20, 30);
        frmOperaciones vista =  new frmOperaciones();
        ControladorOperaciones controlador = 
                    new ControladorOperaciones(modelo, vista);
        controlador.iniciar();
        
        /*Scanner teclado = new Scanner(System.in);
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
        */
    }

    private static frmOperaciones frmOperaciones() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
