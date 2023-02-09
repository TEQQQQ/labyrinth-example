import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class labyrinth {
    public static void main(String args[]) throws Exception {
        String path = "labirent.txt"; // Make sure the data path is correct.
        FileInputStream fis = new FileInputStream(path);
        int control = 0;
        int matris[][] = new int[20][20];
        int yeni_matris[][] = new int[20][20];
        int cevap[][] = new int[20][20];
        String metin = "";
        int hamle = 1;

        while ((control = fis.read()) != -1) {

            metin += (char) control;

        }

        char[] chararray = metin.toCharArray();
        int sayac = 0;
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matris[i][j] = chararray[sayac];
                sayac += 1;
            }
            sayac += 2;

        }

        for (int k = 0; k < 20; k++) {
            for (int b = 0; b < 20; b++) {

                System.out.print((char) matris[k][b]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(chararray);

        for (int a = 0; a < 20; a++) {
            for (int z = 0; z < 20; z++) {
                yeni_matris[a][z] = matris[a][z];

            }
        }

        for (int xx = 0; xx < 38; xx++) {
            for (int p = 0; p < 20; p++) {
                for (int q = 0; q < 20; q++) {

                    if (yeni_matris[p][q] == 57) {
                        if (yeni_matris[p + 1][q] == 49) {
                            yeni_matris[p + 1][q] = 65;
                        }
                        if (yeni_matris[p - 1][q] == 49) {
                            yeni_matris[p - 1][q] = 65;
                        }
                        if (yeni_matris[p][q + 1] == 49) {
                            yeni_matris[p][q + 1] = 65;
                        }
                        if (yeni_matris[p][q - 1] == 49) {
                            yeni_matris[p][q - 1] = 65;
                        }
                    }
                    if (hamle == 1) {
                        if (yeni_matris[p][q] == 65) {
                            if (yeni_matris[p - 1][q] == 49) {
                                yeni_matris[p - 1][q] = 65;
                                hamle = 0;
                                break;
                            } else if (yeni_matris[p][q - 1] == 49) {
                                yeni_matris[p][q - 1] = 65;
                                hamle = 0;
                                break;
                            } else if (yeni_matris[p][q + 1] == 49) {
                                yeni_matris[p][q + 1] = 65;
                                hamle = 0;
                                break;
                            }
                        }
                    }

                }

            }
            hamle = 1;

        }
        System.out.println();
        System.out.println();
        System.out.println();
        for (int ii = 0; ii < 20; ii++) {
            for (int jj = 0; jj < 20; jj++) {

                System.out.print((char) yeni_matris[ii][jj]);
            }
            System.out.println();
        }

        for (int iii = 0; iii < 20; iii++) {
            for (int jjj = 0; jjj < 20; jjj++) {
                if (iii == 0 & jjj == 0) {
                    cevap[iii][jjj] = yeni_matris[iii][jjj];
                } else if (yeni_matris[iii][jjj] == 65) {

                    cevap[iii][jjj] = 49;
                } else if (yeni_matris[iii][jjj] == 57) {
                    cevap[iii][jjj] = 57;
                } else {
                    cevap[iii][jjj] = 32;
                }

            }
        }

        System.out.println();
        System.out.println();
        System.out.println();
        for (int bb = 0; bb < 20; bb++) {
            for (int cc = 0; cc < 20; cc++) {

                System.out.print((char) cevap[bb][cc]);
            }
            System.out.println();
        }
    }
}