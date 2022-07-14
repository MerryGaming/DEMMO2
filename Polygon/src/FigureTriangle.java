import java.util.Scanner;
import java.util.logging.Logger;

import static until.UntilScaner.SCANNER;

public class FigureTriangle extends FigurePolygon {

    private static final Logger LOG = Logger.getLogger(FigureTriangle.class.getName());

    private static final int TRIANGLE_NUMBER_EDGES = 3;

    public FigureTriangle() {
        super(TRIANGLE_NUMBER_EDGES);
    }

    public void enterTriangle() {
            do{
                for(int i = 0; i < this.numberOfEdges; i++) {
                    System.out.printf("Nhap canh thu " + (i + 1) + " la: ");
                    this.edges[i] = SCANNER.nextInt();
                }
                if (!check()) {
                    LOG.warning("invalid triangle, please re-enter again!!!");
                }
            } while(check());
        System.out.println("\n============================================\n");

    }

    public double getArea() {
        int halfOfPerimeter = getPerimeter();

        long x = halfOfPerimeter;
        for (int i = 0; i < this.numberOfEdges; i ++) {
            x *= (halfOfPerimeter - this.edges[i]);
        }
        return Math.sqrt(x);
    }

    @Override
    public int getPerimeter() {
        LOG.info("(getPerimeter)");
        return super.getPerimeter();
    }

    @Override
    public void print() {
        super.print();
    }

    private boolean check() {
        return
                ((this.edges[0] + this.edges[1]) <= this.edges[2])
                        || ((this.edges[0] + this.edges[2]) <= this.edges[1])
                        || ((this.edges[2] + this.edges[1]) <= this.edges[0]);
    }
}
