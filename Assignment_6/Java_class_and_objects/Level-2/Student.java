class Student {
    String name;
    int rollNumber;
    double marks;
    public String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 50) return "C";
        else return "F";
    }
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rahul";
        s.rollNumber = 101;
        s.marks = 85;
        s.displayDetails();
    }
}