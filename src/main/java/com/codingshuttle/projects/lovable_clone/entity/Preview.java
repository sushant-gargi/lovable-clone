package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.enums.PreviewStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

/**
 * Represents a deployment preview/environment for a project.
 * A preview is typically a temporary environment created
 * for testing or live demonstration of the project.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Preview {
    Long id;
    // Primary key identifying the preview environment

    Project project;
    // The project for which this preview environment is created

    String namespace;
    // Kubernetes namespace where the preview is deployed

    String podName;
    // Name of the Kubernetes pod running the preview

    PreviewStatus status;
    // Current status of the preview (RUNNING, FAILED, TERMINATED, etc.)

    String previewUrl;
    // Public URL where the preview environment can be accessed

    Instant startedAt;
    // Timestamp when the preview environment started running

    Instant terminatedAt;
    // Timestamp when the preview was stopped or terminated
    // (null means the preview is still active)

    Instant createdAt;
    // Timestamp when this preview record was created in the system
}
