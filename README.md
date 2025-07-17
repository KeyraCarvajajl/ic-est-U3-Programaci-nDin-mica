# 🧠 Proyecto: Resolución de Laberinto y Fibonacci con Recursividad

**Autora:** Ing. Pablo Torres
**Estudiante:** Keyra Carvajal  
**Materia:** Estructura de Datos  
**Tema:** Recursividad y Programación Dinámica  

---

## 📚 Descripción

Este proyecto implementa dos aplicaciones principales:

1. 📈 **Cálculo del número de Fibonacci** mediante:
   - Recursividad tradicional
   - Programación dinámica con memoización

2. 🧭 **Resolución de un laberinto** representado con una matriz booleana, usando:
   - Algoritmo recursivo
   - Exploración en 4 direcciones (arriba, abajo, izquierda, derecha)
   - Visualización del camino recorrido

---

## 🧱 Estructura del proyecto

| Clase                  | Descripción                                                                 |
|------------------------|-----------------------------------------------------------------------------|
| `App`                  | Clase principal. Ejecuta los ejercicios y pruebas.                         |
| `EjerciciosPD`         | Métodos para Fibonacci clásico y con caché (programación dinámica).        |
| `Maze`                 | Representa el laberinto (`boolean[][]`) y métodos para imprimirlo.         |
| `Cell`                 | Representa una celda con columna y fila.                                   |
| `MazeSolver`           | Interfaz que define `getPath(...)` para resolver laberintos.               |
| `MazeSolverRecursive`  | Implementación recursiva con soporte para 4 direcciones.                   |

---

## 🔢 Ejercicio 1: Fibonacci

Se implementan dos versiones del cálculo del número de Fibonacci:

### ✅ Recursiva:


## 🧭 Ejercicio 2: Laberinto
El laberinto es una matriz boolean[][]:

true = celda transitable

false = obstáculo o pared

✅ El algoritmo recursivo:
Explora en 4 direcciones: arriba, abajo, izquierda, derecha.

Usa una matriz visited[][] para no repetir celdas.

Al encontrar el destino, almacena el camino en una List<Cell>.

## 🛠️ Ejecución
Compila el proyecto en tu IDE o por consola.

Corre App.java.

Se ejecutarán:

Comparación de tiempos de Fibonacci

Impresión del laberinto

Camino resuelto paso a paso

## 📌 Requisitos
JDK 8 o superior

IDE (como IntelliJ, VSCode o Eclipse) o consola Java

✅ Resultado esperado
Mostrar el laberinto cargado

Mostrar el camino resuelto paso a paso

Imprimir visualmente el recorrido dentro del laberinto

Comparar rendimiento de Fibonacci clásico vs memoizado

## Resultados de la ejecución
<img width="532" height="136" alt="Resultado Fibonacci" src="https://github.com/user-attachments/assets/0d428250-96b4-4931-84db-3520705f916b" />
<img width="377" height="530" alt="Laberinto Resultado" src="https://github.com/user-attachments/assets/adbeebc1-af33-44a2-a97b-9178d359a01a" />


