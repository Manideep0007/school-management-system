package moneymanagement;

public class Teacher {
    private int id;
    private String name;
    private int salary;


    public Teacher(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    public void setsalary(int salary){
        this.salary=salary;
        School.updatetotalmoneyspent(salary);
    }
    public int getsalary(){
        return salary;
    }
    
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
   @Override
   public String toString(){
    return "name is " + name;
 }
}

