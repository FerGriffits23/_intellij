import java.util.Scanner;
public class cool {


    public static void main(String[] args) {
        int[][] Havana = new int[2][5];
        Scanner entrada = new Scanner(System.in);

        //llenando la matriz
        for (int i = 0; i < Havana.length; i++) { // filas
            for (int j = 0; j < Havana[i].length; j++) { //columnas
                System.out.println("Ingrese el valor para la posicion [" + i + "] [" + j + "] ");
                Havana[i][j] = entrada.nextInt();
            }
        }
        //mostramos la matriz
        for (int i = 0; i < Havana.length; i++) {
            for (int j = 0; j < Havana[i].length; j++) {
                System.out.println("valor para la posicion [" + i + "] [" + j + "] = " + Havana[i][j]);
            }
        }
    }
}

