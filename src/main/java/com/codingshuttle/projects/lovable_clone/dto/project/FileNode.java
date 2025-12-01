package com.codingshuttle.projects.lovable_clone.dto.project;

import java.time.Instant;

public record FileNode(String path, Instant modiefiedAt, Long size, String type) {
}
