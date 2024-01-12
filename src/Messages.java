import enums.*;

public class Messages {
    void printGeneralTitleMessage() {
        System.out.println(Sections.GENERAL_TITLE.getDescription());
    }

    void printMarketingTaskMessage() {
        System.out.println(Sections.SECTION1.getDescription());
        for (int i = 1; i <= MarketingTask.getLength(); i++)
            System.out.println(i + ". " + MarketingTask.values()[i - 1].getDescription());
        System.out.println("Ваш выбор: ");
    }

    void printOperatingParametersMessage() {
        System.out.println(Sections.SECTION2.getDescription());
        for (int i = 1; i <= OperatingParameters.getLength(); i++)
            System.out.println(i + ". " + OperatingParameters.values()[i - 1].getDescription());
        System.out.println("Ваш выбор: ");
    }

    void printTechnicalSpecificationsMessage() {
        System.out.println(Sections.SECTION3.getDescription());
        for (int i = 1; i <= TechnicalSpecifications.getLength(); i++)
            System.out.println(i + ". " + TechnicalSpecifications.values()[i - 1].getDescription());
        System.out.println("Ваш выбор: ");
    }

    void printBackAngle() {
        System.out.println(Sections.SECTION4.getDescription());
        for (int i = 1; i <= BackAngle.getLength(); i++)
            System.out.println(i + ". " + BackAngle.values()[i - 1].getValue() + '°');
        System.out.println("Ваш выбор: ");
    }
}