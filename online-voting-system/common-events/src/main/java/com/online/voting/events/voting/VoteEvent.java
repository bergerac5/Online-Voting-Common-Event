package com.online.voting.events.voting;

import java.time.LocalDateTime;
import java.util.UUID;

public class VoteEvent {

    private UUID voteId;
    private UUID electionId;
    private UUID positionId;
    private UUID candidateId;
    private UUID voterId;
    private LocalDateTime votedAt;

    public VoteEvent() {
    }

    public VoteEvent(UUID voteId, UUID electionId, UUID positionId, UUID candidateId, UUID voterId,
            LocalDateTime votedAt) {
        this.voteId = voteId;
        this.electionId = electionId;
        this.positionId = positionId;
        this.candidateId = candidateId;
        this.voterId = voterId;
        this.votedAt = votedAt;
    }

    // Getters and Setters

    public UUID getVoteId() {
        return this.voteId;
    }

    public void setVoteId(UUID voteId) {
        this.voteId = voteId;
    }

    public UUID getElectionId() {
        return this.electionId;
    }

    public void setElectionId(UUID electionId) {
        this.electionId = electionId;
    }

    public UUID getPositionId() {
        return this.positionId;
    }

    public void setPositionId(UUID positionId) {
        this.positionId = positionId;
    }

    public UUID getCandidateId() {
        return this.candidateId;
    }

    public void setCandidateId(UUID candidateId) {
        this.candidateId = candidateId;
    }

    public UUID getVoterId() {
        return this.voterId;
    }

    public void setVoterId(UUID voterId) {
        this.voterId = voterId;
    }

    public LocalDateTime getVotedAt() {
        return this.votedAt;
    }

    public void setVotedAt(LocalDateTime votedAt) {
        this.votedAt = votedAt;
    }

}
