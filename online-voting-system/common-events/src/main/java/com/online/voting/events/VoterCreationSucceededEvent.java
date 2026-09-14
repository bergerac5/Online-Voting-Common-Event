package com.online.voting.events;

import java.util.UUID;

public class VoterCreationSucceededEvent {
    private UUID userId;
    private String nationalId;

    public VoterCreationSucceededEvent() {
    }

    public VoterCreationSucceededEvent(UUID userId, String nationalId) {
        this.userId = userId;
        this.nationalId = nationalId;
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

}
