import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class FactorsArrayTest {

    @Test
    public void allTheFactorsOfANumberTest() {
            int [] result = {2,2,5,5,5,163,8287};
        assertArrayEquals(result ,  FactorsArray.commonFactors(675390500));


    }

}