import java.util.Random;

public class many {
    public static void main(String[] args) {
        int[] x = new int[5];
        int[] y = new int[3];
        int[] z = new int[x.length + y.length];
        System.out.print("X = { ");
        for (int i = 0; i < x.length; i++) {
            x[i] = (new Random().nextInt(10));
            System.out.print(x[i] + " ");
        }
        System.out.println("}");
        System.out.print("Y = { ");
        for (int i = 0; i < y.length; i++) {
            y[i] = (new Random().nextInt(10));
            System.out.print(y[i] + " ");
        }
        System.out.println("}");
        System.arraycopy(x, 0, z, 0, x.length);
        System.arraycopy(y, 0, z, x.length, y.length);
        System.out.print("Z = { ");
        int i = 0;
        while (i < z.length) {
            System.out.print(z[i] + " ");
            i++;
        }
        System.out.print("}");
    }
}