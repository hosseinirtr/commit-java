package com.h2.entity;

//import javax.persistence.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
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
    int userId;
    @Column(name = "CLIENT_USERNAME", unique = true)
    @NotNull(message = "Username is required")
    String userName;
    @Column(name = "CLIENT_PASSWORD")
    String password;
    @Column(name = "CLIENT_EMAIL")
    String email;
    @Column(name = "CLIENT_DATE_JOINED")
    LocalDateTime dateJoined = LocalDateTime.now();
}
