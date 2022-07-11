package com.back.end.model;
import javax.persistence.*;

@Entity
@Table
public class User {

    @Id
    @SequenceGenerator(
            name = "User_sequence",
            sequenceName = "User_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "User_sequence"
    )

    private int num ;
    private String name ;
    private String mdp ;
    private String type ;

    public User(int num, String name, String mdp, String type) {
        this.num = num;
        this.name = name;
        this.mdp = mdp;
        this.type = type;
    }

    public User(String name, String mdp) {
        this.name = name;
        this.mdp = mdp;
    }

    public User() {

    }

    @Override
    public String toString() {
        return "User{" +
                "num=" + num +
                ", name='" + name + '\'' +
                ", mdp='" + mdp + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public User(String name, String mdp, String type) {
        this.name = name;
        this.mdp = mdp;
        this.type = type;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getMdp() {
        return mdp;
    }

    public String getType() {
        return type;
    }
}
