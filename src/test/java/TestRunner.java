import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestRunner extends Setup {

    // ----------1. Sum any of 2 numbers (9+5=14)------------
    @Test(priority = 1, description = "Summation of any two numbers")
    public void doSum() throws InterruptedException {
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        String sum = calculatorScreen.doSum();
        System.out.println(sum);
        Assert.assertEquals(sum, "14");
    }

    // ---------2. Subtraction any of 2 numbers (8-3=5)-------------
    @Test(priority = 2, description = "Subtraction of any two numbers")
    public void doSub() throws InterruptedException {
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        String sub = calculatorScreen.doSub();
        System.out.println(sub);
        Assert.assertEquals(sub, "5");

    }

    // ----------- 3. Do multiply of Result of Sum and Subtraction
    // (14*5=70)------------
    @Test(priority = 3, description = "Multiplication of Result of the current sumation and subtraction")
    public void doMul() throws InterruptedException {
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        String mul = calculatorScreen.doMul();
        System.out.println(mul);
        ssert.assertEquals(mul, "70");

    }

    // ----------4. Divide the result of multiplication with 10
    // (70/10=7)--------------
    @Test(priority = 4, description = " Division of the result of multiplication with 10")
    public void doDiv() throws InterruptedException {
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        String div = calculatorScreen.doDiv();
        System.out.println(div);
        Assert.assertEquals(div, "7");

    }

    // ------------- 5. Solve this series (100+200-100*2/5)--------------------
    @Test(priority = 5, description = "Solve this series")
    public void doSeries() throws InterruptedException {
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        String series = calculatorScreen.doSeries();
        System.out.println(series);
        Assert.assertEquals(series, "260");

    }

    @AfterMethod
    public void clearScreen() {
        CalculatorScreen calculatorScreen = new CalculatorScreen(driver);
        calculatorScreen.btnClear.click();
    }
}
