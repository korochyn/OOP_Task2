По аналогии с интерфейсами Speakable с методом speak() и Goable с методом getGoSpeed() созданы интерфейсы Flyable с методом getFlySpeed(), Swimable с методом  getSwimSpeed().
Интерфейсы имплементированы в нужные обьекты.
В классе VeterinaryClinic  добавлены методы определения списков пациентов по их способностям (ходьба, плаваниье, полет, издание звуков)
Создан абстрактный класс Staff (персонал) от которого наследуются классы Doctor, Nurse, NurseProcedural.
Созданы интефейсы Treatment, Medicines, Procedures имплементированные в классы Doctor, Nurse, NurseProcedural.
в VeterinaryClinic добавлены методы учета персонала - всех и по профессиям с возможностью организации персонала в "команды" (медсестра и врач)