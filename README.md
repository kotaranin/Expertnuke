# ExpertNuke - Backend

Expert system for nuclear reactor accident prevention, built with Spring Boot and Drools.

## About

ExpertNuke monitors critical reactor parameters (power, pressure, coolant temperature, water level, control rod position, radiation and hydrogen concentration) and recommends operator actions based on a rule-based knowledge base derived from real-world nuclear incidents.

The system does not replace a trained operator - it acts as a decision support tool, surfacing recommendations the operator might overlook under stress, along with an explanation of why each action is needed.

## Tech Stack

- Java
- Spring Boot
- Drools
- Maven

## How to Run

1. Make sure you have **Java 17** and **Maven** available.
2. Import the project into Eclipse: `File → Import → Maven → Existing Maven Projects`.
3. Run `ExpertnukeApplication.java` as a Spring Boot App (or plain Java Application).
4. The server starts on `http://localhost:8081`.

## API

**POST** `/api/analysis`

Accepts a JSON body representing the current reactor state (see `Reactor.java` for all fields) and returns a list of recommendations:

```json
[
  {
    "code": "R1",
    "explanation": "Rad iznad nominalne snage povećava opterećenje gorivnih elemenata i rashladnog kola."
  }
]
```

If the same recommendation code is triggered by multiple rules, the explanations are merged into a single entry.