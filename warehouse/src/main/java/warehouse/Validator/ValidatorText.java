package warehouse.Validator;

public class ValidatorText {

    public static void validateLettersOnly(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Text must not be null or empty");
        }

        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException(
                        "Invalid character detected (letters only): '" + c + "'"
                );
            }
        }
    }
}