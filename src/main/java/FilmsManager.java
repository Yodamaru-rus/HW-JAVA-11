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
        int reversedLength;
        if (count > catalogFilms.length) {
            reversedLength = catalogFilms.length;
        } else {
            reversedLength = count;
        }
        Films[] reversed = new Films[reversedLength];
        for (int i = 0; i < reversedLength; i++) {
            reversed[i] = catalogFilms[catalogFilms.length - 1 - i];
        }
        return reversed;
    }


}
