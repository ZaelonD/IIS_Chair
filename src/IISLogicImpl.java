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
        MarketingTask choice = null;
        boolean isRight = true;
        messages.printGeneralTitleMessage();
        while (isRight) {
            messages.printMarketingTaskMessage();
            int answer = scanner.nextInt();
            if (answer > 0 && answer <= MarketingTask.getLength()) {
                choice = MarketingTask.values()[answer - 1];
                isRight = false;
            } else
                System.err.println("Данного варианта не существует! Попробуйте еще раз.\n");
        }
        return choice;
    }

    OperatingParameters chooseOperatingParameter() {
        OperatingParameters choice = null;
        boolean isRight = true;
        while (isRight) {
            messages.printOperatingParametersMessage();
            int answer = scanner.nextInt();
            if (answer > 0 && answer <= OperatingParameters.getLength()) {
                choice = OperatingParameters.values()[answer - 1];
                isRight = false;
            } else
                System.err.println("Данного варианта не существует! Попробуйте еще раз.\n");
        }
        return choice;
    }

    TechnicalSpecifications chooseTechnicalSpecifications() {
        TechnicalSpecifications choice = null;
        boolean isRight = true;
        while (isRight) {
            messages.printTechnicalSpecificationsMessage();
            int answer = scanner.nextInt();
            if (answer > 0 && answer <= TechnicalSpecifications.getLength()) {
                choice = TechnicalSpecifications.values()[answer - 1];
                isRight = false;
            } else
                System.err.println("Данного варианта не существует! Попробуйте еще раз.\n");
        }
        return choice;
    }

    BackAngle chooseBackAngle() {
        BackAngle backAngle = null;
        boolean isRight = true;
        while (isRight) {
            messages.printBackAngle();
            int answer = scanner.nextInt();
            if (answer > 0 && answer <= BackAngle.getLength()) {
                backAngle = BackAngle.values()[answer - 1];
                isRight = false;
            } else
                System.err.println("Данного варианта не существует! Попробуйте еще раз.\n");
        }
        return backAngle;
    }
}
