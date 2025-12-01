package com.codingshuttle.projects.lovable_clone.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

/**
 * Represents a subscription plan available in the Lovable application.
 * Defines limits and features associated with each plan.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Plan // Different types of Plan user can opt for, and Plan which are available
{
    Long id;
    // Primary key: unique identifier for the plan

    String name;
    // Name of the plan (e.g., Free, Pro, Ultimate)

    String stripePriceId;
    // Price ID from Stripe corresponding to this plan
    // Used to process payments and determine pricing tier

    Integer maxProjects;
    // Maximum number of projects allowed under this plan
    // Example: Pro plan allows 3 projects

    Integer maxTokensPerDay;
    // Maximum number of tokens a user can use per day
    // Relevant for AI interaction limits

    Integer maxPreviews;
    // Maximum number of project previews allowed per day

    Boolean unlimitedAi;
    // If true, user has unlimited AI access
    // Overrides maxTokensPerDay

    Boolean active;
    // Whether this plan is currently available for subscription
    // false → plan is inactive/disabled
}
