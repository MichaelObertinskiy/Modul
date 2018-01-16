package task01;

import java.util.ArrayList;

public class Faculty <T>{
    T Student;

    public Faculty(T student) {
        Student = student;
    }
    T getStudent(){
        return (T) student;
    }

    ArrayList<Student> student = new ArrayList<Student>();





}
