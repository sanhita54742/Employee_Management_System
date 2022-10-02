/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Employee {
      private String Name;
      private String EmployeeID;
      private int Age;    
      private String Gender;
      private String Start_date;
      private String Level;
      private String Team_Info;
      private String Position_title;
      private String Cell_phone_number;  
      private String Email_address;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String EmployeeID) {
        this.EmployeeID = EmployeeID;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getStart_date() {
        return Start_date;
    }

    public void setStart_date(String Start_date) {
        this.Start_date = Start_date;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String Level) {
        this.Level = Level;
    }

    public String getTeam_Info() {
        return Team_Info;
    }

    public void setTeam_Info(String Team_Info) {
        this.Team_Info = Team_Info;
    }

    public String getPosition_title() {
        return Position_title;
    }

    public void setPosition_title(String Position_title) {
        this.Position_title = Position_title;
    }

    public String getCell_phone_number() {
        return Cell_phone_number;
    }

    public void setCell_phone_number(String Cell_phone_number) {
        this.Cell_phone_number = Cell_phone_number;
    }

    public String getEmail_address() {
        return Email_address;
    }

    public void setEmail_address(String Email_address) {
        this.Email_address = Email_address;
    }
      
    @Override
    public String toString(){
        return Start_date;
        
    }
}
