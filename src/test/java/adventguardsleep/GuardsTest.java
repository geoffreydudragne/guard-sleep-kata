package adventguardsleep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GuardsTest {

    @Test
    void acceptance_test() throws Exception {
        Guards.GuardKataResult guardKataResult = Guards.guardKata();
        Assertions.assertEquals(77084, guardKataResult.part1);
        Assertions.assertEquals(23047, guardKataResult.part2);
    }
}