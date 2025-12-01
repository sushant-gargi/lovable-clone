package com.codingshuttle.projects.lovable_clone.entity;

import com.codingshuttle.projects.lovable_clone.enums.SubscriptionStatus;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

/**
 * Represents a subscription of a user to a particular plan.
 * Contains Stripe integration fields and billing period information.
 */
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Subscription // Each User can have a subscription (Weekly, Monthly, Yearly)
{
    Long id;
    // Unique identifier of the subscription (primary key in DB)

    User user;
    // The user who owns this subscription

    Plan plan;
    // The plan selected by the user (Free, Pro, Ultimate, etc.)

    String stripeCustomerId;
    // Stripe-generated customer ID (represents the user in Stripe)

    String stripeSubscriptionId;
    // Stripe-generated subscription ID (represents the active subscription in Stripe)

    SubscriptionStatus status;
    // Current subscription status (ACTIVE, TRIALING, CANCELED, PAST_DUE, INCOMPLETE, etc.)

    Instant currentPeriodStart;
    // Start time of the current billing period (from Stripe, always UTC)

    Instant currentPeriodEnd;
    // End time of the current billing period (from Stripe)
    // After this time, Stripe will renew or cancel depending on the configuration

    Boolean cancelAtPeriodEnd = false;
    // If true, subscription will run until the current billing period ends, then expire
    // (user clicked "cancel", but subscription active until period end)

    Instant createdAt;
    // Timestamp when this subscription record was created (UTC)

    Instant updatedAt;
    // Timestamp when this subscription record was last updated (UTC)
}