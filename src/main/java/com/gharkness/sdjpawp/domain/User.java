package com.gharkness.sdjpawp.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;

import java.sql.Timestamp;

@Entity
@Table(name = "wp_users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 60)
    @Column(name = "user_login")
    private String login;

    @NotNull
    @Size(max = 255)
    @Column(name = "user_pass")
    private String password;

    @NotNull
    @Size(max = 50)
    @Column(name = "user_nicename")
    private String nicename;

    @Email
    @NotNull
    @Size(max = 100)
    @Column(name = "user_email")
    private String email;

    @URL
    @NotNull
    @Size(max = 100)
    @Column(name = "user_url")
    private String url;

    @NotNull
    @Column(name = "user_registered")
    private Timestamp registered;

    @NotNull
    @Size(max = 255)
    @Column(name = "user_activation_key")
    private String activationKey;

    @NotNull
    @Column(name = "user_status")
    private Integer status;

    @NotNull
    @Size(max = 250)
    @Basic(optional = false)
    private String displayName;
}
