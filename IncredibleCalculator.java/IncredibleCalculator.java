import java.util.Scanner;

public class IncredibleCalculator {

    public static void main(String[] args) {

        int num1, num2 , suma, resta, producto, divison;
        double divisionDecimales;

        System.out.println("Selecciona la operación que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (división entera)");
        System.out.println("5. Dividir (división con decimales)");

        int opcion = leerEnteroEntrada();


        switch (opcion) {
            case 1: //Sumar. Debes leer dos numeros enteros de entrada e imprimir su suma
                    num1 = Leer.leerEnteroEntrada();
                    num2 = Leer.leerEnteroEntrada();
                    suma = num1+num2;
                    System.out.println(suma);
                    break;
            case 2: // Restar. Debes leer dos números enteros de entrada e imprimir su resta
                    num1 = Leer.leerEnteroEntrada();
                    num2 = Leer.leerEnteroEntrada();
                    resta = num1-num2;
                    System.out.println(resta);
                    break;
            case 3: // Multiplicar. Debes leer dos números enteros de entrada e imprimir su producto.
                    num1 = Leer.leerEnteroEntrada();
                    num2 = Leer.leerEnteroEntrada();
                    producto = num1*num2;
                    System.out.println(producto);
                    break;
            case 4: // Division entera. Debes leer dos números enteros de entrada e imprimir su división entera.
                   
                    break;
            case 5: // Division decimales. Debes leer dos números enteros de entrada e imprimir su división con decimales.
                
                    break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un número entero!");
            System.exit(1);
            return -1;
        }

    }

}