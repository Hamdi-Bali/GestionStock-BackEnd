package com.back.end.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
@Table
public class Machine {
@Id
@SequenceGenerator(
        name = "Machine_sequence",
        sequenceName = "Machine_sequence",
        allocationSize = 1
)
@GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "Machine_sequence"
)
private int id ;
private String num ;
private  String nom ;
private String utilisateur ;
private  String site ;
private String date_achat ;

    public Machine(String num, String nom, String utilisateur, String site, String date_achat) {
        this.num = num;
        this.nom = nom;
        this.utilisateur = utilisateur;
        this.site = site;
        this.date_achat = date_achat;
    }

    public Machine() {

    }

    @Override
    public String toString() {
        return "Machine{" +
                "num='" + num + '\'' +
                ", nom='" + nom + '\'' +
                ", utilisateur='" + utilisateur + '\'' +
                ", site='" + site + '\'' +
                ", date_achat='" + date_achat + '\'' +
                '}';
    }

    public void setNum(String num) {
        this.num = num;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setUtilisateur(String utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public void setDate_achat(String date_achat) {
        this.date_achat = date_achat;
    }

    public String getNum() {
        return num;
    }

    public String getNom() {
        return nom;
    }

    public String getUtilisateur() {
        return utilisateur;
    }

    public String getSite() {
        return site;
    }

    public String getDate_achat() {
        return date_achat;
    }
}
