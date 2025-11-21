package ie.tudublin

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class SudokuTest {

    // Solvable Sudoku
    private val board1 = listOf(
        "850002400",
        "720000009",
        "004000000",
        "000107002",
        "305000900",
        "040000000",
        "000080070",
        "017000000",
        "000036040"
    )

    private val board1Solution = listOf(
        "851962437",
        "724815639",
        "964373851",
        "638147592",
        "305296948",
        "947538126",
        "492681375",
        "217459863",
        "573236914"
    )

    // Another solvable board
    private val board2 = listOf(
        "530070000",
        "600195000",
        "098000060",
        "800060003",
        "400803001",
        "700020006",
        "060000280",
        "000419005",
        "000080079"
    )

    // Unsolvable board
    private val unsolvableBoard = listOf(
        "111111111",
        "111111111",
        "111111111",
        "111111111",
        "111111111",
        "111111111",
        "111111111",
        "111111111",
        "111111111"
    )

    @Test
    fun testSolvableBoard1() {
        val sudoku = Sudoku(board1)
        val solved = sudoku.solve()
        assertTrue(solved, "Board 1 should be solvable")
    }

    @Test
    fun testSolvableBoard2() {
        val sudoku = Sudoku(board2)
        val solved = sudoku.solve()
        assertTrue(solved, "Board 2 should be solvable")
    }

    @Test
    fun testUnsolvableBoard() {
        val sudoku = Sudoku(unsolvableBoard)
        val solved = sudoku.solve()
        assertFalse(solved, "Unsolvable board should return false")
    }
}
