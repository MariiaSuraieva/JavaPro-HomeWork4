package hillel.suraieva.Figures;

import hillel.suraieva.Figures.FigureSquare;

import static java.lang.Math.PI;

public class Round implements FigureSquare {
    private double r;

    public Round(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        r = r;
    }

    @Override
    public double calculateSquare() {
        double result = PI * Math.pow(r, 2);
        System.out.println("Площадь круга = " + result);
        return result;
    }

}
