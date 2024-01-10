package enums;

public enum Sections {
    GENERAL_TITLE(Color.BLUE.getValue() + "Продукт, у которого будем определять оценку уровня " +
            "конкурентоспособности: \nкомпьютерное кресло Cougar Throne." + Color.RESET.getValue() + "\n"),
    SECTION1(Color.GREEN.getValue() + "Выберите маркетинговую задачу:" + Color.RESET.getValue()),
    SECTION2("Выберите эксплуатационные параметры (тип кресла):"),
    SECTION3("Выберите технические параметры (тип подлокотников):"),
    SECTION4("Выберите эргономические параметры:"),
    SECTION5("Введите экономические параметры"),
    SECTION6("Введите надёжностные параметры");

    private final String section;

    Sections(String section) {
        this.section = section;
    }

    public String getSection() {
        return section;
    }
}
