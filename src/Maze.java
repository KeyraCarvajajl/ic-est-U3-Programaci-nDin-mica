import java.util.List;

public class Maze {

    private boolean[][] maze;
    private int rows;
    private int columns;

    public Maze(boolean[][] maze) {
        this.maze = maze;
        this.rows = maze.length;
        this.columns = maze[0].length;
    }

    public void printMaze() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(maze[i][j] ? " - " : " * ");
            }
            System.out.println();
        }
    }

    public boolean[][] getGrid() {
        return maze;
    }


    public void printMazeWithPath(List<Cell> path) {
        char[][] visual = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                visual[i][j] = maze[i][j] ? '-' : '*';
            }
        }

        for (Cell c : path) {
            visual[c.getRow()][c.getColumn()] = '@';
        }

        System.out.println("\nLaberinto con camino:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(" " + visual[i][j] + " ");
            }
            System.out.println();
        }
    }
}
