package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.testit.annotations.WorkItemIds;

public class TestA {
    @BeforeEach
    void beforeEach() {
        Assertions.assertTrue(false, "beforeEach c exception из класса A");
    }

    @Test
    @WorkItemIds("211087")
    void test() {
        Assertions.assertTrue(true, "Tест из класса A");
    }
}