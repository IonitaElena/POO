package pb4;
import java.util.*;
public class Student extends Person {
    Vector courses;
    Vector grades;
    public Student(String name, String address){
        super(name, address);
        courses = new Vector();
        grades = new Vector();
    }
    @Override
    public String toString() {
        return "Student{" +
                "courses=" + courses +
                ", grades=" + grades +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public void addCourseGrade(String course, int grade){
        int poz = courses.size();
        courses.add(poz, course);
        grades.add(poz, grade);
    }
    public void printGrades(){
        for(int i = 0; i < courses.size(); i++)
            System.out.println(courses.get(i) + ": " + grades.get(i));
    }
    public double getAverageGrade(){
        double s = 0;
        for(int i = 0; i < grades.size(); i++)
            s = Double.sum(s, (double)grades.get(i));
        return s / grades.size();
    }

}
