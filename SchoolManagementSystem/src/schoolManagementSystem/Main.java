package schoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
         Teacher omer = new Teacher (1,"omer",500);
         Teacher ali = new Teacher (2,"ali",700);
         Teacher taim = new Teacher (3,"taim",500);
         
         List<Teacher>teacherList = new ArrayList<>();
         teacherList.add(omer);
         teacherList.add(taim);
         teacherList.add(ali);
         
         
         Student Ahmed = new Student (1,"Ahmed",4);
         Student Alaa = new Student (2,"Alaa",12);
         Student Jen = new Student (3,"Jen",3);

         List<Student>studentList = new ArrayList<>();
         studentList.add(Jen);
         studentList.add(Ahmed);
         studentList.add(Alaa);
         
         
         School ghs = new School(teacherList,studentList);
         
         Ahmed.payFees(5000);
         Alaa.payFees(6000);
         System.out.println("GHS Has Earned $ :"  + ghs.getTotalMoneyEarned());
         omer.receiveSalary(omer.getSalary());
         System.out.println("GHS Has Spent for salary to  $ :"  + omer.getName()+
        		 " and now has $ :" +ghs.getTotalMoneyEarned());

         System.out.println(Ahmed );
         System.out.println(omer );


		
		
		
		
		
	}

}
