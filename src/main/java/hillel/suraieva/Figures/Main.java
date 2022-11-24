package hillel.suraieva.Figures;

public class Main {
    public static void main(String[] args) {
        FigureSquare[] figureSquares = new FigureSquare[3];
        figureSquares[0] = new Round(5);
        figureSquares[1] = new Square(5);
        figureSquares[2] = new Triangle(5, 1.2);
        double sumSquare = 0;
        for (int i = 0; i < figureSquares.length; i++) {
            sumSquare += figureSquares[i].calculateSquare();
        }
        System.out.println("Суммарная площадь фигур = " + sumSquare);


    }

}
