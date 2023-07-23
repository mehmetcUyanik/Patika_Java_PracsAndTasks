package Tasks;

public class MatrisTranpozonu {
    public static void main(String[] args) {


        int[][] matris = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpoze = new int[matris[0].length][matris.length];

        for (int i = 0; i < matris[0].length; i++) {
            for (int j = 0; j < matris.length; j++) {

                transpoze[i][j] = matris[j][i];

            }

        }
        System.out.println("Matris : ");
        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {

                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Transpoze : ");
        for (int i = 0; i < transpoze.length; i++) {
            for (int j = 0; j < transpoze[i].length; j++) {

                System.out.print(transpoze[i][j]+" ");
            }
            System.out.println();
        }
    }
}
