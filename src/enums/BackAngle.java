package enums;

public enum BackAngle {
    ANGLE1(140),
    ANGLE2(160),
    ANGLE3(170);
    private final int value;
    public final static int MAX_ANGLE = ANGLE3.getValue();
    public final static int MIN_ANGLE = ANGLE1.getValue();

    BackAngle(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static int getLength() {
        return BackAngle.values().length;
    }
}
