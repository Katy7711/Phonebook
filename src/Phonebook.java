import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private static final Map<String, String> phonebook = new HashMap<>();

    public void putPersonNumber(Person person) {
        phonebook.put(person.getName(), person.getNumber());

    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Телефонный справочник:").append('\n');
        stringBuilder.append(phonebook).append('\n');
        return stringBuilder.toString();
    } // подскажите как сделать правильно в StringBuilder чтобы каждое значение было с новой строки?

}










