import java.util.Arrays;
import java.util.Random;

public class Aufgaben {

    public static void main(String[] args) {
        Aufgaben a = new Aufgaben();
        //a.Aufgabe_2();
        //a.Aufgabe_3();
    }

    public void Aufgabe_2(){

        int[] a1 = new int[4];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        a1[3] = 4;

        int sum = 0;

        for (int i = 0; i < a1.length; i++) {
            sum = sum + a1[i];
            
          }

        System.out.println("Ergebnis:"+ sum );

    }

    public void Aufgabe_3(){

        int[] zahlen = new int[10];
        zahlen[0] = 1;
        zahlen[1] = 2;
        zahlen[2] = 3;
        zahlen[3] = 4;
        zahlen[4] = 5;
        zahlen[5] = 6;
        zahlen[6] = 7;
        zahlen[7] = 8;
        zahlen[8] = 9;
        zahlen[9] = 10;

        for(int i = 0 ; i < zahlen.length ; i++){
            System.out.println(zahlen[i]);

        }

    }

    public void Aufgabe_4(){
        int[][] Vier_gewinnt = new int[7][6];

        for(int s = 0; s < 7; s++){
            int Spalte = s;
            for(int z = 0; z < 6; z++){
                int Zeile = z;

                Vier_gewinnt[Spalte][Zeile] = 0;
            }

        for(int sp = 7, z = 0; z < 6; z++   ){
            int Spalte_sp1 = sp;
            int Zeile_sp1 = z;
            int Spalte_sp2 = sp - 1;
            int Zeile_sp2 = z;
            Vier_gewinnt[Spalte_sp1][Zeile_sp1] = 1;
            Vier_gewinnt[Spalte_sp2][Zeile_sp2] = 2;

        }
            
    
    }

}
}
