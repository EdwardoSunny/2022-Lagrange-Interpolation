public class Main {
    public static void main(String[] args) {
        double[] x = {5, 6, 9, 11};
        double[] y = {12, 13, 14, 16};
        LagrangeInt test = new LagrangeInt(x, y);

        System.out.println(test.calculate(10));
        
    }
}