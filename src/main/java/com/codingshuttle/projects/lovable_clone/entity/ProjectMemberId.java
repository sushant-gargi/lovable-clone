package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * Composite key class used to uniquely identify
 * a member inside a project.
 * <p>
 * This represents a combination of:
 * - projectId (the project)
 * - userId (the user who is a member)
 * <p>
 * Together they form a unique key for ProjectMember.
 */

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProjectMemberId {
    Long projectId;
    // ID of the project to which the member belongs

    Long userId;
    // ID of the user who is part of that project
}
