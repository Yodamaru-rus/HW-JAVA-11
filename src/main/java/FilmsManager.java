public class FilmsManager {
    private Films[] catalogFilms = new Films[0];


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
        if (catalogFilms.length <= 5) {
            reversed = new Films[catalogFilms.length];
        } else {
            reversed = new Films[5];
        }
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = catalogFilms[catalogFilms.length - 1 - i];
        }
        return reversed;
    }

    public Films[] findLast(int count) {
        int resultLength;
        if (catalogFilms.length <= count) {
            resultLength = catalogFilms.length;
        } else {
            resultLength = count;
        }
        Films[] all = catalogFilms;
        Films[] reversed = new Films[resultLength];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = all[all.length - 1 - i];
        }
        return reversed;
    }


}
