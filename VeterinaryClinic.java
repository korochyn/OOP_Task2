package Task2;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    private List<Animal> patients = new ArrayList<>();
    private List<Staff> staffs = new ArrayList<>();

    // методы для работы с пациентами
    public List<Animal> getPatients() {
        return patients;
    }
    // public void addPatient(Animal patient){
    // patients.add(patient);
    // }

    public VeterinaryClinic addPatient(Animal patient) {

        return this;
    }

    public void removePatient(Animal patient) {
        patients.remove(patient);
    }

    public List<Goable> getGoable() {
        List<Goable> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Goable) {
                result.add((Goable) animal);
            }
        }
        return result;
    }

    public List<Swimable> getSwimable() {
        List<Swimable> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Swimable) {
                result.add((Swimable) animal);
            }
        }
        return result;
    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Flyable) {
                result.add((Flyable) animal);
            }
        }
        return result;
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<>();
        for (Animal animal : patients) {
            if (animal instanceof Speakable) {
                result.add((Speakable) animal);
            }
        }
        return result;
    }

    // Методы для работы с персоналом
    public List<Staff> getStaff() {
        return staffs;
    }

    public VeterinaryClinic addStaff(Staff staff) {
        staffs.add(staff);
        return this;
    }

    public void removeStaff(Staff staff) {
        staffs.remove(staff);
    }

    public List<Treatment> getDoctor() {
        List<Treatment> result = new ArrayList<>();
        for (Staff staff : staffs) {
            if (staff instanceof Treatment) {
                result.add((Treatment) staff);
            }
        }
        return result;
    }

    public List<Medicines> getNurse() {
        List<Medicines> result = new ArrayList<>();
        for (Staff staff : staffs) {
            if (staff instanceof Medicines) {
                result.add((Medicines) staff);
            }
        }
        return result;
    }

    public List<Procedures> getProceduresNurse() {
        List<Procedures> result = new ArrayList<>();
        for (Staff staff : staffs) {
            if (staff instanceof Procedures) {
                result.add((Procedures) staff);
            }
        }
        return result;
    }

}
