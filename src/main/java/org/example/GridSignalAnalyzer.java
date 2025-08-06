package org.example;

public class GridSignalAnalyzer {

    public void analyzeWithForLoop(char[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void analyzeWithForEachLoop(char[][] grid) {
        for (char[] rowArray : grid) {
            System.out.println("Processing Row with Hash: " + rowArray);
            for (char value : rowArray) {
                System.out.println("-> " + value);
            }
        }
    }

    public void analyzeWithHybridLoop(char[][] grid) {
        for (char[] rowArray : grid) {
            for (int j = 0; j < rowArray.length; j++) {
                System.out.print(rowArray[j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        GridSignalAnalyzer analyzer = new GridSignalAnalyzer();

        // Mission Data: The Scrambled Communications Grid
        char[][] scrambledGrid = {
                { 'C', 'H', 'A', 'R', 'L', 'I', 'E' },
                { 'A', 'L', 'P', 'H', 'A' },
                { 'T', 'A', 'N', 'G', 'O', '7' },
                { 'B', 'R', 'A', 'V', 'O' }
        };

        System.out.println("--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
        analyzer.analyzeWithForLoop(scrambledGrid);
        System.out.println();

        System.out.println("--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
        analyzer.analyzeWithForEachLoop(scrambledGrid);
        System.out.println();

        System.out.println("--- PHASE 4: HYBRID LOOP APPROACH ---");
        analyzer.analyzeWithHybridLoop(scrambledGrid);
        System.out.println();

    }
}