/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraydemoo;

/**
 * This is to show modification
 * @author user
 * This is to show revert commit
 */
public class Student {
    private int sID;
    private String sName;

    public Student(int sID, String sName) {
        this.sID = sID;
        this.sName = sName;
    }

    public int getsID() {
        return sID;
    }

    public String getsName() {
        return sName;
    }

    public void setsID(int sID) {
        this.sID = sID;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }   
}
