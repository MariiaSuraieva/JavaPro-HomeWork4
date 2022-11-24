package hillel.suraieva.Figures;

import hillel.suraieva.Figures.FigureSquare;

public class Square implements FigureSquare {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getR() {
        return a;
    }

    public void setR(double a) {
        this.a = a;
    }

    @Override
    public double calculateSquare() {
        double result = a * a;
        System.out.println("Площадь квадрата = " + result);
        return result;
    }


}
