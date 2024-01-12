package enums;

public enum Sections {
    GENERAL_TITLE(Color.BLUE.getValue() + "Продукт, у которого будем определять оценку уровня " +
            "конкурентоспособности: \nкомпьютерное кресло Cougar Throne." + Color.RESET.getValue() + "\n"),
    SECTION1(Color.GREEN.getValue() + "Выберите маркетинговую задачу:" + Color.RESET.getValue()),
    SECTION2(Color.GREEN.getValue() + "Выберите эксплуатационные параметры (тип кресла):" + Color.RESET.getValue()),
    SECTION3(Color.GREEN.getValue() + "Выберите технические параметры (тип подлокотников):" + Color.RESET.getValue()),
    SECTION4(Color.GREEN.getValue() + "Введите угол наклона спинки:" + Color.RESET.getValue()),
    SECTION5("Выберите эргономические параметры:"),
    SECTION6("Введите экономические параметры"),
    SECTION7("Введите надёжностные параметры");

    private final String description;

    Sections(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
