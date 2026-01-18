package warehouse.Validator;

public class ValidatorNumber {

    public static void validateDigitsOnly(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input must not be null or empty");
        }

        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException(
                        "Invalid character detected (digits only): '" + c + "'"
                );
            }
        }
    }
}