public class Cell {

    int column;
    int row;
    public Cell(int column, int row) {
        this.column = column;
        this.row = row;
    }
    public int getColumn() {
        return column;
    }
    public void setColumn(int column) {
        this.column = column;
    }
    public int getRow() {
        return row;
    }
    public void setRow(int row) {
        this.row = row;
    }
    @Override
    public String toString() {
        return "Celda [Columna: " + column + ", Row: " + row + "]";
    }
}
