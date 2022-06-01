import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
    
    class lab2_SITest {

        private <T>List<String> newArrayList(List<T> asList){
        return new ArrayList<>(Arrays.asList());
        
    }
    @Test
    void everyStatementTest()
    {
        IllegalArgumentException ex;
        ex = assertThrows(IllegalArgumentException.class, () -> lab2_SI.function(newArrayList(Arrays.asList())));
        assertTrue(ex.getMessage().contains("List lenght should be greater than 0"));
        ex = assertThrows(IllegalArgumentException.class,() -> lab2_SI.function(new ArrayList(Arrays.asList("17","18","19","20","21"))));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));
    }
        @Test
        void everyBranch(){
            RuntimeException temp;

        }
    }

