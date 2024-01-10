package enums;

public enum Color {
    RED("\u001B[31m"),
    BLACK("\u001B[30m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    PURPLE("\u001B[35m"),
    WHITE("\u001B[37m"),
    RESET("\u001B[0m");
    private final String value;

    Color(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
}
