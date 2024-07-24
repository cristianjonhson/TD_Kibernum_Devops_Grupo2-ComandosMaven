
package cl.TalentoDigitalKibernum;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Collectors;

public class App {
  private static final Logger LOGGER = Logger.getLogger(App.class.getName());

  public static void main( String[] args ) {
    LOGGER.info("Hello Maven-Jenkins Grupo2 :D");

    LOGGER.info("prueba cristian cambio a jenkins");

    LOGGER.info("Gabriel paso por acá again");
    
    String[] letters = {"a", "b", "d"};
    Arrays.asList(letters).forEach( LOGGER::info );
  }

  public String arrayString() {
    return Arrays.asList( "a", "b", "d" ).stream().collect(Collectors.joining(""));
  }
}
/** comentando comentando **/
