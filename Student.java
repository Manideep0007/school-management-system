package moneymanagement;

public class Student{
    private int id;
    private String name;
    private int grade;
    private static int feestotal;
    private int feespaid;
    private int remainfees;

    public Student(int id,String name,int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        feespaid=0;
        feestotal=30000;
        remainfees=0;

    }
    public void setgrade(int grade){
        this.grade=grade;
    }
    public void setfeespaid(int fees){
        feespaid=feespaid+fees;
        School.updatetotalmoneyearned(feespaid);
    }

    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    public int getgrade(){
        return grade;
    }
    public static int getfeestotal(){
        return feestotal;
    }
    public int getfeespaid(){
        return feespaid;
    }
    public int getremainfees(){
        int remainfees=feestotal-feespaid;
        return remainfees;
    }
     @Override
     public String toString(){
        return "name is " + name;
     }
   
}
