public class Main {
    public static void main(String[] args) {
        double[] x = {-2, -1, 0, 4};
        double[] y = {-2, 4, 1, 8};
        LagrangeInt test = new LagrangeInt(x, y);

        System.out.println(-2-(-1));

        System.out.println();
        System.out.println(test.calculate(2));
        
    }
}