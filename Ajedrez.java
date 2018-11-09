package ajedrez;
import java.util.Scanner;
public class AJEDREZ {
   public static String[][] Tablero(Scanner sc){
        System.out.println("Digite ficha posFil posCol");
        System.out.println("Ejemplo:RN 3 4");
        //Lee una cadena
        String fichaAagregar = sc.nextLine();              
        // Parte la cadena en espacios
        String[] arrStrings = fichaAagregar.split(" ");
        // Procesar la cadena
        String ficha = arrStrings[0];
        int posF = Integer.parseInt(arrStrings[1]);
        int posC = Integer.parseInt(arrStrings[2]);
    
        System.out.println("Ficha " + ficha + " agregada en");
        System.out.println("Fila " + posF);
        System.out.println("Col " + posC);
        //Crear el tablero 
        String[][] tablero = new String[8][8];
        tablero[posF][posC] = ficha;
        imprimirTablero(tablero);
        return tablero;
    }
    public static void imprimirTablero(String[][] tablero) {
        for (int fil = 0; fil < 8; fil++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(tablero[fil][col] + " ");
            }
            System.out.println("");
        }
    }
    public static int Menu(int opcion){
        Scanner sc= new Scanner(System.in);
        
        
    return opcion;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenido al comprobador de Jaques.\nSeleccione una opción\n1) Agregar Posición\n2) Mostrar Tablero\n3) Comprobar Jaques\n4) Salir");
            opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    Tablero(sc);
                    break;
                case 3:
                    break;
                case 4:
                    break;
        }
        }while (opcion>4 || opcion<=0);
        
    }
}
