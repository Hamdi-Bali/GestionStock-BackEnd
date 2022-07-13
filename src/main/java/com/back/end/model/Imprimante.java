package com.back.end.model;
import javax.persistence.*;

@Entity
@Table
public class Imprimante {
   @Id
   @SequenceGenerator(
           name = "imprimante_sequence",
           sequenceName = "imprimante_sequence",
           allocationSize = 1
   )
   @GeneratedValue(
           strategy = GenerationType.SEQUENCE,
           generator = "imprimante_sequence"
   )
   private int num ;
   private String num_serie ;
   private String modele ;
   private String site ;
   private String type_toner ;
   private String etat ;
   private  String description ;

   public String getNum_serie() {
      return num_serie;
   }

   public void setNum_serie(String num_serie) {
      this.num_serie = num_serie;
   }

   public Imprimante(int num, String num_serie, String modele, String site, String type_toner, String etat, String description) {
      this.num = num;
      this.num_serie = num_serie;
      this.modele = modele;
      this.site = site;
      this.type_toner = type_toner;
      this.etat = etat;
      this.description = description;
   }

   public Imprimante() {

   }

   @Override
   public String toString() {
      return "Imprimante{" +
              "num=" + num +
              ", modele='" + modele + '\'' +
              ", site='" + site + '\'' +
              ", type_toner='" + type_toner + '\'' +
              ", etat='" + etat + '\'' +
              ", description='" + description + '\'' +
              '}';
   }

   public void setNum(int num) {
      this.num = num;
   }

   public void setModele(String modele) {
      this.modele = modele;
   }

   public void setSite(String site) {
      this.site = site;
   }

   public void setType_toner(String type_toner) {
      this.type_toner = type_toner;
   }

   public void setEtat(String etat) {
      this.etat = etat;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public int getNum() {
      return num;
   }

   public String getModele() {
      return modele;
   }

   public String getSite() {
      return site;
   }

   public String getType_toner() {
      return type_toner;
   }

   public String getEtat() {
      return etat;
   }

   public String getDescription() {
      return description;
   }
}
