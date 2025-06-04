package cz.czechitas.ukol06.svatky;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.MonthDay;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SvatkySluzbaTest {

    @Test
    void vyhledatSvatkyKeDni() throws IOException {
        //TODO implementovat test metody vyhledatSvatkyKeDni

        SvatkySluzba svatkySluzba = new SvatkySluzba();

        List<String> svatekJednoJmeno = List.of("Mojmír");
        List<String> svatekTriJmena = List.of("Veronika", "Bereniké", "Verona");
        List<String> svatekBezeJmena = List.of();

        List<String> vysledek1 = svatkySluzba.vyhledatSvatkyKeDni(MonthDay.of(2, 10));
        List<String> vysledek3 = svatkySluzba.vyhledatSvatkyKeDni(MonthDay.of(2, 7));
        List<String> vysledek0 = svatkySluzba.vyhledatSvatkyKeDni(MonthDay.of(7, 6));

        assertEquals(svatekJednoJmeno, vysledek1);
        assertEquals(svatekTriJmena, vysledek3);
        assertEquals(svatekBezeJmena, vysledek0);
    }

}
