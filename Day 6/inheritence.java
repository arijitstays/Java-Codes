//2.Write a java program to generate multilevel inheritance.

class Student{
    public void show(){
    System.out.println("Student details.");
    }
   }
   class CollegeStudent extends Student {
    public void show() {
    System.out.println("College Student details.");
    }
   }
   class UniversityStudent extends Student{
    public void show(){
    System.out.println("University Student details.");
    }
   }
    public class inheritence {
    public static void main(String[] args) {
    Student ob1 = new CollegeStudent();
    ob1.show();
    Student ob2 = new UniversityStudent();
    ob2.show();
    }
    }
   
