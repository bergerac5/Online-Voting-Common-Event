package com.online.voting.events.candidate;

import java.util.UUID;

public class CandidateUpdateEvent {

    private UUID userId;
    private String nationalId;
    private String username;
    private String firstName;
    private String lastName;
    private String party;
    private String manifesto;

    public CandidateUpdateEvent() {
    }

    public CandidateUpdateEvent(UUID userId, String nationalId, String username, String firstName, String lastName,
            String party, String manifesto) {
        this.userId = userId;
        this.nationalId = nationalId;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.party = party;
        this.manifesto = manifesto;
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

    public String getParty() {
        return this.party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getManifesto() {
        return this.manifesto;
    }

    public void setManifesto(String manifesto) {
        this.manifesto = manifesto;
    }

}
