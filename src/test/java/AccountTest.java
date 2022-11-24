import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountTest {

    private Account account;
    private String name;
    private boolean expectedResult;

    public AccountTest(String name, boolean expectedResult) {
        this.name = name;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters(name = "Тестовые данные: Данные держателя карты: {0}; ожидаемый результат: {1}")
    public static Object[][] getTestData() {
        return new Object[][] {
                {" Федоров Олег", false},
                {" Федоров Олег ", false},
                {"Федоров Олег ", false},
                {"ФедоровОлег", false},
                {"Федоров-Егоров Олег", true},
                {"Федоров-Егоров Елена", false},
                {"Ф", false},
                {"Федоров Олег", true}
        };
    }

    @Test
    public void AccountTest() {
        account = new Account(name);
        assertEquals(expectedResult,account.checkNameToEmboss());
    }

}
