import enums.MarketingTask;
import enums.Sections;

public class Messages {
    void printGeneralTitleMessage() {
        System.out.println(Sections.GENERAL_TITLE.getSection());
    }
    void printMarketingTaskMessage() {
        System.out.println(Sections.SECTION1.getSection());
        System.out.println("1. " + MarketingTask.BEST_PRODUCT.getDescription());
        System.out.println("2. " + MarketingTask.THE_MOST_ERGONOMIC_PRODUCT.getDescription());
        System.out.println("Ваш выбор: ");
    }
}