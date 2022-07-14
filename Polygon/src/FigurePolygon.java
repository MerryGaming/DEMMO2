import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static until.UntilScaner.SCANNER;

public class FigurePolygon {
    protected int numberOfEdges;
    protected int[] edges;

    public FigurePolygon() {
        this.numberOfEdges = 0;
        edges = new int[numberOfEdges];
    }

    public FigurePolygon(int numberOfEdges) {
        this.numberOfEdges = numberOfEdges;
        this.edges = new int[numberOfEdges];
    }

    public FigurePolygon(int numberOfEdges, int[] edges) {
        this.numberOfEdges = numberOfEdges;
        this.edges = edges;
    }

    public int getNumberOfEdges() {
        return numberOfEdges;
    }

    public void setNumberOfEdges(int numberOfEdges) {
        this.numberOfEdges = numberOfEdges;
    }

    public int[] getEdges() {
        return edges;
    }

    public void setEdges(int[] edges) {
        this.edges = edges;
    }

    public void enter() {
        do {
            System.out.printf("Nhap so luong canh: ");
            this.numberOfEdges = SCANNER.nextInt();

            if (this.numberOfEdges <= 2) {
                System.out.println(
                        "Please re enter again because polygon must be have number of edges greater than 2 edges"
                );
            }
        } while(this.numberOfEdges <= 2);

        this.edges = new int[this.numberOfEdges];
        for (int i = 0; i < this.numberOfEdges; i++) {
            do {
                System.out.printf("Nhap canh thu " + (i + 1) + ": ");
                this.edges[i] = SCANNER.nextInt();
            } while (this.edges[i] > 0);
        }
    }


    @Override
    public String toString() {
        return "FigurePolygon{" +
                "numberOfEdges=" + numberOfEdges +
                ", arr=" + Arrays.toString(edges) +
                '}';
    }

    public int getPerimeter() {
        int perimeter = 0;
        for(int i = 0; i < this.numberOfEdges; i++) {
            perimeter += this.edges[i];
        }
        return perimeter;
    }

    public void print() {
        System.out.println("Độ dài các cạnh lần lưt là: ");
        for (int i = 0; i < this.numberOfEdges; i++) {
            if(i < (this.numberOfEdges-1)) {
                System.out.print(this.edges[i] + "      ");
            }
            else {
                System.out.println(this.edges[i]);
            }
        }
        System.out.println("\n------------------------------------------------\n");
    }






}
