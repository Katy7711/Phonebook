public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("Иванов Иван", "89546787654");
        Person person2 = new Person("Иванова Анна", "89546445754");
        Person person3 = new Person("Петров Сергей", "89546753654");
        Person person4 = new Person("Петрова Ольга", "89546787678");
        Person person5 = new Person("Кошкин Андрей", "85676787654");
        Person person6 = new Person("Кошкина Лилия", "89546785684");
        Person person7 = new Person("Волков Дмитрий", "89523347654");
        Person person8 = new Person("Кошкина Лилия", "89546785684");
        Person person9 = new Person("Волков Дмитрий", "89523347654");
        Person person10 = new Person("Волкова Наталья", "89546677854");
        Person person11 = new Person("Хомячков Алексей", "89546269554");
        Person person12 = new Person("Котов Максим", "895462788954");
        Person person13 = new Person("Котова Ирина", "895462568565");
        Person person14 = new Person("Медведев Игорь", "89546345674");
        Person person15 = new Person("Медведева Татьяна", "89546787324");
        Person person16 = new Person("Рыбина Светлана", "895424567654");
        Person person17 = new Person("Иванов Иван", "89546787654");
        Person person18 = new Person("Иванов Иван", "89546787654");
        Person person19 = new Person("Иванов Иван", "89546787654");
        Person person20 = new Person("Иванов Иван", "89546787654");



        Phonebook.putPhonebook("Иванов Иван", "89546787654");
        Phonebook.putPhonebook("Иванова Анна", "89546445754");
        Phonebook.putPhonebook("Петров Сергей", "89546753654");
        Phonebook.putPhonebook("Петрова Ольга", "89546787678");
        Phonebook.putPhonebook("Кошкин Андрей", "85676787654");
        Phonebook.putPhonebook("Кошкина Лилия", "89546785684");
        Phonebook.putPhonebook("Волков Дмитрий", "89523347654");
        Phonebook.putPhonebook("Волкова Наталья", "89546677854");
        Phonebook.putPhonebook("Хомячков Алексей", "89546269554");
        Phonebook.putPhonebook("Котов Максим", "895462788954");
        Phonebook.putPhonebook("Котова Ирина", "895462568565");
        Phonebook.putPhonebook("Медведев Игорь", "89546345674");
        Phonebook.putPhonebook("Медведева Татьяна", "89546787324");
        Phonebook.putPhonebook("Рыбина Светлана", "895424567654");

        System.out.println(phonebook.get("Иванов Иван"));








    }
}