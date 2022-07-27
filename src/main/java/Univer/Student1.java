package Univer;

public class Student1 {

    String name;
    String department;
    int grade;

    public Student1(String name, String department, int grade) {
        this.name = name;
        this.department = department;
        this.grade = grade;
    }

    void sayData (){
        System.out.println("My name"+" - "+name);
        System.out.println("My Department"+" - "+department);
        System.out.println("My grade"+" - "+grade);
    }

    void study() {

        if (grade <= 4) {
            System.out.println("Term paper - Passed");
            System.out.println("Session - Passed");
            grade++;
            System.out.println("Grade"+" - "+grade);
            System.out.println("Holiday started");
        }
        else {
            System.out.println("Term paper - Passed");
            System.out.println("Session - Passed");
            System.out.println("Defended my diploma");
            System.out.println("Graduated!");
        }
    }

}
