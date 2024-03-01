package com.h2.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Table(name = "POST")
@Getter
@Setter
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "POST_ID")
    int postId;
    int authorId;
    @Transient
    transient Client author;
    @Column(name = "POST_CONTENT")
    String content;
    @Column(name = "POST_DATE_CREATE")
    private LocalDateTime create = LocalDateTime.now();

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

}
