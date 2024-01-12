import enums.BackAngle;
import enums.MarketingTask;
import enums.OperatingParameters;
import enums.TechnicalSpecifications;

import java.util.Scanner;

public class IISLogicImpl {
    private final Scanner scanner = new Scanner(System.in);
    private final Messages messages = new Messages();

    void start() {
        var mt = chooseAMarketingTask();
        var op = chooseOperatingParameter();
        var ts = chooseTechnicalSpecifications();
        var an = chooseBackAngle();
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
        var choice = OperatingParameters.NULL_PARAMETER;
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

    TechnicalSpecifications chooseTechnicalSpecifications() {
        var choice = TechnicalSpecifications.TYPE_NULL;
        while (choice.equals(TechnicalSpecifications.TYPE_NULL)) {
            messages.printTechnicalSpecificationsMessage();
            int answer = scanner.nextInt();
            if (answer == TechnicalSpecifications.values()[0].ordinal() + 1)
                choice = TechnicalSpecifications.TYPE_3D;
            else if (answer == TechnicalSpecifications.values()[1].ordinal() + 1)
                choice = TechnicalSpecifications.TYPE_4D;
            else
                System.err.println("Данного варианта не существует! Попробуйте еще раз.\n");
        }
        return choice;
    }

    BackAngle chooseBackAngle() {
        BackAngle backAngle = BackAngle.NULL_ANGLE;
        while (backAngle.equals(BackAngle.NULL_ANGLE)) {
            messages.printBackAngle();
            for (int i = 0, insertAngle = scanner.nextInt(); i < BackAngle.values().length - 1 && insertAngle >= 140 && insertAngle <= 170; i++)
                if (insertAngle == BackAngle.values()[i].getValue())
                    backAngle = BackAngle.values()[i];
            if (backAngle.equals(BackAngle.NULL_ANGLE))
                System.err.println("Данного варианта не существует! Попробуйте еще раз.\n");
        }
        return backAngle;
    }
}
