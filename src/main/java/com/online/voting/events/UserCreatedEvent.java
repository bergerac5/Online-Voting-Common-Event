package com.online.voting.events;

import java.util.UUID;

public class UserCreatedEvent {

    private UUID eventId;
    private UUID correlationId;
    private UUID userId;
    private String nationalId;
    private String username;
    private String firstName;
    private String lastName;
    private String role;

    public UserCreatedEvent() {
    }

    public UserCreatedEvent(UUID eventId, UUID correlationId, UUID userId, String nationalId, String username,
            String firstName, String lastName,
            String role) {
        this.eventId = eventId;
        this.correlationId = correlationId;
        this.userId = userId;
        this.nationalId = nationalId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public UUID getEventId() {
        return this.eventId;
    }

    public void setEventId(UUID eventId) {
        this.eventId = eventId;
    }

    public UUID getCorrelationId() {
        return this.correlationId;
    }

    public void setCorrelationId(UUID correlationId) {
        this.correlationId = correlationId;
    }

    public UUID getUserId() {
        return this.userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getNationalId() {
        return this.nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
