package ajedrez;

import java.util.Scanner;

public class AJEDREZ {

    public static String[][] tablero = new String[8][8]; // Defino Matriz String para todo el codigo, con nombre tablero
    public static String ficha;
    public static String[] pieza = {"RN,RB"};
    public static int[] can = {1, 1};

    /**
     * Recibe un Scanner
     *
     * @param Scanner es la matriz a imprimir
     */
    public static String[][] AgregarPosicion(Scanner sc) {
        boolean validez = true;
        do {
            System.out.println("Digite ficha posFil posCol");
            System.out.println("Ejemplo:RN 3 4");
//Lee una cadena
            String fichaAagregar = sc.nextLine();
// Parte la cadena en espacios
            String[] arrStrings = fichaAagregar.split(" ");
// Procesar la cadena
            ficha = arrStrings[0];
            int posF = Integer.parseInt(arrStrings[1]);
            int posC = Integer.parseInt(arrStrings[2]);
            System.out.println("Ficha " + ficha + " agregada en");
            System.out.println("Fila " + posF);
            System.out.println("Col " + posC);
//Crear el tablero 
            tablero[posF][posC] = ficha;
            validez = fichas(ficha);
        } while (validez == false);
        return tablero;
    }

    public static boolean fichas(String ficha) {
        boolean validezFicha = true;
        String RN = "RN";
        int numRN = 0;
        String RB = "RB";
        int numRB = 0;
        String DN = "DN";
        int numDN = 0;
        String DB = "DB";
        int numDB = 0;
        String TN = "TN";
        int numTN = 0;
        String TB = "TB";
        int numTB = 0;
        String AN = "AN";
        int numAN = 0;
        String AB = "AB";
        int numAB = 0;
        String CN = "CN";
        int numCN = 0;
        String CB = "CB";
        int numCB = 0;
        String PN = "PN";
        int numPN = 0;
        String PB = "PB";
        int numPB = 0;

        if (!ficha.equalsIgnoreCase(RN)) {
            if (!ficha.equalsIgnoreCase(RB)) {
                if (!ficha.equalsIgnoreCase(DN)) {
                    if (!ficha.equalsIgnoreCase(DB)) {
                        if (!ficha.equalsIgnoreCase(TN)) {
                            if (!ficha.equalsIgnoreCase(TB)) {
                                if (!ficha.equalsIgnoreCase(AN)) {
                                    if (!ficha.equalsIgnoreCase(AB)) {
                                        if (!ficha.equalsIgnoreCase(CN)) {
                                            if (!ficha.equalsIgnoreCase(CB)) {
                                                if (!ficha.equalsIgnoreCase(PN)) {
                                                    if (!ficha.equalsIgnoreCase(PB)) {
                                                        validezFicha = false;
                                                    }
                                                }
                                            }
                                        }

                                    }

                                }

                            }
                        }
                    }
                }
            }

        }
        return validezFicha;
    }

    public static void Jaques() {
        Boolean comprobacionReyN=false;
        Boolean comprobacionReyB=false;
        int filaR=0;
        int columnaR=0;
        int count=0;
        for (int fila1 = 0; fila1 < 8; fila1++) {
            for (int columna1 = 0; columna1 < 8; columna1++) {
                if (ficha.equalsIgnoreCase("RN")) {
                    comprobacionReyN=true;
                    filaR=fila1;
                    columnaR=columna1;
                }
            }
        }
        for (int fila = 0; fila < 8; fila++) {
            for (int columna = 0; columna < 8; columna++) {
                if (ficha.equalsIgnoreCase("RB")) {
                    comprobacionReyB=true;
                }
            }
        }
        
        if(comprobacionReyN==true){
            for (int fila = filaR;count<1  ; count++) {
                for (int columna = columnaR; count < 1; count++) {
                if (ficha.equalsIgnoreCase("TB")) {
                    System.out.println("Jaque con torre");
                    
                }
            }
        }
        
        }

    }

    /**
     * Recibe una matriz y imprime el tablero en pantalla
     *
     * @param tablero es la matriz a imprimir
     */
    public static void imprimirTablero() {
        for (int fil = 0; fil < 8; fil++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(tablero[fil][col] + " ");
            }
            System.out.println("");
        }
    }

    /**
     * Recibe un entero y retorna una opcion en el menu
     *
     * @param opcion es la cadena a invertir
     */
    public static int Menu(Scanner sc, int opcion) {
        do {
            System.out.println("Bienvenido al comprobador de Jaques.\nSeleccione una opción\n1) Agregar Posición\n2) Mostrar Tablero\n3) Comprobar Jaques\n4) Salir"); //Imprime el menu
            opcion = Integer.parseInt(sc.nextLine()); //Leeopcion
            switch (opcion) { //Parte lógica, selecciona opcion y lo dirige al metodo
                case 1:
                    AgregarPosicion(sc);

                    break;
                case 2:
                    imprimirTablero();
                    break;
                case 3:
                    Jaques();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no valida");

            }
        } while (opcion != 4);
        return opcion;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        int opcion = 0;
        Menu(sc, opcion);

    }
}
