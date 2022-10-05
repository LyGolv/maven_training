package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void op_add() {
        int result = new Sample().op(Sample.Operation.ADD, 2, 5);

        Assertions.assertThat(result)
            .as("Addition of 2 and 5")
            .isEqualTo(7);
    }

    @Test
    void op_mult() {
        int result = new Sample().op(Sample.Operation.MULT, 2, 5);

        Assertions.assertThat(result)
            .as("Multiplication of 2 and 5")
            .isEqualTo(10);
    }

    @Test
    void fact() {
        int result = new Sample().fact(5);

        Assertions.assertThat(result)
            .as("Factorial of 5")
            .isEqualTo(120);
    }

    @Test
    void factException() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> new Sample().fact(-1))
            .withMessage("N should be positive");
    }
}
