package enums;

public enum OperatingParameters {
    OFFICE("Офисное"),
    GAME("Игровое");
    private final String description;

    OperatingParameters(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

    public static int getLength() {
        return OperatingParameters.values().length;
    }
}
