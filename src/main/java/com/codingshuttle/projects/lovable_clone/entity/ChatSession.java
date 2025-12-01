package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

/**
 * Represents a chat session within a project.
 * Each session is linked to a project and a user.
 * Supports soft delete to preserve history.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatSession {
    Project project;
    // The project associated with this chat session

    User user;
    // The user who initiated or owns this chat session

    String title;
    // Optional title for the session to identify it in the UI

    Instant createdAt;
    // Timestamp when the session was created

    Instant updatedAt;
    // Timestamp when the session was last updated

    Instant deletedAt;
    // Soft delete timestamp
    // If not null → session is considered deleted but remains in DB for history

}
