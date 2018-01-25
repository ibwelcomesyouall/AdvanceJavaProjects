package org.indranil.hibernate.dto;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User_Details {
    @Id
    private int User_Id;
    private String User_Name;

    public int getUser_Id() {
        return User_Id;
    }

    public void setUser_Id(int User_Id) {
        this.User_Id = User_Id;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

}
