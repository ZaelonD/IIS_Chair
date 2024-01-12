package enums;

public enum BackAngle {
    ANGLE1(140),
    ANGLE2(160),
    ANGLE3(170),
    NULL_ANGLE(0);

    private final int value;

    BackAngle(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
