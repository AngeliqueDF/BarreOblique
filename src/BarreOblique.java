import java.util.Arrays;

public class BarreOblique {
    public static void main(String[] args) {
        int ecartGauche = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < ecartGauche; j++) {
                System.out.print(" ");
            }
            ecartGauche++;
            System.out.print("###");
            System.out.println();
        }
        char[][] dessin = new char[8][10];
        int ecartGauche2 = 0;
        int ecartDroit = 0;
        for (int i = 0; i < dessin.length; i++) {
            for (int j = 0; j < dessin[0].length; j++) {
                if (j >= ecartGauche2 && j <= ecartGauche2 + 2) {
                    dessin[i][j] = '#';
                } else {
                    dessin[i][j] = ' ';
                }
            }
            ecartGauche2++;
            for (int j = 0; j < dessin[0].length; j++) {
                if (j < dessin[0].length - ecartDroit && j >= dessin[0].length - (ecartDroit + 3)) {
                    dessin[i][j] = '#';
                }
            }
            ecartDroit++;
        }
        for (int i = 0; i < dessin.length; i++) {
            for (int j = 0; j < dessin[0].length; j++) {
                System.out.print(dessin[i][j]);
            }
            System.out.println();
        }
    }

}
