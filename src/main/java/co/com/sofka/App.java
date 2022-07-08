package co.com.sofka;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Clase principal para las operaciones matemáticas
 *
 * @author Ricardo Ortega <tattortega.28@gmail.com>
 * @version 1.0.0 2022-07-07
 * @since 1.0.0
 */
public class App {

    private static final Logger logger = Logger.getLogger("MyLog");

    /**
     * Método sumar, se recorre cada lista por su índice y se suma.
     * @param arr1 List
     * @param arr2 List
     */
    public void sum(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> sum = IntStream.range(0, arr1.size())
                .mapToObj(i -> arr1.get(i) + arr2.get(i))
                .collect(Collectors.toList());
        logger.log(Level.INFO, "La suma de cada indice de las dos listas es: {0}", sum);
    }

    /**
     * Método resta, se recorre cada lista por su índice y se resta.
     * @param arr1 List
     * @param arr2 List
     */
    public void subtract(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> subtract = IntStream.range(0, arr1.size())
                .mapToObj(i -> arr1.get(i) - arr2.get(i))
                .collect(Collectors.toList());
        logger.log(Level.INFO, "La resta de cada indice de las dos listas es: {0}", subtract);
    }

    /**
     * Método multiplicación, se recorre cada lista por su índice y se multiplica.
     * @param arr1 List
     * @param arr2 List
     */
    public void multiplication(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> multiplication = IntStream.range(0, arr1.size())
                .mapToObj(i -> arr1.get(i) * arr2.get(i))
                .collect(Collectors.toList());
        logger.log(Level.INFO, "La multiplicación de cada indice de las dos listas es: {0}", multiplication);
    }

    /**
     * Método división, se recorre cada lista por su índice, validando que el dividendo no sea 0 y se divide.
     * @param arr1 List
     * @param arr2 List
     */
    public void division(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> division = IntStream.range(0, arr1.size())
                .filter(num -> arr2.get(num) != 0)
                .mapToObj(i -> arr1.get(i) / arr2.get(i))
                .collect(Collectors.toList());
        logger.log(Level.INFO, "La division de cada indice de las dos listas es: {0}", division);
    }

    /**
     * Método módulo, se recorre cada lista por su índice, validando que el dividendo no sea 0 y se saca el módulo.
     * @param arr1 List
     * @param arr2 List
     */
    public void module(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> module = IntStream.range(0, arr1.size())
                .filter(num -> arr2.get(num) != 0)
                .mapToObj(i -> arr1.get(i) % arr2.get(i))
                .collect(Collectors.toList());
        logger.log(Level.INFO, "El modulo de cada indice de las dos listas es: {0}", module);
    }

    public static void main(String[] args) {
        final List<Integer> arr1 = List.of(3, 5, 7, 8);
        final List<Integer> arr2 = List.of(0, 9, 6, 1, 4);
        App app = new App();
        app.sum(arr1, arr2);
        app.subtract(arr1,arr2);
        app.multiplication(arr1,arr2);
        app.division(arr1,arr2);
        app.module(arr1,arr2);
    }
}
