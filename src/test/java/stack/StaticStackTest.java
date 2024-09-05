package stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.uade.seba.stack.staticImpl.StaticStack;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class StaticStackTest {

    private StaticStack<Integer> stack;

    @BeforeEach
    void init() {
        stack = new StaticStack<>(10);
    }

    @DisplayName("Empty stack when created")
    @Test
    void emptyStackAfterCreation() {
        assertTrue(stack.isEmpty());
    }

    @DisplayName("After creation pushing an element stack should not be empty")
    @Test
    void notEmptyAfterPushingElement() throws IllegalAccessException {
        stack.push(1);

        assertFalse(stack.isEmpty());
    }

    // TODO: Agregar más unit tests
}
