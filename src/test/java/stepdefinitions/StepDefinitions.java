package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import reports.Reports;
import tasks.SearchTasks;
import tasks.WrongURLTasks;
import verificationpoints.SearchVerificationPoint;
import verificationpoints.WrongURLVerificationPoint;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class StepDefinitions {
    private WebDriver driver;
    private SearchTasks searchTasks;
    private WrongURLTasks wrongURLTasks;
    private WrongURLVerificationPoint wrongURLVerificationPoint;
    private SearchVerificationPoint searchVerificationPoint;

    private final Properties properties = new Properties();
    private String url;


    @Dado("que acesso a URL do blog do agibank")
    public void setup() throws Throwable {
        properties.load(new FileInputStream("src/test/resources/config.properties"));
        url = properties.getProperty("url");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        searchTasks = new SearchTasks(driver);
        searchVerificationPoint = new SearchVerificationPoint(driver);
    }


    @Quando("clico no botão de busca")
    public void clickSearchButton(){
        searchTasks.clickSearchButton();
    }

    @E("procuro algo no blog")
    public void searchSomething(){
        Reports.startTest("Teste de busca do agiblog");
        searchTasks.typeSearchTextField("lucra");
    }


    @Entao("verifico se os resultados da busca batem com a minha pesquisa")
    public void verifySearch() {
        searchVerificationPoint.verifySearch();
    }


    @E("clico em ler texto")
    public void clickReadText() {
        Reports.startTest("Teste de retorno a home clicando no logo");
        searchTasks.clickReadTextButton();
    }

    @Entao("clico no logo para retornar à homepage")
    public void returnHome(){
        searchTasks.clickLogoHome();
        searchVerificationPoint.verifyHome();
    }

    @Dado("que acesso a URL incorreta")
    public void accessWrongURL() throws IOException {
        Reports.startTest("Teste de página não encontrada");
        properties.load(new FileInputStream("src/test/resources/config.properties"));
        url = properties.getProperty("urlBroken");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        wrongURLTasks = new WrongURLTasks(driver);
        wrongURLVerificationPoint = new WrongURLVerificationPoint(driver);
    }


    @Entao("o conteúdo da página deve conter {string}")
    public void verifyContent(String pageNotFound) {
        wrongURLVerificationPoint.verifyWrongURL(wrongURLTasks.getWrongURLContent(), pageNotFound);
    }

    @After
    public void closeDriver(){
        driver.close();
    }
}
