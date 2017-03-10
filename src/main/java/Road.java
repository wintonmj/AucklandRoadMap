package main.java;

import java.util.ArrayList;

/**
 * Created by wintonnmj on 9/03/17.
 */
public class Road {

    int roadID;
    int roadType;
    String label;
    String city;
    boolean oneWay;
    int speed;
    int roadClass;
    boolean notForCar;
    boolean notForPede;
    boolean notForBicy;

    ArrayList<Node> nodes = new ArrayList<Node>();
    ArrayList<Segments> segmentses = new ArrayList<Segments>();

    public Road(int ID, int RT, String name, String City, boolean OW, int spd, int RC, boolean NFC, boolean NFP, boolean NFB){
        this.roadID = ID;
        this.roadType = RT;
        this.label = name;
        this.city = City;
        this.oneWay = OW;
        this.speed = spd;
        this.roadClass = RC;
        this.notForCar = NFC;
        this.notForPede = NFP;
        this.notForBicy = NFB;
    }

    public int getRoadID() {
        return roadID;
    }

    public ArrayList<Node> getNodes() {
        return nodes;
    }

    public ArrayList<Segments> getSegmentses() {
        return segmentses;
    }

    public boolean isNotForBicy() {
        return notForBicy;
    }

    public boolean isNotForCar() {
        return notForCar;
    }

    public boolean isNotForPede() {
        return notForPede;
    }

    public boolean isOneWay() {
        return oneWay;
    }

    public int getRoadClass() {
        return roadClass;
    }

    public int getRoadType() {
        return roadType;
    }

    public int getSpeed() {
        return speed;
    }

    public String getCity() {
        return city;
    }

    public String getLabel() {
        return label;
    }
}