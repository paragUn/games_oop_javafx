package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import ru.job4j.chess.firuges.Cell;


import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {
    @Test
    public void position() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        assertThat(bishopBlack.position()).isEqualTo(Cell.C8);
    }

    @Test
    public void copy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C8);
        bishopBlack.copy(Cell.D7);
        assertThat(bishopBlack.position()).isEqualTo(Cell.D7);
    }

    @Test
    public void way() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        bishopBlack.way(Cell.G5);
        assertThat(1);
    }
}