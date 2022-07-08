package co.com.sofka;


import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class App {

    private static final Logger logger = Logger.getLogger("MyLog");

    public void sum(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> sum = IntStream.range(0, arr1.size())
                .mapToObj(i -> arr1.get(i) + arr2.get(i))
                .collect(Collectors.toList());
        logger.log(Level.INFO, "La suma de cada indice de las dos listas es: {0}", sum);
    }

    public void subtract(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> subtract = IntStream.range(0, arr1.size())
                .mapToObj(i -> arr1.get(i) - arr2.get(i))
                .collect(Collectors.toList());
        logger.log(Level.INFO, "La resta de cada indice de las dos listas es: {0}", subtract);
    }

    public void multiplication(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> multiplication = IntStream.range(0, arr1.size())
                .mapToObj(i -> arr1.get(i) * arr2.get(i))
                .collect(Collectors.toList());
        logger.log(Level.INFO, "La multiplicación de cada indice de las dos listas es: {0}", multiplication);
    }

    public void division(List<Integer> arr1, List<Integer> arr2) {
        List<Integer> division = IntStream.range(0, arr1.size())
                .filter(num -> arr2.get(num) != 0)
                .mapToObj(i -> arr1.get(i) / arr2.get(i))
                .collect(Collectors.toList());
        logger.log(Level.INFO, "La division de cada indice de las dos listas es: {0}", division);
    }
    public static void main(String[] args) {
        final List<Integer> arr1 = List.of(3, 5, 7, 8);
        final List<Integer> arr2 = List.of(0, 9, 6, 1, 4);
        App app = new App();
        app.sum(arr1, arr2);
        app.subtract(arr1,arr2);
        app.multiplication(arr1,arr2);
        app.division(arr1,arr2);
    }
}
