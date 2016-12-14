package pl.gov.coi.example.calc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author <a href="mailto:krzysztof.suszynski@coi.gov.pl">Krzysztof Suszynski</a>
 * @since 17.11.16
 */
public class CalcTest {
    @Test
    public void testAdd() {
        // given
        int a = 5;
        int b = 4;
        Calc calc = new Calc();

        // when
        int result = calc.add(a, b);

        // then
        assertEquals(9, result);
    }

    @Test
    public void testAdd1() {
        // given
        int a = 6;
        int b = 1;
        Calc calc = new Calc();

        // when
        int result = calc.add(a, b);

        // then
        assertEquals(7, result);
    }

    @Test
    public void testAdd2() {
        // given
        int a = 4;
        int b = 4;
        Calc calc = new Calc();

        // when
        int result = calc.add(a, b);

        // then
        assertEquals(8, result);
    }

    @Test
    public void testAdd3() {
        // given
        int a = 4;
        int b = 1;
        Calc calc = new Calc();

        // when
        int result = calc.add(a, b);

        // then
        assertEquals(5, result);
    }

    @Test
    public void testSub() {
        // given
        int a = 5;
        int b = 4;
        Calc calc = new Calc();

        // when
        int result = calc.substract(a, b);

        // then
        assertEquals(1, result);
    }

}
