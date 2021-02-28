public class Aufgaben {

    public static void main(String[] args) {
        Aufgaben a = new Aufgaben();
        a.Aufgabe_2();
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

}
