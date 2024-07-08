package br.com.clink.apitreino.dataVoV1;

import java.io.Serial;
import java.io.Serializable;

public class PersonVO implements Serializable {
 @Serial
 private static final long serialVersionUID = 1L;


 private long id;
 
 
 private String firstName;


 private String lastName;


 private String address;


 private String gender;

 
 public PersonVO() {}

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