public class Student{
    
    public String name;
    public int studentClass;
    public float result;

    public Student(String s, int sClass){
        this.name=s;
        this.studentClass=sClass;
        System.out.println("Added student: "+s+" to the roll of class: "+sClass);
    }
    
    public String getName(){
        return this.name;
    }
    public void publish(){
        if(this.result >= 33.3){
            System.out.println(this.name + " has been promoted to class:"+(this.studentClass+1));
        }
        else{
            System.out.println(this.name + " has been retained in class:"+this.studentClass);
        }
    }
    
     public static void main(String []args){
         
         Result r = new Result(89, 90, 96, "Bcd", 20);
         r.calculateResult();
        //Student s=new Student("Abc",4);
        //String a = s.getName();
        //System.out.println("Name is : "+a);
     }
}


class Result extends Student{
    public int subject1;
    public int subject2;
    public int subject3;
    
    public Result(int a, int b, int c, String s, int sClass){
        super(s,sClass);
        this.subject1=a;this.subject2=b;this.subject3=c;
        System.out.println(super.name+" obtained  "+this.subject1+" marks in subject1, "+super.name+" obtained  "+this.subject2+" marks in subject2, "+super.name+" obtained  "+this.subject3+" marks in subject3 ");
    }
    
    public void calculateResult(){
        super.result = ((this.subject1+this.subject2+this.subject3)*100)/300;
        super.publish();
    }
    
    public static void main(String []args){
        
    }
    }
