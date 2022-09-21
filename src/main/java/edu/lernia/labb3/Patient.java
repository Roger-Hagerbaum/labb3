package edu.lernia.labb3;

public class Patient {
    private String name;
    private String disease;
    private boolean isSick;
    public Patient(String name, String disease) {
        this.name = name;
        this.disease = disease;
        isSick = true;
    }

    public Patient(String name) {
        this.name = name;
    }

    public boolean isSick() {

       return isSick;
    }

    public String getSickness() {
        return this.disease;
    }

    public String getName() {
     return this.name;
    }

    public void takeMedication(Medicine medicine) {
        if (medicine.getTreatmentName().equals(this.disease)) {
        isSick = false;
        this.disease = null;
        }
    }
}
