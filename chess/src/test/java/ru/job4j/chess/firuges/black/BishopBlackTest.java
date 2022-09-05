package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

import ru.job4j.chess.ImpossibleMoveException;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;


import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {
    @Test
    public void positionTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position()).isEqualTo(Cell.C8);
    }

    @Test
    public void copyTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        Figure copied = bishopBlack.copy(Cell.D7);
        assertThat(copied.position()).isEqualTo(Cell.D7);
    }

    @Test
    public void wayTest() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] result = bishopBlack.way(Cell.G5);
        Cell[] expected = {Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        assertThat(expected).isEqualTo(result);
    }

    @Test
    public void isNotDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        ImpossibleMoveException exception = assertThrows(
                ImpossibleMoveException.class,
                () -> bishopBlack.way(Cell.A8));
        assertThat(exception.getMessage()).isEqualTo(
                "Could not way by diagonal from %s to %s", bishopBlack.position(), Cell.A8);
    }
}