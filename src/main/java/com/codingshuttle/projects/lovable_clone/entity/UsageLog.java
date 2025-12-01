package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

/**
 * Represents a record of user activity or usage within a project.
 * Useful for tracking AI usage, performance metrics, and auditing.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UsageLog {
    Long id;
    // Primary key of the usage log record

    Project project;
    // Project where the action was performed

    User user;
    // User who performed the action

    String action;
    // Description of the action performed (e.g., "GENERATE_TEXT", "RUN_PREVIEW")

    Integer tokensUsed;
    // Number of AI tokens consumed for this action (if applicable)

    Integer durationMs;
    // Duration in milliseconds taken to perform the action (for performance monitoring)

    String metaData;
    // Additional JSON metadata (example: {"model_used": "gpt-4", "prompt_used": "summarize text"})

    Instant createdAt;
    // Timestamp when this usage log was created
}

