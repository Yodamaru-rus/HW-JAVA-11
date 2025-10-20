import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class FilmManagerMockitoTest {

    FilmsManager managerEmpty = Mockito.mock(FilmsManager.class);
    FilmsManager managerUno = Mockito.mock(FilmsManager.class);

    Films item3 = new Films("Джентельмены", "Боевик", "https://images.kinorium.com/movie/poster/1670490/w1500_52002354.jpg");


    @Test
    public void findZeroElement() {
        Films[] expected = {};
        doReturn(expected).when(managerEmpty).findAll();

        Films[] actual = managerEmpty.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findUnoElement() {
        Films[] expected = {item3};
        doReturn(expected).when(managerUno).findAll();

        Films[] actual = managerUno.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastUno() {
        Films[] expected = {item3};
        doReturn(expected).when(managerUno).findLast();

        Films[] actual = managerUno.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastZero() {
        Films[] expected = {};
        doReturn(expected).when(managerEmpty).findLast();

        Films[] actual = managerEmpty.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

}