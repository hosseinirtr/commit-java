package com.h2.entity;

//import javax.persistence.Entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "CLIENT")
@Getter
@Setter
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "CLIENT_ID")
    int USERID;
    @Column(name = "CLIENT_NAME")
    String USERNAME;
    @Column(name = "CLIENT_PASSWORD")
    String PASSWORD;
    @Column(name = "CLIENT_EMAIL")
    String EMAIL;
    @Column(name = "CLIENT_DATE_JOINED")
    LocalDateTime DATEJOINED = LocalDateTime.now();


}
