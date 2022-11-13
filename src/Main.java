import java.util.*;

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

        Phonebook phonebook = new Phonebook();


        phonebook.putPersonNumber(person1);
        phonebook.putPersonNumber(person2);
        phonebook.putPersonNumber(person3);
        phonebook.putPersonNumber(person4);
        phonebook.putPersonNumber(person5);
        phonebook.putPersonNumber(person6);
        phonebook.putPersonNumber(person7);
        phonebook.putPersonNumber(person8);
        phonebook.putPersonNumber(person9);
        phonebook.putPersonNumber(person10);
        phonebook.putPersonNumber(person11);
        phonebook.putPersonNumber(person12);
        phonebook.putPersonNumber(person13);
        phonebook.putPersonNumber(person14);

        System.out.println(phonebook);


//        Задание 1.3:
        HashMap<String, Integer> arbitraryNumbers = new HashMap<>();
        arbitraryNumbers.put("Строка1", 1);
        arbitraryNumbers.put("Строка2", 2);
        arbitraryNumbers.put("Строка3", 3);
        arbitraryNumbers.put("Строка4", 4);
        arbitraryNumbers.put("Строка5", 5);
        arbitraryNumbers.put("Строка6", 6);
        System.out.println(arbitraryNumbers);

//        Задание 2.1

        Map<String, List<Integer>> collection = new HashMap<>();
        int i;
        for (i = 0; i < 5; i++) {
            Random random = new Random();
            i = random.nextInt(100000);
            List<Integer> integers = new ArrayList<>();
            integers.add(i);
            integers.add(i);
            integers.add(i);
            collection.put("стр1", integers);
            collection.put("стр2", integers);
            collection.put("стр3", integers);
            collection.put("стр4", integers);
            collection.put("стр5", integers);
            StringBuilder builder = new StringBuilder();
            builder.append(collection.entrySet());
            System.out.println(builder.toString()); }


//        Задание 2.2
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "строка1");
            map.put(2, "строка2");
            map.put(3, "строка3");
            map.put(4, "строка4");
            map.put(5, "строка5");
            map.put(6, "строка6");
            map.put(7, "строка7");
            map.put(8, "строка8");
            map.put(9, "строка9");
            map.put(10, "строка10");
            System.out.println(map);


        }
    }



//    метод к заданию 1.3
//    public static void addToCollection(Map<String, Integer> arbitraryNumbers) {
//        for (Map.Entry<String, Integer> numbers: arbitraryNumbers.entrySet())
//            if (arbitraryNumbers
//            throw new NumberAlreadyExistsException("Такой номер с таким значением уже существует");


//как тут сделать условие: Если такого ключа нет, то просто добавляет данные в коллекцию.
//Если такой ключ уже есть и значения совпадают, то необходимо бросить исключение.
//Если такой ключ уже есть, но значения разные, то обновите целое число в коллекции.












