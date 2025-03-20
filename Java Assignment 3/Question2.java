class Student {
String name;
int marks1;
int marks2;
int marks3;

Student(String name, int marks1, int marks2, int marks3){
this.name = name;
this.marks1 = marks1;
this.marks2 = marks2;
this.marks3 = marks3;
}
  int gettotalmarks(){
  return marks1+marks2+marks3;
  }
  int getaverage(){
  return gettotalmarks() / 3;
  }
  void display(){
  System.out.println("Student Name = " + name);
  System.out.println("Student Total Marks = " + gettotalmarks());
  System.out.println("Student Average Marks = " + getaverage());
  }
}
class StudentDemo{
public static void main(String[] args){
 Student s1 = new Student("Rubal", 90, 85, 75);
 s1.display();
 
 System.out.println("--------------");
 Student s2 = new Student("Priya", 80, 65, 78);
 s2.display();
 
}
}
