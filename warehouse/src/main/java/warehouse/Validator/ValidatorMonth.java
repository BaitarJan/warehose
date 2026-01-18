package warehouse.Validator;

public class ValidatorMonth {


    public static void validateMonthOnly(int input) {

        if (!(input > 0 && input <= 12)) {
            throw new IllegalArgumentException("Month must be betwen 1 - 12");
        }
    }
}





