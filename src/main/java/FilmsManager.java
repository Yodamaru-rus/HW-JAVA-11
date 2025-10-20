public class FilmsManager {
    private Films[] catalogFilms;

    public FilmsManager() {
        catalogFilms = new Films[5];
    }

    public FilmsManager(int count) {
        catalogFilms = new Films[count];
    }

    public void saveFilms(Films film) {
        Films[] tmp = new Films[catalogFilms.length + 1];
        for (int i = 0; i < catalogFilms.length; i++) {
            if (catalogFilms[i] == null) {
                catalogFilms[i] = film;
                return;
            }
            tmp[i] = catalogFilms[i];
        }
        tmp[tmp.length - 1] = film;
        catalogFilms = tmp;
    }

    public Films[] findAll() {
        return catalogFilms;
    }

    public Films[] findLast() {
        Films[] reversed;
        if (catalogFilms.length != 5) {
            reversed = new Films[catalogFilms.length];
        } else {
            reversed = new Films[5];
        }
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = catalogFilms[catalogFilms.length - 1 - i];
        }
        return reversed;
    }


}
