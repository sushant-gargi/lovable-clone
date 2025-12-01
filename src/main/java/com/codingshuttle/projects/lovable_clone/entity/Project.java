package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

/**
 * Represents a project within the Lovable application.
 * Each project is owned by a user and can contain multiple files, previews, and chat sessions.
 * Supports soft deletion to preserve historical data.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Project {
    Long id;
    // Unique identifier of the project (primary key in DB)

    String name;
    // Name of the project (given by the user)

    User owner;
    // The user who created and owns the project

    Boolean isPublic = false;
    // Visibility of the project:
    // false = private (only owner can view)
    // true  = public  (anyone can view the project)

    Instant createdAt;
    // Timestamp when the project was created

    Instant updatedAt;
    // Timestamp when the project details were last updated

    Instant deletedAt;
    // Soft delete timestamp:
    // null  = active
    // not null = project considered deleted (not shown to user, but record kept)
}
