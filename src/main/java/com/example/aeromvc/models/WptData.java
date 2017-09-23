package com.example.aeromvc.models;

import java.util.ArrayList;

public class WptData {
    static ArrayList<Wpt> waypoints = new ArrayList<>();

    public static ArrayList<Wpt> getAll() {
        return waypoints;
    }

    public static void add(Wpt newWpt) {
        waypoints.add(newWpt);
    }

    public static void remove(int id) {
        Wpt wptToDelete = getById(id);
        waypoints.remove(wptToDelete);
    }

    //get by ID
    public static Wpt getById(int id) {
        Wpt theWpt = null;
        for (Wpt candidateWpt : waypoints) {
            if (candidateWpt.getWptid() == id) {
                theWpt = candidateWpt;
            }
        }
        return theWpt;
    }
}
