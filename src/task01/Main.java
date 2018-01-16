package task01;
/*
1.Задача на взаимодействие между классами. Разработать систему «Вступительные экзамены».
Абитуриент регистрируется на Факультет, сдает Экзамены. Преподаватель выставляет Оценку.
Система подсчитывает средний бал и определяет Абитуриента, зачисленного в учебное заведение.
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList student = new ArrayList();

        student.add(new Student());
        student.add(new Student());
        student.add(new Student());
        student.add(new Student());
        student.add(new Student());
        student.add(new Student());
        student.add(new Student());

    }
}
