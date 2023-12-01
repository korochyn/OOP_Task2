package Task2;
import java.time.LocalDate;
public class Doctor extends Staff implements Treatment {

    public Doctor() {
        super();
    }

    public Doctor(Integer idStaff, String nameStaff, String surnameStaff, LocalDate birthdayStaff, Double salary) {
        super(idStaff,  nameStaff,  surnameStaff, birthdayStaff, salary);
        }


    @Override
    public void treatment() {
System.out.println(getClass().getSimpleName()+ " " + this.surnameStaff + " " + this.nameStaff + " Произвел осмотр пациента и назначил лекарства и процедуры");
    }
    
}
