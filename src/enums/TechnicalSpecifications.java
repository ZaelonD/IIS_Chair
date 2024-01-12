package enums;

public enum TechnicalSpecifications {
    TYPE_3D("3D"),
    TYPE_4D("4D"),
    TYPE_NULL("Пусто");
    private final String description;

    TechnicalSpecifications(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
