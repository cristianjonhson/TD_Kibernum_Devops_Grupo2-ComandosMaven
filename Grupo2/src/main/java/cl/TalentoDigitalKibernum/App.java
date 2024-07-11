package cl.TalentoDigitalKibernum;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Hello world!
 * Hallo
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Maven-Jenkins Grupo2 :D" );

        System.out.println( "prueba cristian cambio a jenkins" );

        String[] letters = {"a", "b", "d"};
        Arrays.asList(letters).forEach( e -> System.out.println( e ) );
    }

    public String arrayString() {
        return Arrays.asList( "a", "b", "d" ).stream().collect(Collectors.joining(""));
    }
}
/** comentando comentando **/
