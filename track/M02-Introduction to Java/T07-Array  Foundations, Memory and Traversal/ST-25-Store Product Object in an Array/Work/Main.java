package track.M02-Introduction to Java.T07-Array  Foundations, Memory and Traversal.ST-25-Store Product Object in an Array.Work;
import java.util.*;

class Product{
    String name;

    Product(String name){
        this.name = name;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Product[] p = new Product[2];

        for(int i=0; i<p.length; i++){
            //System.out.println("Enter the Name of Product " + (i+1) + ": ");
            String name = sc.nextLine();
            p[i] = new Product(name);

        }

        for(int i=0; i<p.length; i++){
            System.out.println(p[i].name);
        }
    }
}
