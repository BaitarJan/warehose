package warehouse.Validator;

import java.time.Clock;
import java.time.LocalDate;

public class ValidatorDate {

    private static final Clock CLOCK = Clock.systemDefaultZone();

    public static void validateNotPast(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Date must not be null");
        }

        if (date.isBefore(LocalDate.now(CLOCK))) {
            throw new IllegalArgumentException("Date must not be in the past");
        }
    }
}
