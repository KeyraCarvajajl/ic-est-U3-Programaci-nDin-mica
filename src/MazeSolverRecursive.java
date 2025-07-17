import java.util.ArrayList;
import java.util.List;

public class MazeSolverRecursive implements MazeSolver {

    @Override
    public List<Cell> getPath(boolean[][] grid, Cell start, Cell end) {
        List<Cell> path = new ArrayList<>();
        if (grid == null || grid.length == 0)
            return path;

        boolean[][] visited = new boolean[grid.length][grid[0].length];

        if (findPath(grid, start, end, path, visited))
            return path;

        return new ArrayList<>();
    }

    private boolean findPath(boolean[][] grid, Cell current, Cell end, List<Cell> path, boolean[][] visited) {
        int row = current.row;
        int column = current.column;

        if (row < 0 || row >= grid.length || column < 0 || column >= grid[0].length || !grid[row][column] || visited[row][column])
            return false;

        visited[row][column] = true;

        if (row == end.row && column == end.column) {
            path.add(current);
            return true;
        }

        if (findPath(grid, new Cell(column, row - 1), end, path, visited) || // arriba
            findPath(grid, new Cell(column, row + 1), end, path, visited) || // abajo
            findPath(grid, new Cell(column - 1, row), end, path, visited) || // izquierda
            findPath(grid, new Cell(column + 1, row), end, path, visited)) { // derecha

            path.add(current);
            return true;
        }

        return false; 
    }
}
