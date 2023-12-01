package Task2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(); // экземпляр класса
        Cat cat1 = new Cat("bort", new Illness("ch3"), "petr",
                LocalDate.of(3, 12, 21));
        cat.setName("barsic");
        // System.out.println(cat.getName());
        Dog dog = new Dog("max", new Illness("gyj123"), "petr",
                LocalDate.of(3, 12, 21));
        Fish fish = new Fish("Ora", new Illness("ch4"), "vasa", LocalDate.of(3, 02, 21));
        Duck duck = new Duck("Ara", new Illness("3ch4"), "sasa", LocalDate.of(13, 02, 21));
        System.out.println("Действия пациентов");
        cat.go();
        cat.speak();
        System.out.println("____________________________");
        dog.go();
        dog.speak();
        System.out.println("____________________________");
        duck.go();
        duck.swim();
        duck.fly();
        System.out.println("____________________________");
        dog.speak();
        dog.go();
        cat.speak();
        cat.go();
        System.out.println("____________________________");
        fish.swim();
        // double d = fish.getSwimSpeed();
        System.out.println(fish.getSwimSpeed());
        System.out.println("____________________________");
        VeterinaryClinic clinic = new VeterinaryClinic();
        clinic.addPatient(cat).addPatient(dog).addPatient(duck).addPatient(fish).addPatient(cat1);
        System.out.println("Учет пациентов");
        System.out.println(clinic.getPatients());
        System.out.println("Пациенты способные ходить");
        System.out.println(clinic.getGoable());
        System.out.println("Пациенты способные плавать");
        System.out.println(clinic.getSwimable());
        System.out.println("Пациенты способные летать");
        System.out.println(clinic.getFlyable());
        System.out.println("Пациенты способные издавать звуки");
        System.out.println(clinic.getSpeakable());

        Doctor doktor1 = new Doctor(100, "Иван", "Иванов", LocalDate.of(1985, 10, 14), 9000.3);
        Doctor doktor2 = new Doctor(101, "Петр", "Петров", LocalDate.of(1990, 1, 10), 8000.6);

        Nurse nurse1 = new Nurse(102, "Мария", "Смирнова", LocalDate.of(2000, 3, 10), 3000.3);
        Nurse nurse2 = new Nurse(103, "Ирина", "Сидорова", LocalDate.of(2001, 3, 10), 3100.3);

        NurseProcedural nurseprocedural1 = new NurseProcedural(104, "Марина", "Сидорова-Смирнова",
                LocalDate.of(2002, 3, 10),
                3200.3);
        NurseProcedural nurseprocedural2 = new NurseProcedural(105, "Карина", "Иванова-Петрова",
                LocalDate.of(2003, 3, 10),
                3300.3);
        System.out.println("Работа персонала");
        doktor1.treatment();
        doktor2.treatment();
        nurse1.medicin();
        nurse2.medicin();
        nurseprocedural1.procedur();
        nurseprocedural2.procedur();
        System.out.println("Учет персонала");
        clinic.addStaff(doktor1).addStaff(doktor2).addStaff(nurse1).addStaff(nurse2).addStaff(nurseprocedural1)
                .addStaff(nurseprocedural2);
        System.out.println("Список докторов");
        System.out.println(clinic.getDoctor());
        System.out.println("Список медсестер");
        System.out.println(clinic.getNurse());
        System.out.println("Список процедурных  медсестер");
        System.out.println(clinic.getProceduresNurse());
        System.out.println("Список команд");
        nurse1.setDoctorN(doktor2);
        System.out.println(nurse1 + "  " + nurse1.getDoctorN());
        nurse2.setDoctorN(doktor1);
        System.out.println(nurse2 + "  " + nurse2.getDoctorN());


    }
}
