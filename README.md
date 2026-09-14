# Common Events

## Overview

The `common-events` module is the shared event contract library for the online-voting microservice platform. It contains the Java DTO/event classes that are serialized over Kafka and exchanged between services without requiring each service to duplicate the same message shape.

This module is intentionally lightweight: it is not a runnable Spring Boot application, but it is a regular Java library packaged as a JAR and consumed by the auth, voter, candidate, election, voting, and result services.

## Current Runtime

- Java: 25
- Packaging: JAR
- Dependency type: shared library
- Serialization: Jackson via `jackson-annotations`

## Purpose in the Architecture

The shared event model enables event-driven communication between the platform’s microservices:

- `auth-service` publishes user lifecycle events
- `voter-service` consumes user creation/update events and creates or updates voter records
- `candidate-service` consumes candidate creation/update events from the auth layer
- `election-service` publishes election closure events
- `voting-service` emits vote-cast events
- `result-service` consumes election and voting events to aggregate outcomes

Because these events are defined centrally, every service uses the same contract for serialization/deserialization and correlation across Kafka topics.

## Module Structure

```text
common-events/
├── src/
│   └── main/
│       └── java/com/online/voting/events/
│           ├── UserCreatedEvent.java
│           ├── UserUpdatedEvent.java
│           ├── UserDeletedEvent.java
│           ├── VoterCreationSucceededEvent.java
│           ├── VoterCreationFailedEvent.java
│           ├── VoterUpdateSucceededEvent.java
│           ├── VoterUpdateFailedEvent.java
│           ├── election/
│           │   └── ElectionClosedEvent.java
│           ├── candidate/
│           │   ├── CandidateCreationEvent.java
│           │   ├── CandidateCreationSucceededEvent.java
│           │   ├── CandidateCreationFailedEvent.java
│           │   ├── CandidateUpdateEvent.java
│           │   ├── CandidateUpdateSucceededEvent.java
│           │   └── CandidateUpdateFailedEvent.java
│           └── voting/
│               └── VoteEvent.java
├── pom.xml
├── mvnw
├── mvnw.cmd
├── README.md
└── target/
```

## Key Event Contracts

### User lifecycle events

- `UserCreatedEvent`
  - fields: `eventId`, `correlationId`, `userId`, `nationalId`, `username`, `firstName`, `lastName`, `role`
- `UserUpdatedEvent`
  - fields: `userId`, `username`, `nationalId`, `firstName`, `lastName`, `email`, `role`
- `UserDeletedEvent`
  - fields: `userId`, `username`, `nationalId`, `deletedAt` or equivalent state payloads depending on implementation

### Voter events

- `VoterCreationSucceededEvent`
- `VoterCreationFailedEvent`
- `VoterUpdateSucceededEvent`
- `VoterUpdateFailedEvent`

These events are emitted when the auth layer creates or updates a user profile that must be synchronized to the voter domain.

### Candidate events

- `CandidateCreationEvent`
  - fields: `userId`, `nationalId`, `username`, `firstName`, `lastName`, `party`, `manifesto`, `role`
- `CandidateCreationSucceededEvent`
- `CandidateCreationFailedEvent`
- `CandidateUpdateEvent`
- `CandidateUpdateSucceededEvent`
- `CandidateUpdateFailedEvent`

These payloads carry candidate registration and update state between the auth service and candidate service.

### Election and voting events

- `ElectionClosedEvent`
  - fields: `electionId`, `closedAt`
- `VoteEvent`
  - fields: `voteId`, `electionId`, `positionId`, `candidateId`, `voterId`, `votedAt`

These are consumed by the result service to finalize election calculations and aggregate live results.

## Example Maven Dependency

Other services in the platform consume this library in their `pom.xml` files. Example:

```xml
<dependency>
    <groupId>com.online.voting</groupId>
    <artifactId>common-events</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Build and Install Locally

From the module root:

```powershell
cd d:\spring boot\online-voting-system\common-events
$env:JAVA_HOME='C:\Program Files\Java\jdk-25.0.4.1'
$env:Path = "$env:JAVA_HOME\bin;" + $env:Path
.\mvnw clean install
```

This installs the JAR into the local Maven repository so the dependent services can resolve it without a private registry or remote artifact repository.

## Notes

- This module is not a web service and does not expose an HTTP port.
- It is a contract package used for Kafka message payload compatibility.
- Any new event or payload change should be mirrored in the producers and consumers using it, especially across the event-driven boundaries between services.
- Because it is shared, the event classes should be kept backward-compatible or intentionally versioned when the message shapes change.

## Project Context

This module is part of the Online Voting Microservice System and is designed to work alongside the API gateway, auth service, voter service, candidate service, election service, voting service, and result service.
