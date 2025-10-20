public class FilmsManager {
    private Films[] catalogFilms = new Films[0];
    private int count;

    public FilmsManager() {
        count = 5;
    }

    public FilmsManager(int count) {
        this.count = count;
    }

    public void saveFilms(Films film) {
        Films[] tmp = new Films[catalogFilms.length + 1];
        for (int i = 0; i < catalogFilms.length; i++) {
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
        if (count != 5) {
            reversed = new Films[count];
        } else {
            reversed = new Films[5];
        }
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = catalogFilms[catalogFilms.length - 1 - i];
        }
        return reversed;
    }


}
