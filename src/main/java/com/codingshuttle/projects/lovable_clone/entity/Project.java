package com.codingshuttle.projects.lovable_clone.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

/**
 * Represents a project within the Lovable application.
 * Each project is owned by a user and can contain multiple files, previews, and chat sessions.
 * Supports soft deletion to preserve historical data.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    // Unique identifier of the project (primary key in DB)
    @Column(nullable = false)
    String name;
    // Name of the project (given by the user)
    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    User owner;
    // The user who created and owns the project

    Boolean isPublic = false;
    // Visibility of the project:
    // false = private (only owner can view)
    // true  = public  (anyone can view the project)
    @CreationTimestamp
    Instant createdAt;
    // Timestamp when the project was created
    @UpdateTimestamp
    Instant updatedAt;
    // Timestamp when the project details were last updated

    Instant deletedAt;
    // Soft delete timestamp:
    // null  = active
    // not null = project considered deleted (not shown to user, but record kept)
}
