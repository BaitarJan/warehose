package warehouse.Validator;

public class ValidatorDay {


    public static void validateDayOnly(int input) {



        if (!(input > 0 && input <= 31)) {
            throw new IllegalArgumentException("Day must be betwen 1 - 31");
        }
    }
}
