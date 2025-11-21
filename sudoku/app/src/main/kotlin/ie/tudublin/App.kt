package ie.tudublin

import java.io.File

fun main(args: Array<String>) {

    if (args.isEmpty()) {
        println("Usage: java -jar sudoku.jar <inputfile>")
        return
    }

    val filename = args[0]
    val file = File(filename)

    if (!file.exists()) {
        println("Error: File '$filename' does not exist.")
        return
    }

    val rows = file.readLines().map { it.trim() }

    if (rows.size != 9 || rows.any { it.length != 9 }) {
        println("Error: Input file must contain exactly 9 lines of 9 digits each.")
        return
    }

    val sudoku = Sudoku(rows)

    println("\nInput board:\n")
    println(sudoku)

    val solved = sudoku.solve()

    if (solved) {
        println("Solution:\n")
        println(sudoku)
    } else {
        println("Could not find a solution.")
    }
}
