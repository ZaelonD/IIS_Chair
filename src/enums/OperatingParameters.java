package enums;

public enum OperatingParameters {
    OFFICE("Офисное"),
    GAME("Игровое"),
    NULL_PARAMETER("Пусто");

    private final String description;

    OperatingParameters(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }

}
