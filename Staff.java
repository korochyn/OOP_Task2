package Task2;

import java.time.LocalDate;

public abstract class Staff {

    protected Integer idStaff;
    protected String nameStaff;
    protected String surnameStaff;
    protected LocalDate birthdayStaff;
    protected Double salary;

    public Staff() {
    }

    public Staff(Integer idStaff, String nameStaff, String surnameStaff, LocalDate birthdayStaff, Double salary) {
        this.idStaff = idStaff;
        this.nameStaff = nameStaff;
        this.surnameStaff = surnameStaff;
        this.birthdayStaff = birthdayStaff;
        this.salary = salary;
    }

    public Integer getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(Integer idStaff) {
        this.idStaff = idStaff;
    }

    public String getNameStaff() {
        return nameStaff;
    }

    public void setNameStaff(String nameStaff) {
        this.nameStaff = nameStaff;
    }

    public String getSurnameStaff() {
        return surnameStaff;
    }

    public void setSurnameStaff(String surnameStaff) {
        this.surnameStaff = surnameStaff;
    }

    public LocalDate getBirthdayStaff() {
        return birthdayStaff;
    }

    public void setBirthdayStaff(LocalDate birthdayStaff) {
        this.birthdayStaff = birthdayStaff;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Staff [idStaff=" + idStaff + ", nameStaff=" + nameStaff + ", surnameStaff=" + surnameStaff
                + ", birthdayStaff=" + birthdayStaff + ", salary=" + salary + "]";
    }

}
