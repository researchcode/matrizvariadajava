package matrizvariada;

public class MatrizVariada {

    public static void main(String[] args) {
        Object[][] datos = new Object[5][3];
        datos = llenarMatriz(datos);
        imprimirMatriz(datos);
    }//cierra main  

    public static Object[][] llenarMatriz(Object[][] matriz) {
       //Fila 0
        matriz[0][0] = "Alicia";
        matriz[0][1] = 10;
        matriz[0][2] = 'A';
        //Fila 1
        matriz[1][0] = "Luis";
        matriz[1][1] = 25;
        matriz[1][2] = 'B';
        //Fila 2
        matriz[2][0] = "Camilo";
        matriz[2][1] = 25;
        matriz[2][2] = 'A';
        //Fila 3
        matriz[3][0] = "León";
        matriz[3][1] = 25;
        matriz[3][2] = 'C';
        //Fila 4
        matriz[4][0] = "Arturo";
        matriz[4][1] = 25;
        matriz[4][2] = 'B';

        return matriz;
    }//cierra llenarMatriz

    public static void imprimirMatriz(Object[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println("");
        }
    }//cierra imprimirMatriz
}//cierra class
