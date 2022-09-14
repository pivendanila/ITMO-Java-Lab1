public class Lab {

    public static double random() {
        return (Math.random() * 24 - 13.0);
    }

    public static double func1(double x) {
        return (Math.atan(Math.cos(x)));
    }

    public static double func2(double x) {
        double c = 1.0/3.0;
        return Math.pow((c / (0.5 - Math.pow((Math.PI * x), x)) / 3), 3);
    }

    public static double func3(double x) {
        return (Math.PI/Math.pow((1.0/4.0)*(Math.pow(Math.pow())), ));
    }

    public static void main(String[] args) {
        long[] c;
        double[] x;
        double[][] d;
        int cur;

        c = new long[11];
        x = new double[12];
        d = new double[11][12];
        cur = 6;

        for (int i = 0; i < 11; i++) {
            c[i] = i + cur;
        }
        for (int i = 0; i < 12; i++) {
            x[i] = random();
        }
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 12; j++) {
                if (c[i] == 7) {
                    d[i][j] = func1(x[j]);
                } else if (c[i] == 6 || c[i] == 10 || c[i] == 11 || c[i] == 13 || c[i] == 16) {
                    d[i][j] = func2(x[j]);
                } else {
                    d[i][j] = func3(x[j]);
                }
            }
        }
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 12; j++) {
                System.out.printf("%.3f", d[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        for (int i = 0; i < 12; i++) {
            System.out.print(x[i]);
            System.out.print(" ");
        }

    }
}