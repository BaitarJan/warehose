

package warehouse;

import warehouse.Service.ServiceValidator;

public class Main {

    public static void main(String[] args) {

        try {
            // TEXT
            ServiceValidator.validateName("Test");
            // ServiceValidator.validateName("Test1"); // BOUCHNE

            // ČÍSLA
            ServiceValidator.validateNumber("12345");
            // ServiceValidator.validateDigits("12a"); // BOUCHNE

            // DEN / MĚSÍC / ROK
            ServiceValidator.validateDay("31");
            ServiceValidator.validateMonth("6");
            ServiceValidator.validateYear("2026");

            // DATUM
            //ServiceValidator.validateDate(2026, 6, 15);
             ServiceValidator.validateDate(2020, 1, 1); // BOUCHNE

            System.out.println("VŠE PROŠLO OK");

        } catch (IllegalArgumentException e) {
            System.err.println("VALIDATION ERROR: " + e.getMessage());
        }
    }
}