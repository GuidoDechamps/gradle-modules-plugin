package examples.greeter;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;

// org.mockito.exceptions.base.MockitoException:
// Mockito cannot mock this class: class examples.greeter.AddReadsTest$Dummy.
//
// Mockito can only mock non-private & non-final classes.
// If you're not sure why you're getting this error, please report to the mailing list.
//
//
//Java               : 13
//JVM vendor name    : AdoptOpenJDK
//JVM vendor version : 13.0.2+8
//JVM name           : OpenJDK 64-Bit Server VM
//JVM version        : 13.0.2+8
//JVM info           : mixed mode
//OS name            : Mac OS X
//OS version         : 10.15.2
//
//
// Underlying exception : org.mockito.exceptions.base.MockitoException:
// Could not force module adjustment of the module of class examples.greeter.AddReadsTest$Dummy
//
// This is required to adjust the module graph to enable mock creation
public class UseMockitoTest {


    @Test
    @Disabled("This fails with the above error. ")
    void addMockitoToReadsTest() {
        final Dummy mock = Mockito.mock(Dummy.class);
        assertThat(mock).isNotNull();
    }

    public static class Dummy {

    }
}
