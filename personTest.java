/*
person test
tests the person class and its methods
*/

public class personTest{
   public static void main(String[] args){
      Person p1 = new Person("John Smith", "333 test lane", "8638586997", "jsmith@gmail.com");
      System.out.println(p1.toString());
      
      Student s1 = new Student("Peter Griffin", "285 somewhere dr", "5555555555", "pgriffin@yahoo.com", "Senior");
      System.out.println(s1.toString());
   }//end main
}// end class

class Person{
   private String name;
   private String address;
   private String phone;
   private String email;
   
   public Person(String name, String address, String phone, String email){
      this.name = name;
      this.address = address;
      this.phone = phone;
      this.email = email;
      
      
   }//constructor
   public String getName(){
      return this.name;
   }
   
   public String toString(){
         return this.name + " - Class Person";
      }
}//end person

class Student extends Person{
   private String status;
   
   public Student(String name, String address, String phone, String email, String status){
      super(name, address, phone, email);
      this.status = status;
   
   }//constructor
   
   public String toString(){
      return this.getName() + " - Class Student";
   }
}//end student

class Employee extends Person{
   private String office;
   private String salary;
   
   public Employee(String name, String address, String phone, String email, String office, String salary){
      super(name, address, phone, email);
      this.office = office;
      this.salary = salary;
   }//constructor
   
   public String toString(){
      return this.getName() + " - Class Employee";
   }
}//end employee

class Faculty extends Employee{
   private String officeHours;
   private String rank;
   
   public Faculty(String name, String address, String phone, String email, String office, String salary, String hours, String rank){
      super(name, address, phone, email, office, salary);
      this.officeHours = hours;
      this.rank = rank;
   }//constructor
   
   public String toString(){
      return this.getName() + " - Class Faculty";
   }
}//end faculty

class Staff extends Employee{
   private String title;
   
   public Staff(String name, String address, String phone, String email, String office, String salary, String title){
      super(name, address, phone, email, office, salary);
      this.title = title;
   }//constructor
   
   public String toString(){
      return this.getName() + " - Class Staff";
   }
}//end staff
