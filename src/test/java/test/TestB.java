package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.testit.annotations.ExternalId;
import ru.testit.annotations.WorkItemIds;

public class TestB {
    @Test
    @WorkItemIds("211088")
    @ExternalId("211088")
    void test() {
        Assertions.assertTrue(true, "Тест из класса B");
    }
}