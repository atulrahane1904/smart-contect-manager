package com.personal.scm.controller.dto;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Contact {
@Id
private String id;
private String name;
private String email;
private String phoneNumber;
private String address;
private String pictures;
@Column(length=1000)
private String description;
private boolean fevorite;
private String webLink;
private String linkedInlink;
@ManyToOne
private User user;
@OneToMany(mappedBy="contact",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
private List<SocialLinks> link=new ArrayList<>();
}
