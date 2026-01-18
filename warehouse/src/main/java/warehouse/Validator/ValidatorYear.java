package warehouse.Validator;

public class ValidatorYear {

    public static void validateYearOnly(int input) {

        if (!(input > 0 && input <= 9999)) {
            throw new IllegalArgumentException("Month must be betwen 1 - 9999");
        }
    }
}



