// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("alejandra");
     System.out.println("integer:" + 10 +
                       "\n Double: " + 3.14 +
                       "\n Boolean: " + true);
    int numint = 9;
    double numDouble = 84;
    boolean numBoolean = false;
    char numbChar = 'a';
    String numString = "alejandra";
    byte edad = 27;
    short numShort = 3;
    long numLong = 3;
    int[ ] numArray = {1,2,3,4,5};
    String[] numArray2 = {"alejandra", "juan", "pedro"};

    System.out.println("tInteger:" + numint +
                       "\n Double: " + numDouble +
                       "\n TBoolean: " + numBoolean + 
                       "\n TChar: " + numbChar + 
                       "\n TString: " + numString + 
                       "\n TByte: " + edad + 
                       "\n TShort: " + numShort + 
                       "\n TLong: " + numLong );
    int num1 = 10;
    int num2 = 20;
    int suma = num1 + num2;
    int resta = num1 - num2;
    int multiplicacion = num1 * num2;
    int division = num1 / num2;
    int modulo = num1 % num2;
    System.out.println("suma: " + suma +
                       "\n resta: " + resta +
                       "\n Multiplicacion: " + multiplicacion +
                       "\n Division: " + division +
                       "\n Modulo: " + modulo);    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
