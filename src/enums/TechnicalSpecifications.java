package enums;

public enum TechnicalSpecifications {
    TYPE_3D("3D"),
    TYPE_4D("4D");

    private final String description;

    TechnicalSpecifications(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static int getLength() {
        return TechnicalSpecifications.values().length;
    }
}
