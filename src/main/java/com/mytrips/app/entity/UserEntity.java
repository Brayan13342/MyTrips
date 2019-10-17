package com.mytrips.app.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "tbl_user")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    public Integer id;
    @JsonProperty("name")
    public String name;
    @JsonProperty("lastName")
    public String lastName;
    @JsonProperty("email")
    public String email;
    @JsonProperty(value = "password", access = JsonProperty.Access.WRITE_ONLY)
    public String password;

}
