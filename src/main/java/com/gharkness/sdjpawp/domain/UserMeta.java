package com.gharkness.sdjpawp.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "wp_usermeta")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserMeta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "umeta_id")
    private Long id;

//    @Size(max = 20)
//    private Long userId;

    @ManyToOne
    private User user;

    @Size(max = 255)
    @Column(columnDefinition = "longtext")
    private String metaKey;

    @Lob
    private String metaValue;
}
