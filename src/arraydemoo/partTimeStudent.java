/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemoo;

/**
 *
 * @author user
 */
public class partTimeStudent extends Student {
    private int NumberOfCourses;

    public partTimeStudent(int NumberOfCourses, int sID, String sName) {
        super(sID, sName);
        this.NumberOfCourses = NumberOfCourses;
    }

    public int getNumberOfCourses() {
        return NumberOfCourses;
    }

    public void setNumberOfCourses(int NumberOfCourses) {
        this.NumberOfCourses = NumberOfCourses;
    }

    
    
    
}
