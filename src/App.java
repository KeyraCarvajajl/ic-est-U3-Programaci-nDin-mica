import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //runEjerciciosPD();
        runMaze();
    }

    //private static void runEjerciciosPD() {
        //EjerciciosPD ePd = new EjerciciosPD();

        //System.out.println("Fibonacci Recursivo");
        //long start = System.nanoTime();
        //long resultado = ePd.getFibonacci(50); 
        //long end = System.nanoTime();
        //long duration = end - start;
        //System.out.println("Keyra Carvajal");
        //System.out.println("Resultado = " + resultado + " en tiempo = " + duration + " ns");

        //System.out.println("Fibonacci Recursivo Catching");
        //start = System.nanoTime();
        //resultado = ePd.getFibonacciPD(50);
        //end = System.nanoTime();
        //duration = end - start;
        //System.out.println("Resultado = " + resultado + " en tiempo = " + duration + " ns");
    //}

    private static void runMaze() {
        boolean[][] predefinedMaze = {
            {true, true, true, true},
            {false, true, true, true},
            {true, true, false, false},
            {true, true, true, true}
        };

        Maze maze = new Maze(predefinedMaze);
        System.out.println("Keyra Carvajal");
        System.out.println("\nLaberinto cargado:");
        maze.printMaze();

        Cell start = new Cell(0, 0);
        Cell end = new Cell(3, 3);

        List<MazeSolver> solvers = Arrays.asList(new MazeSolverRecursive());

        MazeSolver solver = solvers.get(0);
        List<Cell> path = solver.getPath(maze.getGrid(), start, end);

        System.out.println("\nCamino encontrado:");
        if (!path.isEmpty()) {
            // Imprimir camino en orden del inicio al final
            for (int i = path.size() - 1; i >= 0; i--) {
                System.out.println(path.get(i));
            }
            // Mostrar laberinto con camino
            maze.printMazeWithPath(path);
        } else {
            System.out.println("No se encontró un camino desde el inicio al destino.");
        }
    }
    
}
