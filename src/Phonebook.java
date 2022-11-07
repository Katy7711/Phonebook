import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {

    private String name;
    private final String number;


    private static final Map<String, String> phonebook = new HashMap<>();

    public Phonebook(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public void putPhonebook(HashMap phonebook) {
        this.name = phonebook.getOrDefault(this, new String());

    }
}









