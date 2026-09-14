package com.online.voting.events;

import java.util.UUID;

public class UserDeletedEvent {

    private UUID userId;

    public UserDeletedEvent() {
    }

    public UserDeletedEvent(UUID userId) {
        this.userId = userId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }
}
