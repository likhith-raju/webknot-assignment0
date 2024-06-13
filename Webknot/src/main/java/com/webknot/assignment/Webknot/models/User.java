package com.webknot.assignment.Webknot.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User extends com.webknot.assignment.Webknot.entity.User {

    private String userId;
    private String name;
    private String email;

}
