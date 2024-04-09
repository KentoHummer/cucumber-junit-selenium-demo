package kentohummer.cjsdemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * ステップ定義のサンプルクラスです.
 */
public class SampleStep {

    private static ChromeDriver chromeDriver;

    @Given("^前提条件1$")
    public void prerequisites1() {
        // Chromeのドライバを起動
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
    }

    @When("^アクション1をした時$")
    public void action1() {
        // Cucumberの公式リファレンスを開く
        chromeDriver.get("https://cucumber.io/docs/cucumber/api/?lang=java");
    }

    @Then(value = "^結果1になる$")
    public void result1() {
        // 正しく遷移できているか検証
        assertEquals(chromeDriver.getCurrentUrl(), "https://cucumber.io/docs/cucumber/api/?lang=java");

        // Chromeのドライバを停止
        chromeDriver.quit();
    }
}
