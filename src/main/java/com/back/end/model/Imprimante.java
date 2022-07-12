package com.back.end.model;

import javax.persistence.*;
import java.util.Date;

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
   private String modele ;
   private String site ;
   private String type_toner ;
   private String etat ; 






}
