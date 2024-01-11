import enums.MarketingTask;
import enums.OperatingParameters;

import java.util.Scanner;

public class IISLogicImpl {
    private final Scanner scanner = new Scanner(System.in);
    private final Messages messages = new Messages();

    void start() {
        MarketingTask marketingTask = chooseAMarketingTask();
        OperatingParameters operatingParameters = chooseOperatingParameter();
    }

    MarketingTask chooseAMarketingTask() {
        MarketingTask choice = MarketingTask.NULL_PRODUCT;
        messages.printGeneralTitleMessage();
        while (choice.equals(MarketingTask.NULL_PRODUCT)) {
            messages.printMarketingTaskMessage();
            int answer = scanner.nextInt();
            if (answer == MarketingTask.values()[0].ordinal() + 1)
                choice = MarketingTask.BEST_PRODUCT;
            else if (answer == MarketingTask.values()[1].ordinal() + 1)
                choice = MarketingTask.THE_MOST_ERGONOMIC_PRODUCT;
            else
                System.err.println("Данного варианта не существует! Попробуйте еще раз.\n");
        }
        return choice;
    }

    OperatingParameters chooseOperatingParameter() {
        OperatingParameters choice = OperatingParameters.NULL_PARAMETER;
        while (choice.equals(OperatingParameters.NULL_PARAMETER)) {
            messages.printOperatingParametersMessage();
            int answer = scanner.nextInt();
            if (answer == OperatingParameters.values()[0].ordinal() + 1)
                choice = OperatingParameters.OFFICE;
            else if (answer == OperatingParameters.values()[1].ordinal() + 1)
                choice = OperatingParameters.GAME;
            else
                System.err.println("Данного варианта не существует! Попробуйте еще раз.\n");
        }
        return choice;
    }
}
