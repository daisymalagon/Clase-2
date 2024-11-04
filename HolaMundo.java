import java.util.Scanner;

/**
 * HolaMundo
 */
public class HolaMundo {
    public static void main(String[] args) {
        // Imprimir datos en pantalla / consola / terminal
        System.out.println("Hola Mundo!");  

        System.out.print("Como van las cosas");
        System.out.print(10);
        System.out.print(10.5); 
        System.out.print('A'); 
        System.out.println("Mi nombre es" + "Daisy" + "y tengo " + 18 + "años");

        System.out.printf("Aqui va una cadena: %s%n", "Daisy");
        System.out.printf("Aqui va un entero: %d%n", 10);
        System.out.printf("Mi nombre es %s y tengo %d años%n", "Daisy", 18);

        var entrada = new Scanner(System.in);

        System.out.print("Por favor ingresar su nombre: ");
        var entero = entrada.nextLine();

        System.out.println(entero);

        entrada.close();
    }
}

