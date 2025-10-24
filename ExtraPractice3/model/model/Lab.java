package model;

import java.util.ArrayList;

public class Lab {
                       //Polymorphism
    private ArrayList<LabEquipment> labEquipment;

    public Lab () {
        this.labEquipment = new ArrayList<>();
    }
    public LabEquipment getLabEquipment (int index) {
        return (this.labEquipment.get(index)).clone();
    }
    public void setLabEquipment(int index, LabEquipment labEquipment) {
        this.labEquipment.set(index, labEquipment.clone());
    }
    public void addLabEquipment(LabEquipment labEquipment) {
        this.labEquipment.add(labEquipment.clone());
    }
}
