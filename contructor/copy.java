import java.util.*;
public class copy {

    public static int pow(int x,int n){
        if(n==1){
            return x;
        }
        int xnm1=pow(x,n-1);
        int xp=x*xnm1;
        return xp;
    }
    public static void main(String[] args) {
        System.out.println(pow(2, 3));
        // Student s1=new Student();
        // s1.name="Anushka";
        // System.out.print(s1.name);
        // s1.roll=456;
        // s1.password="abcd";
        // s1.marks[0]=100;
        // s1.marks[1]=86;
        // s1.marks[2]=99;

        // Student s2=new Student(s1);
        // s2.password="heheahah";
        // s1.marks[2]=12;
        // for(int i=0;i<3;i++){
        //     System.out.println(s2.marks[i]);
        }
    }


class Student{
    String name;
    int roll;
    String password;
    int marks[];
    Student(){
        marks=new int[3];
        System.out.println("constructor is called");
    }
    //shallow copy constructor
    // Student(Student s1){
    //     marks= new int[3];
    //     this.name=s1.name;
    //     this.roll=s1.roll;
    //     this.marks=s1.marks;
    // }

    //deep
    Student (Student s1){
        marks=new int[3];
        this.name=name;
        this.roll=roll;
        for(int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        }
    }
}
