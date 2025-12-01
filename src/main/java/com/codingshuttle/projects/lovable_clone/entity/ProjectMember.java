package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.enums.ProjectRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

/**
 * Represents a user's membership inside a project.
 * Stores the relationship between Project and User,
 * along with the role and invitation details.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMember {
    ProjectMemberId id;
    // Composite key (projectId + userId)
    // Ensures the same user cannot be added twice to the same project

    Project project;
    // The project to which the user is added as a member

    User user;
    // The user who is part of the project

    ProjectRole role;
    // Role assigned to the member inside the project
    // e.g., OWNER, EDITOR, VIEWER

    Instant invitedAt;
    // Timestamp when the user was invited to join the project

    Instant acceptedAt;
    // Timestamp when the user accepted the invitation
    // (null means invitation is pending/not accepted yet)

}
