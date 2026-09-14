package com.online.voting.events.candidate;

import java.util.UUID;

public class CandidateUpdateSucceededEvent {
    private UUID userId;
    private String nationalId;

    public CandidateUpdateSucceededEvent() {
    }

    public CandidateUpdateSucceededEvent(UUID userId, String nationalId) {
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
