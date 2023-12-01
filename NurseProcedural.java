package Task2;

import java.time.LocalDate;

public class NurseProcedural extends Staff implements Procedures {

    public NurseProcedural() {
        super();
    }

    public NurseProcedural(Integer idStaff, String nameStaff, String surnameStaff, LocalDate birthdayStaff,
            Double salary) {
        super(idStaff, nameStaff, surnameStaff, birthdayStaff, salary);
    }

    @Override
    public void procedur() {
        System.out.println(getClass().getSimpleName()+ " " + this.surnameStaff + " " + this.nameStaff + " сделала укол пациенту");
    }

}
