package Gelb_a2;

public class Pass {
    private static int counter = 100;
    private String password;
    private String first;
    private boolean checked;
    private int page;

    // Konstruktor, der einen String name aufnimmt und diesen aufteilt
    public Pass(String name) {
        // Zerlegt den String anhand des Kommas und weist die Teile den Variablen zu
        String[] parts = name.split(",", 2);
        this.first = parts[0];
        // Wenn das erste Wort leer ist, weisen Sie first einen leeren String zu
        if (this.first.isEmpty()) {
            this.first = "";
        }
        // Setzt password auf das zweite Wort, wenn vorhanden
        this.password = parts.length > 1 ? parts[1].trim() : "";
        // Verringert counter um 2 bei jedem neuen Objekt
        counter -= 2;
    }

    // Konstruktor, der password, first und page direkt setzt
    public Pass(String password, String first, int page) {
        this.password = password;
        this.first = first;
        this.page = page;
        counter -= 2;
    }

    // Getter und Setter
    public static int getCounter() {
        return counter;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void passwordCheck() {
        // Prüft, ob das password mindestens 8 Zeichen lang ist
        boolean isLongEnough = this.password.length() >= 8;
        // Konvertiert page zu einem String und prüft, ob das password diesen Teilstring enthält
        boolean containsPage = this.password.contains(String.valueOf(this.page));

        // Setzt checked auf true, wenn das password lang genug ist und die Seitenzahl nicht enthält
        this.checked = isLongEnough && !containsPage;
    }

}
