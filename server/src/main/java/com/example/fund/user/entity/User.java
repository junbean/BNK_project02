package com.example.fund.user.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="tbl_user")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    private String username;

    private String password;

    private String name;

    private String phone;
}
