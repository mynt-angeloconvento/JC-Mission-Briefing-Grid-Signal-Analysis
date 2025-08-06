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

    }
}