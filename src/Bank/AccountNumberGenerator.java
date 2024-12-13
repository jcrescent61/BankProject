package Bank;

import java.util.HashMap;
import java.util.Random;

public class AccountNumberGenerator {
    String generateAccountNumber(HashMap<String, String> accountNumbers) {
        String accountNumber;

        do {
            accountNumber = createRandomAccountNumber();
        } while (accountNumbers.containsKey(accountNumber)); // 중복 확인
        return accountNumber;
    }

    private String createRandomAccountNumber() {
        Random random = new Random();

        int firstPart = random.nextInt(900) + 100;
        int secondPart = random.nextInt(90) + 10;
        int thirdPart = random.nextInt(900000) + 100000;

        return String.format("%03d-%02d-%06d", firstPart, secondPart, thirdPart);
    }
}
