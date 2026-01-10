package com.codingshuttle.projects.lovable_clone.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

import static com.codingshuttle.projects.lovable_clone.enums.ProjectPermission.*;
import static com.codingshuttle.projects.lovable_clone.enums.ProjectPermission.DELETE;
import static com.codingshuttle.projects.lovable_clone.enums.ProjectPermission.EDIT;
import static com.codingshuttle.projects.lovable_clone.enums.ProjectPermission.MANAGE_MEMBERS;
import static com.codingshuttle.projects.lovable_clone.enums.ProjectPermission.VIEW;
import static com.codingshuttle.projects.lovable_clone.enums.ProjectPermission.VIEW_MEMBERS;

@RequiredArgsConstructor
@Getter
public enum ProjectRole {

    EDITOR(VIEW, EDIT, DELETE, VIEW_MEMBERS),
    VIEWER(Set.of(VIEW, VIEW_MEMBERS)),
    OWNER(Set.of(VIEW, EDIT, DELETE, MANAGE_MEMBERS, VIEW_MEMBERS));

    ProjectRole(ProjectPermission... permissions) {
        this.permissions = Set.of(permissions);
    }

    private final Set<ProjectPermission> permissions;
}
