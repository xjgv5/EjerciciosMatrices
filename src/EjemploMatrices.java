public class EjemploMatrices {
    public static void main(String[] args) {
        int[][] numeros = new int[2][4];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 11;
        numeros[1][1] = 12;
        numeros[1][2] = 13;
        numeros[1][3] = 14;

        System.out.println("Numero de filas : " + numeros.length);
        System.out.println("Numero de columnas : " + numeros[1].length);

        System.out.println("Primer elemento de la matriz : " + numeros[0][0]);
        System.out.println("Ultimo numero de la matriz : " + numeros[1][numeros[1].length - 1]);
    }
}
