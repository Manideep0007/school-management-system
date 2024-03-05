package moneymanagement;

import java.util.*;
public class School {
    private List<Teacher>teachers;
    private List<Student>students;
    private static int totalmoneyearned;
    private static int totalmoneyspent;

    public School(List<Teacher>teachers,List<Student>students){
        this.teachers=teachers;
        this.students=students;
        totalmoneyearned=0;
        totalmoneyspent=0;
    }

    public void addteacher(Teacher teacher){
        teachers.add(teacher);
    }
    public List<Teacher>getteachers(){
        return teachers;
    }

    public void addstudent(Student student){
        students.add(student);
    }
    public List<Student>getstudents(){
        return students;
    }

    public static void updatetotalmoneyearned(int Moneyearned){
        totalmoneyearned+=Moneyearned;
    }
    public static int gettotalmoneyearned(){
        return totalmoneyearned;
    }

    public static void updatetotalmoneyspent(int Moneyspent){
        totalmoneyspent+=Moneyspent;
    }
    public static int gettotalmoneyspent(){
        return totalmoneyspent;
    }
    public int getbalanceleftinsnist(){
        int balanceleft=totalmoneyearned-totalmoneyspent;
        return balanceleft;
    }
    @Override
    public String toString(){
        return "name is " + teachers
        "id is ";
     }
}
    

