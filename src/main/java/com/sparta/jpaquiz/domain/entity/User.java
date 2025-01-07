package com.sparta.jpaquiz.domain.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "`user`")
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor
@Builder(access = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String username;
    private String email;
    private String fullAddress; // address.street + ' ' + address.suite 로 구성
    private String zipcode;
    private String phoneNumber;

    public static User create(
            String name, String username, String email, String fullAddress, String zipcode, String phoneNumber
    ) {
        return User.builder()
                .name(name)
                .username(username)
                .email(email)
                .fullAddress(fullAddress)
                .zipcode(zipcode)
                .phoneNumber(phoneNumber)
                .build();
    }
}
