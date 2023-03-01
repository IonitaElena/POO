package pb4;
import java.util.*;
public class Teacher extends Person{
    Vector courses;
    public Teacher(String name, String address){
        super(name, address);
        courses = new Vector();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "courses=" + courses +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public boolean addCourse(String course){
        if(courses.contains(course))
                return false;
        courses.addElement(course);
        return true;
    }
    public boolean removeCourse(String course){
        if(courses.contains(course)) {
            courses.remove(course);
            return true;
        }
        return false;
    }
}
