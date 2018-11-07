package com.vinod.graphql.springgraphql.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Person {
    @Id
    private int id;
    private String name;
    private String email;
    private String phoneNo;
    private String[] address;
}
