package org.serempre.prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WebElements {
    public static void main (String[] args){
        try {
            WebDriver driver;
            String chromePath = System.getProperty("user.dir")+"\\drivers\\chromedriver.exe";
            String baseURL= "https://co-tc-shopper-web-stage.serempre.dev/";

            System.setProperty("webdriver.chrome.driver", chromePath);
            driver = new ChromeDriver();
            driver.get(baseURL);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            //Click en ciudad
            WebElement ciudad = driver.findElement(By.id("cityLocation"));
            ciudad.click();
            Thread.sleep(2000);
            WebElement ciudad2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[5]"));
            ciudad2.click();
            WebElement ciudad3 = driver.findElement(By.xpath("/html/body/div/div/div/div/button"));
            ciudad3.click();

            //Seleccion de tipo de usuario
            WebElement consumidor = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/div/div/button[contains(., 'Consumidor')]"));
            consumidor.click();
            Thread.sleep(5000);

            //Registro de telefono celular
            WebElement telefonoCelular = driver.findElement(By.xpath("/html/body/div/div/main/div/div/form/div/div/div/div/div/input[contains(@type, 'number')]"));
            telefonoCelular.sendKeys("3142583699" + Keys.ENTER);

            //Terminos y condiciones
            Thread.sleep(5000);
            WebElement terminos = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/div/label/input[contains(@name, 'abi-checkbox-terms')]"));
            terminos.click();

            WebElement politicas = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/div/label/input[contains(@name, 'abi-checkbox-policies')]"));
            politicas.click();

            WebElement continuarPoliticas = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/div/button"));
            continuarPoliticas.click();

            //Datos Personales
            Thread.sleep(5000);
            WebElement nombre = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/div/div/div/input[contains(@id, 'register-name')]"));
            nombre.sendKeys("Equipo" + Keys.ENTER);

            WebElement apellido = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/div/div/div/input[contains(@id, 'register-lastName')]"));
            apellido.sendKeys("Calidad" + Keys.ENTER);

            WebElement correo = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/div/div/div/input[contains(@id, 'register-email')]"));
            correo.sendKeys("correoCalidad@pruebas.com.ar" + Keys.ENTER);

            Thread.sleep(2000);
            WebElement siguiente = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/div/div/button/span[contains(., 'Siguiente')]"));
            siguiente.click();

            //Direccion
            Thread.sleep(5000);
            WebElement ingresaDireccion = driver.findElement(By.xpath("/html/body/div/div/main/div/div/div/div/div/div/div/div/div/button[contains(@class, 'sc-jSFkmK hRxJjc w-full bg-transparent shadow-none border-gray-500 normal-case text-gray-principal py-3 justify-start relative StyledButton StyledButtonprimary transition duration-300 ease-in-out')]"));
            ingresaDireccion.click();
            Thread.sleep(5000);
            WebElement direccion = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div/div/input[contains(@class, 'sc-pNWxx hcaWF sc-fFSRdu jKTliz pr-12 form-input transition duration-300 ease-in-out')]"));
            direccion.sendKeys("Cra. 13 #96-67" + Keys.ENTER);
            Thread.sleep(5000);
            WebElement seleccionDireccion = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/div/div/ul/li"));
            seleccionDireccion.click();
            WebElement seleccionUbicacion = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/form/button/span[contains(., 'Seleccionar ubicación')]"));
            seleccionUbicacion.click();

            //driver.quit();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}