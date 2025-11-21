package ie.tudublin

import org.junit.jupiter.api.Test
import kotlin.test.assertTrue
import kotlin.test.assertFalse

class SudokuTest {

    // Test 1: Simple solvable board
    private val board1 = listOf(
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

    // Test 2: Another solvable board
    private val board2 = listOf(
        "004000000",
        "720000009",
        "000000000",
        "000107002",
        "305000900",
        "040000000",
        "000080070",
        "017000000",
        "000036040"
    )

    // Test 3: Guaranteed unsolvable board (conflicting first two rows)
    private val unsolvableBoard = listOf(
        "123456789",
        "123456789", // conflict → unsolvable
        "000000000",
        "000000000",
        "000000000",
        "000000000",
        "000000000",
        "000000000",
        "000000000"
    )

    @Test
    fun testSolvableBoard1() {
        val sudoku = Sudoku(board1)
        val solved = sudoku.solve()
        assertTrue(solved, "Board1 should be solvable")
    }

    @Test
    fun testSolvableBoard2() {
        val sudoku = Sudoku(board2)
        val solved = sudoku.solve()
        assertTrue(solved, "Board2 should be solvable")
    }

    @Test
    fun testUnsolvableBoard() {
        val sudoku = Sudoku(unsolvableBoard)
        val solved = sudoku.solve()
        assertFalse(solved, "Unsolvable board should return false")
    }
}
