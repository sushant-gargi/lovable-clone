package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.enums.MessageRole;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

/**
 * Represents a single message inside a chat session.
 * Stores message content, role, token usage, and tool call information.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChatMessage {
    Long id;
    // Unique identifier for the message (Primary Key)

    ChatSession chatSession;
    // The chat session this message belongs to

    String content;
    // Actual message content (text)

    MessageRole role;
    // Role of the sender (e.g., USER, AI, SYSTEM)

    String toolCalls;
    // JSON array of tools invoked while generating this message
    // Example: ["summarizer", "translator"]

    Integer tokenUsed;
    // Number of tokens used to generate this message (for AI usage tracking)

    Instant createdAt;
    // Timestamp when the message was created

}
