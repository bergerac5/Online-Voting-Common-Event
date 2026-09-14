package com.online.voting.events.election;

import java.time.LocalDateTime;
import java.util.UUID;

public class ElectionClosedEvent {

    private UUID electionId;
    private LocalDateTime closedAt;

    public ElectionClosedEvent() {
    }

    public ElectionClosedEvent(UUID electionId, LocalDateTime closedAt) {
        this.electionId = electionId;
        this.closedAt = closedAt;
    }

    public UUID getElectionId() {
        return electionId;
    }

    public void setElectionId(UUID electionId) {
        this.electionId = electionId;
    }

    public LocalDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(LocalDateTime closedAt) {
        this.closedAt = closedAt;
    }
}
