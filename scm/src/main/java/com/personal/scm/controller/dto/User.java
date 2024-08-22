package com.personal.scm.controller.dto;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User {
@Id
private String userId;
@Column(name="user_name",nullable=false)
private String name;
@Column(unique=true,nullable=false)
private String email;
private String password;
@Column(length=1000)
private String about;
@Column(length=1000)
private String profilePic;
private String phoneNumber;
private boolean enabled=false;
private boolean emailVerified = false;
private boolean phoneVerified = false;
// self,Google,Facebook,Github,favebook
private Providers provider=Providers.SELF;
private String providersUserId;

// @OneToMany(mappedBy = "user",cascade = CascadeType.ALL , fetch = FetchType.LAZY,orphanRemoval=true )
@OneToMany (mappedBy="user",cascade= CascadeType.ALL,fetch=FetchType.LAZY,orphanRemoval=true)
private List<Contact> contacts =new ArrayList<>();

}
