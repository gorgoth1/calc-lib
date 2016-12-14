package pl.gov.coi.example.calc;

/**
 * @author <a href="mailto:krzysztof.suszynski@coi.gov.pl">Krzysztof Suszynski</a>
 * @since 17.11.16
 */
public class Calc {

    public int add(int a, int b) {
        if(a > 5){
          return a + b;
        } else if(a < 5 && b > 3){
          return a + b;
        }else {
          return a + b;  
        }


    }
    public int substract(int a, int b) {
        return a - b;
    }
}
