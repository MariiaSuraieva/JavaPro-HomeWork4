package hillel.suraieva.Figures;

import hillel.suraieva.Figures.FigureSquare;

public class Triangle implements FigureSquare {

    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double calculateSquare() {
        double result = a*h/2.0;
        System.out.println("Площадь треугольника = " + result);
        return result;
    }
}
