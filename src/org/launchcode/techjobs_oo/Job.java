package org.launchcode.techjobs_oo;

//import org.launchcode.techjobs_oo.*;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
//    private Job ;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString() {
        if (name == " " || name == null) {
            setName("Data not available");
        }
        if (employer.getValue() == "" || employer.getValue() == null) {
            employer.setValue("Data not available");
        }
        if (location.getValue() == "" || location.getValue() == null) {
            location.setValue("Data not available");
        }
        if (positionType.getValue() == " " || positionType.getValue() == null) {
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue() == " " || coreCompetency.getValue() == null) {
            coreCompetency.setValue("Data not available");
        }

         String expectedReturnFormat = String.format("\nID: %d\n" + "Name: %s\n" + "Employer: %s\n" + "Location: %s\n" + "Position Type: %s\n" + "Core Competency: %s\n", id, name, employer, location, positionType, coreCompetency);
        return expectedReturnFormat;
    }


//    @Override
//    public String toString() {
//        String blankLine = " ";
//
//
//
////
//
//        for (int i = 0; i < test.size(); i++) {
//
//        }
//        //TODO put all instance label in arrayList
//                return blankLine + test + blankLine;
//    }



//     for (String inst : InstanceClass) {
//        String someVar = get.inst;
//        if (!someVar == null) {
//            test.inst = someVar;
//        }
//    }


//    Class childClass = getClass();
//        for (Field key : childClass.getFields()) {
//            test += key + ": " + key.getName() + "\n";
//        }
//        return test;
//        if (getName() == null)
//        return (blankLine + "ID: " + id + "\n" + "Name: " + name + "Employer: " + employer + "Location: " + location + "Position Type: " + positionType + "Core Competency: " + coreCompetency + blankLine);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job that = (Job) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
