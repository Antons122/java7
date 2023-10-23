package org.example;


public class Student {
    private String vards;
    private String uzvards;
    private int kurss;
    private String fakultate;

    public Student(String vards, String uzvards, int kurss, String fakultate) {
        if (kurss < 1) {
            this.kurss = 1;
        } else if (kurss > 4) {
            this.kurss = 4;
        } else {
            this.kurss = kurss;
        }
        this.vards = vards;
        this.uzvards = uzvards;
        this.fakultate = fakultate;
    }

    public void printStudentInfo() {
        System.out.println("Studenta vārds: " + vards);
        System.out.println("Studenta uzvārds: " + uzvards);
        System.out.println("Kurss: " + kurss);
        System.out.println("Fakultāte: " + fakultate);
    }

    public static void main(String[] args) {
        Student student1 = new Student("John", "Doe", 0, "Informatika");
        Student student2 = new Student("Jane", "Smith", 5, "Ekonomika");
        Student student3 = new Student("Alice", "Johnson", 2, "Matemātika");

        student1.printStudentInfo();
        student2.printStudentInfo();
        student3.printStudentInfo();
    }
}



