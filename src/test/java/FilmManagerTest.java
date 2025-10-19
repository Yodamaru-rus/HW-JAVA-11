import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmsManager manager = new FilmsManager();
    FilmsManager managerTwo = new FilmsManager();

    Films item1 = new Films("Вперед", "Мультфильм", "https://i.pinimg.com/550x/23/75/4b/23754b0b1fc5d35c1ee3159ae7cf6acc.jpg");
    Films item2 = new Films("Отель \"Белград\"", "Комедия", "https://avatars.dzeninfra.ru/get-zen_doc/271828/pub_653d31cb0adfb46cc4c935f8_653d31e35109d81c967220b6/scale_1200");
    Films item3 = new Films("Джентельмены", "Боевик", "https://images.kinorium.com/movie/poster/1670490/w1500_52002354.jpg");
    Films item4 = new Films("Человек-Невидимка", "Ужасы", "https://avatars.mds.yandex.net/i?id=3f30d0cbb1e5e6977b3f88670c4ce5a93bd77e45-7132164-images-thumbs&n=13");
    Films item5 = new Films("Тролли.Мировой Тур", "Мультфильм", "https://cdn.kobo.com/book-images/be6ac3bb-2dd1-475e-898d-5798d6d1b039/1200/1200/False/trolls-world-tour-big-golden-book-dreamworks-trolls-world-tour.jpg");
    Films item6 = new Films("Номер один", "Комедия", "https://static.kinoafisha.info/k/movie_posters/220/upload/movie_posters/8/5/6/8356658/90aa52dcda5d7c76aed029c8b023a700.jpeg");
    Films item7 = new Films("Бладшот", "Боевик", "https://i08.fotocdn.net/s214/82a7bf5ec1b9b9d8/public_pin_l/2881578477.jpg");
    Films item8 = new Films("Тайная жизнь домашних животных 2", "Мультфильм", "https://i.pinimg.com/736x/82/83/d6/8283d61ed0bbec9e051d2f88a45897a2.jpg");

    @BeforeEach
    public void setup() {
        manager.saveFilms(item1);
        manager.saveFilms(item2);
        manager.saveFilms(item3);
        manager.saveFilms(item4);
        manager.saveFilms(item5);
        manager.saveFilms(item6);
        manager.saveFilms(item7);
        manager.saveFilms(item8);
        managerTwo.saveFilms(item7);
        managerTwo.saveFilms(item8);



    }

    @Test
    public void findElement() {
        Films[] expected = {item1, item2, item3, item4, item5, item6, item7, item8};

        Films[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFive() {
        Films[] expected = {item8, item7, item6, item5, item4};

        Films[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastSelect() {
        Films[] expected = {item8, item7, item6};

        Films[] actual = manager.findLast(3);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastFiveTwo() {
        Films[] expected = {item8, item7};

        Films[] actual = managerTwo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastSelectTwo() {
        Films[] expected = {item8, item7};

        Films[] actual = managerTwo.findLast(3);

        Assertions.assertArrayEquals(expected, actual);
    }


}
