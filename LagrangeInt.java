import java.util.ArrayList;

public class LagrangeInt {
    private final double[] xData;
    private final double[] yData;

    private ArrayList<Double> largrangeNumer;
    private ArrayList<Double> largrangeDenom;
    public LagrangeInt(double[] xData, double[] yData) {
        this.xData = xData;
        this.yData = yData;
        this.largrangeNumer = new ArrayList<>();
        this.largrangeDenom = new ArrayList<>();
    }

    public double calculate(double xInput) {
        for (int i = 0; i < xData.length; i++) {
            double currentNumer = yData[i];
            double currentDenom = 1;
            for (int j = 0; j < xData.length; j++) {
                if (xData[i] != xData[j]) {
                    
                    currentNumer = currentNumer * (xInput - (xData[j])); 
                    System.out.println("Current N: " + currentNumer);
                    System.out.println("Current y: " + yData[i]);
                    System.out.println("Current x: " + xData[j]);
                    

                    currentDenom = currentDenom * (xData[i]- xData[j]);
                    System.out.println("Current D: " + currentDenom);
                    
                }
            }
            largrangeNumer.add(currentNumer);
            largrangeDenom.add(currentDenom);
        }

        for (double num : largrangeNumer) {
            System.out.print(num + " ");
        }

        System.out.println();

        for (double num : largrangeDenom) {
            System.out.print(num + " ");
        }
        
        double largrangeEstimate = 0;
        for (int i = 0; i < xData.length; i++) {
            largrangeEstimate += (largrangeNumer.get(i)/largrangeDenom.get(i));
        }

        return largrangeEstimate;
    }


}