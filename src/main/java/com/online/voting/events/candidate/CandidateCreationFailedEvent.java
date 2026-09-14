package com.online.voting.events.candidate;

import java.util.UUID;

public class CandidateCreationFailedEvent {
    private UUID userId;
    private String nationalId;
    private String reason;

    public CandidateCreationFailedEvent() {
    }

    public CandidateCreationFailedEvent(UUID userId, String nationalId, String reason) {
        this.userId = userId;
        this.nationalId = nationalId;
        this.reason = reason;
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

    public String getReason() {
        return this.reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
