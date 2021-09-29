import java.util.*;
class Box{
 Scanner sc = new Scanner(System.in);
 int l = sc.nextInt();
 int b = sc.nextInt();
}
class BoxArea extends Box {
 int h = sc.nextInt();
 void area() {
 int a = h * b;
 System.out.println("Area of the box is: " + a);
 }
 void volume() {
 int v = h * l * b;
 System.out.println("Volume of the box is: " + v);
 System.out.println("Cost of coloring: " + v * 2.5);
 }
}
public class box_main{
 public static void main(String[] args) {
 System.out.println("Enter height, length and breadth of the box:");
 BoxArea ob = new BoxArea();
 ob.area();
 ob.volume();
 }
}
