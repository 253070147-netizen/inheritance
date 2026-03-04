class Student {
    int rollNo;
    String name;

    void setStudent(int r, String n) {
        rollNo = r;
        name = n;
    }
}
class Exam extends Student {
    int m1, m2, m3, m4, m5;
    int total;
    void setMarks(int a, int b, int c, int d, int e) {
        m1 = a;
        m2 = b;
        m3 = c;
        m4 = d;
        m5 = e;
        total = m1 + m2 + m3 + m4 + m5;
    }
}
class Result extends Exam {
    double percentage;
    String grade;
    void calculateResult() {
        percentage = total / 5.0;
        if (percentage >= 75)
            grade = "Distinction";
        else if (percentage >= 60)
            grade = "First Class";
        else if (percentage >= 50)
            grade = "Second Class";
        else if (percentage >= 40)
            grade = "Pass";
        else
            grade = "Fail";
    }
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}
class Main{
    public static void main(String[] args) {
        Result r = new Result();
        r.setStudent(124, "Swarnika");
        r.setMarks(80, 85, 97, 90, 85);
        r.calculateResult();
        r.display();
    }
}
