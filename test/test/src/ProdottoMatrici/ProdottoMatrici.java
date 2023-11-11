package ProdottoMatrici;

public class ProdottoMatrici {


    public static int[][] moltiplicaMatrici(int[][] matrice1, int[][] matrice2) {
        int righeMatrice1 = matrice1.length;
        int colonneMatrice1 = matrice1[0].length;
        int righeMatrice2 = matrice2.length;
        int colonneMatrice2 = matrice2[0].length;

        // Verifica se le matrici possono essere moltiplicate
        if (colonneMatrice1 != righeMatrice2) {
            throw new IllegalArgumentException("Impossibile moltiplicare le matrici. Il numero di colonne della prima matrice deve essere uguale al numero di righe della seconda matrice.");
        }

        // Inizializza la matrice risultante
        int[][] risultato = new int[righeMatrice1][colonneMatrice2];

        // Calcola il prodotto delle due matrici
        for (int i = 0; i < righeMatrice1; i++) {
            for (int j = 0; j < colonneMatrice2; j++) {
                for (int k = 0; k < colonneMatrice1; k++) {
                    risultato[i][j] += matrice1[i][k] * matrice2[k][j];
                }
            }
        }

        return risultato;
    }
    
    
    
}

