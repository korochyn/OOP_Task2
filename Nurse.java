package Task2;

import java.time.LocalDate;

public class Nurse extends Staff implements Medicines {
    public Doctor doctorN;
  
    public Nurse() {
        super();
    }

    public Nurse(Integer idStaff, String nameStaff, String surnameStaff, LocalDate birthdayStaff, Double salary) {
        super(idStaff, nameStaff, surnameStaff, birthdayStaff, salary);
    }

    public Nurse(Integer idStaff, String nameStaff, String surnameStaff, LocalDate birthdayStaff, Double salary, Doctor doctor) {
        super(idStaff, nameStaff, surnameStaff, birthdayStaff, salary);
        this.doctorN = doctorN;
    }


    public Doctor getDoctorN() {
            return doctorN;
    }
     public void setDoctorN(Doctor doctorN) {
        this.doctorN = doctorN;
    }
 




    @Override
    public void medicin() {
        System.out.println(getClass().getSimpleName()+ " " + this.surnameStaff + " " + this.nameStaff + " выдала лекарства пациенту");
    }

    // @Override
    // public String toString() {
    //     return "Nurse" +this.surnameStaff + " " + this.nameStaff + "[doctorN=" + doctorN.surnameStaff  + "]";
    // }

}
