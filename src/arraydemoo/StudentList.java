/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemoo;

/**
 *
 * @author user
 */
public class StudentList {
    public static void main(String args[]){
        Student[] StudentList = new Student[3];
        
        Student s1 = new Student(1,"Navedita");
        
        StudentList[0] = s1;
        StudentList[1] = new Student(2,"Katoch");
        StudentList[2] = new Student(3,"Rose");
        
        for (int i = 0; i<StudentList.length; i++){
            System.out.println(StudentList[i].getsName());
            
        }   
    }//end of main  
}//end of class

