package tdd;

public class CalculatorTest {

  public void addNumberTest(){
    Calculator calculator = new Calculator();
    int result = calculator.add(3, 8);
    assertEquals(11, calculator.add(3, 8));


  }

  private void assertEquals(int amount, int result) {

  }


}
