package com.online.voting.events;

import java.util.UUID;

public class VoterUpdateSucceededEvent {
    private UUID userId;

    public VoterUpdateSucceededEvent() {
    }

    public VoterUpdateSucceededEvent(UUID userId) {
        this.userId = userId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
