package cl.TalentoDigitalKibernum;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Maven-Jenkins Grupo2 :D" );

        String[] letters = {"a", "b", "d"};
        Arrays.asList(letters).forEach( e -> System.out.println( e ) );
    }

    public String arrayString() {
        return Arrays.asList( "a", "b", "d" ).stream().collect(Collectors.joining(""));
    }
}
/** comentando comentando **/
