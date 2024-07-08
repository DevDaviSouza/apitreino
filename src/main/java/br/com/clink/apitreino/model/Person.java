package br.com.clink.apitreino.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_person")
public class Person implements Serializable {
 private static final long serialVersionUID = 1L;

 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 private long id;
 
 @Column(name = "first_name", nullable = false)
 private String firstName;

 @Column(name = "last_name", nullable = false)
 private String lastName;

 @Column
 private String address;

 @Column
 private String gender;

 
 public Person() {}

 // Getter para id
 public long getId() {
    return id;
}

// Setter para id
public void setId(long id) {
    this.id = id;
}

// Getter para firstName
public String getFirstName() {
    return firstName;
}

// Setter para firstName
public void setFirstName(String firstName) {
    this.firstName = firstName;
}

// Getter para lastName
public String getLastName() {
    return lastName;
}

// Setter para lastName
public void setLastName(String lastName) {
    this.lastName = lastName;
}

// Getter para address
public String getAddress() {
    return address;
}

// Setter para address
public void setAddress(String address) {
    this.address = address;
}

// Getter para gender
public String getGender() {
    return gender;
}

// Setter para gender
public void setGender(String gender) {
    this.gender = gender;
}

}