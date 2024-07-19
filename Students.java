//package Student;

class student2 {
    int id;
    String name;
}
//package Student;

class student1 {
    int id;
    String name;
}

//package Student;

public class Students {
    public static void main(String args[]){
      student1 s1=new student1();
      student2 s2=new student2();
      s1.id=1;
      s1.name="mathi";
      s2.id=2;
      s2.name="Akshatha";
      System.out.println(s1.id);
      System.out.println(s1.name);
      System.out.println(s2.id);
      System.out.print(s2.name);
    }
}
