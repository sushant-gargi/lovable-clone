package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

/**
 * Represents a user of the Lovable application.
 * Stores login, profile, and auditing information.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
//Used to make all the fields as Private to achieve encapsulation
public class User // User/Person who is using the Lovable application
{
    Long id;
    // Primary key for the user.
    // Unique identifier used to link with other tables (e.g., Project, ChatSession)

    String email;
    // User's email address.
    // Typically unique and used as login identifier

    String passwordHash;
    // Hashed password for authentication.
    // Never store plain-text passwords.

    String name;
    // Full name or display name of the user

    String avatarUrl;
    // URL of the user's profile picture stored in MinIO or external storage

    Instant createdAt;
    // Timestamp when the user account was created

    Instant updatedAt;
    // Timestamp when the user's profile was last updated

    Instant deletedAt;
    // Soft delete timestamp.
    // If not null → user is considered deleted (inactive) but record remains in DB
}