package com.online.voting.events;

import java.util.UUID;

public class UserUpdatedEvent {
    private UUID userId;
    private String username;
    private String nationalId;
    private String firstName;
    private String lastName;
    private String role;

    public UserUpdatedEvent() {
    }

    public UserUpdatedEvent(UUID userId, String username, String nationalId, String firstName, String lastName,
            String role) {
        this.userId = userId;
        this.username = username;
        this.nationalId = nationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    public UUID getUserId() {
        return this.userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNationalId() {
        return this.nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
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