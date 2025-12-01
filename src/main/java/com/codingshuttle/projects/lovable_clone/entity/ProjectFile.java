package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

/**
 * Represents a file within a project.
 * Stores metadata, storage key, and audit information.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectFile {
    Long id;
    // Unique identifier of this file record (primary key in DB)

    Project project;
    // Reference to the project this file belongs to

    String path;
    // Logical or display path within the project (e.g., "src/main/App.jsx" or "images/logo.png")

    String minioObjectKey;
    // Actual object key used to store/retrieve the file from MinIO/S3
    // Example: "projects/{projectId}/files/{randomUUID}.png"

    User createdBy;
    // User who originally created/uploaded this file

    User updatedBy;
    // User who last modified this file

    Instant createdAt;
    // Timestamp when the file entry was created (UTC)

    Instant updatedAt;
    // Timestamp when the file was last modified (UTC)

}