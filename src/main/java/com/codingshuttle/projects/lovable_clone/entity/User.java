package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    Long id;

    String email;
    String passwordHash;
    String name;

    String avatarUrl;
    String createdAt;
    String updatedAt;
    String deletedAt;
}
