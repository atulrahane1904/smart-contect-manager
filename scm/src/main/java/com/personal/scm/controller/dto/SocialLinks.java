package com.personal.scm.controller.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;
@Entity
@Data
public class SocialLinks {
@Id
 private  String id;
 private String link;
private String title;
@ManyToOne
private Contact contact;

}
