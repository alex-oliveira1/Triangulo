import java.util.Scanner;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    Tringulo x,y;
    x=new Triangulo();
    y=new Triangulo();
    System.out.println("Enter the measures of triangle X: ");
    x.a=sc.nextDouble();
    x.b=sc.nextDouble();
    x.c=sc.nextDouble();
    System.out.println("Enter the measures of triangle Y: ");
    y.a=sc.nextDouble();
    y.b=sc.nextDouble();
    y.c=sc.nextDouble();
    double areax=x.area();
    double areay=y.area();
    }
}
