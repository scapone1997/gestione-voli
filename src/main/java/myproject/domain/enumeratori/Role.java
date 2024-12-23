package myproject.domain.enumeratori;

public enum Role {
    PILOT("Pilot"),
    CO_PILOT("Co-Pilot"),
    FLIGHT_ENGINEER("Flight Engineer"),
    FLIGHT_ATTENDANT("Flight Attendant"),
    PURSER("Purser"), // Capo degli assistenti di volo
    AIR_MARSHAL("Air Marshal"),
    GROUND_CREW("Ground Crew"),
    MAINTENANCE_ENGINEER("Maintenance Engineer");

    private final String description;

    Role(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}