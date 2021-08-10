class Student{  
    int rollno;  
    String name;  
    float marks;
    void show(int r, String n,float m){  
     rollno=r;  
     name=n;
     marks = m;  
    }  
    void displayInformation(){System.out.println(rollno+" "+name+" "+marks);}  
   }  
   class TestStudent{  
    public static void main(String args[]){  
     Student s1=new Student();   
     s1.show(111,"Karan",90);   
     s1.displayInformation();   
    }  
   }  