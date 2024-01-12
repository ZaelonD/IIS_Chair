package enums;

public enum MarketingTask {
    BEST_PRODUCT("Определить наилучший продукт в своей ценовой категории"),
    THE_MOST_ERGONOMIC_PRODUCT("Определить наиболее эргономичный продукт");
    private final String description;

    MarketingTask(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static int getLength() {
        return MarketingTask.values().length;
    }
}
