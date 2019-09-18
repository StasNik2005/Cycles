public class Main {
    static int m, z;

    public static void main(String[] args) {
        int g1 = 100, g2 = 200, g3 = 500, g4 = 1000, g5 = 2000, g6 = 5000, M = 7300;
        int b1 = 512, Z = 1000;

//        addDengi(b1, Z);
//        t330();
        t362();
 /*       int[] g= {100,200,500,1000,2000,5000};


        for (int n = 0; n < g.length; n++) {
            int k = g.length-n-1;
           while (m < M ) {
               int gir = addGiyra(g[k], M);
               if (gir > 0)
                    System.out.println(gir + "x" + g[k] + " = " + m);
                k--;
                if (k >= g.length)
                    k=0;
            }
           m=0;
            System.out.println("\n");
        }
        */
/*
        System.out.println(addGiyra(g6, M) + "x" +g6+" = "+ m);
        System.out.println(addGiyra(g5, M) + "x" +g5+" = "+ m);
        System.out.println(addGiyra(g4, M) + "x" +g4+" = "+ m);
        System.out.println(addGiyra(g3, M) + "x" +g3+" = "+ m);
        System.out.println(addGiyra(g2, M) + "x" +g2+" = "+ m);
        System.out.println(addGiyra(g1, M) + "x" +g1+" = "+ m);*/

    }

    private static int addGiyra(int g6, int M) {
        int k6 = 0;

        while (m <= M) {
            m += g6;
            k6++;
        }
        if (m > M) {
            m -= g6;
            k6--;
        }

        return k6;
    }


    private static void addDengi(int b, int Z) {
        int n = 0;
        for (int i = b; i >= 1; i /= 2) {
            n = 0;
            while (Z - i >= 0) {
                Z -= i;
                n++;
            }

            //   if (n > 0)
            System.out.println(n + "x" + i);
        }
    }

    public static void t330() {
        int sum = 0;
        for (int n = 300; n <= 600; n++) {
            for (int g = 2; g < n / 2; g++) {
                if (n % g == 0) {
                    // System.out.println(g);
                    sum += g;

                }
            }
            if (sum % 10 == 0) {
                System.out.println(n);
            }

        }
    }

    public static void t362() {
        int a = 2, q = 2, an = 0, sum = 0;

        for (int k = 1; k <= 10; k += 2) {
            an = a;
            for (int i = 1; i < k; i++)
                an *= q;
            sum += an;
//            System.out.println(an);
        }
        System.out.println(sum);
    }
}
