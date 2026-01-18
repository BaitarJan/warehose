package warehouse.Service;

import warehouse.Validator.*;

import java.time.LocalDate;

public class ServiceValidator {

    public static void validateName(String input) {
        ValidatorText.validateLettersOnly(input);
    }

    public static void validateNumber(String input) {
        ValidatorNumber.validateDigitsOnly(input);
    }

    public static void validateDay(String input) {
        int day = Integer.parseInt(input);
        ValidatorNumber.validateDigitsOnly(input);
        ValidatorDay.validateDayOnly(day);
    }

    public static void validateMonth(String input) {
        int month = Integer.parseInt(input);
        ValidatorNumber.validateDigitsOnly(input);
        ValidatorMonth.validateMonthOnly(month);
    }

    public static void validateYear(String input) {
       int year = Integer.parseInt(input);
        ValidatorNumber.validateDigitsOnly(input);
        ValidatorYear.validateYearOnly(year);
    }

    public static void validateDate(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        ValidatorDate.validateNotPast(date);
    }
}
