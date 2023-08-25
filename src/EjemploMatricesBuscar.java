public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        int[][] matriz = {
                {35, 90, 3, 1978},
                {15, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elementoBuscar = 1999;
        boolean encontrado = false;
        int i;
        int j = 0;

        buscar: for (i = 0; i < matriz.length; i++){
            for (j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if (encontrado){
            System.out.println("el elemento " + elementoBuscar + " se ha encontrado en las coodenadas " + i + " , " + j);
        } else {
            System.out.println("el elemento "+ elementoBuscar + " no se ha encontrado ");
        }
    }
}
