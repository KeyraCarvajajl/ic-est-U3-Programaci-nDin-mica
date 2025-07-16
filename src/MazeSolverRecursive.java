import java.util.ArrayList;
import java.util.List;

public class MazeSolverRecursive implements MazeSolver {

    @Override
    public List<Cell> getPath(boolean[][] grid, Cell start, Cell end) {
        List<Cell> path = new ArrayList<>();
        if (grid == null || grid.length == 0)
            return path;

        if (findPath(grid, start, end, path))
            return path;

        return new ArrayList<>();
    }

    private boolean findPath(boolean[][] grid, Cell start, Cell end, List<Cell> path) {
        int row = start.row;
        int column = start.column;

        if (row >= grid.length || column >= grid[0].length || !grid[row][column])
            return false;
        
        if (row == end.row && column == end.column) {
            path.add(start);
            return true;
        }

        if (findPath(grid, new Cell(row + 1, column), end, path)) {
            path.add(start);
            return true;
        }

        if (findPath(grid, new Cell(row, column + 1), end, path)) {
            path.add(start);
            return true;
        }

        return false;
    }

}
