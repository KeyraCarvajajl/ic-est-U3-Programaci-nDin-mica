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
    
}
