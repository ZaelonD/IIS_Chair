import enums.MarketingTask;
import enums.OperatingParameters;
import enums.Sections;

public class Messages {
    void printGeneralTitleMessage() {
        System.out.println(Sections.GENERAL_TITLE.getDescription());
    }
    void printMarketingTaskMessage() {
        System.out.println(Sections.SECTION1.getDescription());
        System.out.println("1. " + MarketingTask.BEST_PRODUCT.getDescription());
        System.out.println("2. " + MarketingTask.THE_MOST_ERGONOMIC_PRODUCT.getDescription());
        System.out.println("Ваш выбор: ");
    }

    void printOperatingParametersMessage() {
        System.out.println(Sections.SECTION2.getDescription());
        System.out.println("1. " + OperatingParameters.OFFICE.getDescription());
        System.out.println("2. " + OperatingParameters.GAME.getDescription());
        System.out.println("Ваш выбор: ");
    }
}
