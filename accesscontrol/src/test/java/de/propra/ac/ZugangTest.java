package de.propra.ac;

import de.propra.ac.network.Action;
import de.propra.ac.network.Netzwerk;
import de.propra.ac.scanner.PersonCategory;
import de.propra.ac.scanner.Scanner;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.mockito.Mockito.*;

public class ZugangTest {

    @Test
    void Test10Minuten() {

        Netzwerk n1 = mock(Netzwerk.class);
        when(n1.receiveMessageBlocking()).thenReturn(Action.ENTER);
        when(n1.readyToReceive()).thenReturn(true);

        Scanner s1 = mock(Scanner.class);
        when(s1.personWantsToEnter()).thenReturn(true);
        when(s1.scanCertificate()).thenReturn(true);
        when(s1.covidNegativeCertificate()).thenReturn(true);
        when(s1.certificateDate()).thenReturn(LocalDateTime.now().minusMinutes(10));
        when(s1.category()).thenReturn(PersonCategory.ANGESTELLT).thenReturn(null);

        Zugangspunkt z = new Zugangspunkt(10, 3, 0, n1, s1);
        z.start();

        verify(s1, times(1)).allowAccess();

    }
}
