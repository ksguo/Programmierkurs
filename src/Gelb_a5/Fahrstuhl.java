package Gelb_a5;

import java.util.ArrayList;

public class Fahrstuhl {

    private ArrayList<Person> inside;
    private ArrayList<Person> outside;

    public ArrayList<Person> getInside() {
        return inside;
    }

    public void setInside(ArrayList<Person> inside) {
        this.inside = inside;
    }

    public ArrayList<Person> getOutside() {
        return outside;
    }

    public void setOutside(ArrayList<Person> outside) {
        this.outside = outside;
    }



    public void goTo(int floor) {
        // Bereitet die temporären Listen für Personen vor, die bewegt werden sollen
        ArrayList<Person> toMoveInside = new ArrayList<>();
        ArrayList<Person> toMoveOutside = new ArrayList<>();

        // Durchläuft outside von hinten, um Personen nach inside zu bewegen
        for (int i = outside.size() - 1; i >= 0; i--) {
            Person p = outside.get(i);
            if (p.getLoc() == floor) {
                toMoveInside.add(p);
                p.setLoc(-1); // Setzt den Standort auf -1, da die Person nun im Fahrstuhl ist
                outside.remove(i); // Entfernt die Person sofort aus outside
            }
        }

        // Fügt alle gesammelten Personen zu inside hininzu
        inside.addAll(toMoveInside);

        // Durchläuft inside von hinten, um Personen nach outside zu bewegen
        for (int i = inside.size() - 1; i >= 0; i--) {
            Person p = inside.get(i);
            if (p.getDest() == floor) {
                toMoveOutside.add(p);
                p.setLoc(floor); // Setzt den Standort auf den aktuellen floor
                inside.remove(i); // Entfernt die Person sofort aus inside
            }
        }

        // Fügt alle gesammelten Personen zu outside hinzu
        outside.addAll(toMoveOutside);
    }


}
