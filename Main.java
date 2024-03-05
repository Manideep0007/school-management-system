package moneymanagement;
import java.util.*;
public class Main {
    public static void main(String[]args){

        Teacher t1=new Teacher(1,"t1",10000);
        Teacher t2=new Teacher(2,"t2",20000); 
        Teacher t3=new Teacher(3,"t3",30000);
        Teacher t4=new Teacher(3,"t4",40000);

        Student s1=new Student(1,"s1",5);
        Student s2=new Student(2,"s2",6);
        Student s3=new Student(3,"s3",7);
        Student s4=new Student(4,"s4",8);

        List<Teacher>teacherslist=new ArrayList();
        teacherslist.add(t1);
        teacherslist.add(t2);
        teacherslist.add(t3);
        teacherslist.add(t4);

        List<Student>studentslist=new ArrayList();
        studentslist.add(s1);
        studentslist.add(s2);
        studentslist.add(s3);
        studentslist.add(s4);
       
         School snist=new School(teacherslist,studentslist);
         for(int i=0;i<teacherslist.size();i++){
         System.out.println(snist.getteachers());
         }
        // for(int i=0;i<studentslist.size();i++){
        // System.out.println(snist.getstudents());
        // System.out.print(snist.gettotalmoneyearned());

        s1.setfeespaid(5000);
        System.out.println("fees paid " + s1.getname() + "=" + s1.getfeespaid());
        System.out.println("the reamining fees to be paid by " + s1.getname() + "=" + s1.getremainfees());

        s2.setfeespaid(5000);
        System.out.println("fees paid " + s2.getname()+ "=" +  s2.getfeespaid());
        System.out.println("the reamining fees to be paid by s2 " + s2.getname()+ "=" + s2.getremainfees());

        System.out.println("total money earned " + snist.gettotalmoneyearned());

        t1.setsalary(2500);
        System.out.println("total money spent " + snist.gettotalmoneyspent());

        System.out.println(snist.getbalanceleftinsnist());
    }
}
    

