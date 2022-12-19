public class oops1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = s1;
        s1.printDetails();
        s2.printDetails();

        s1.name = "SR";

        s1.printDetails();
        s2.printDetails();
    }
}

class Student {
    String name;
    int age;
    String address;
    String degree;

    Student() {
        name = "Sample";
        age = 20;
        address = "India";
        degree = "BE";
    }

    void printDetails() {
        System.out.println("Name = " + name + " Age = " + age + " Address = " + address + " Degree = " + degree);
    }
} 