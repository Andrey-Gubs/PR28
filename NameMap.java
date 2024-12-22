import java.util.HashMap;
import java.util.Map;

public class NameMap {

    // Метод, который создает и возвращает HashMap с данными
    public Map<String, String> createMap() {
        Map<String, String> peopleMap = new HashMap<>();

        // Добавление 10 записей (фамилия, имя)
        peopleMap.put("Губский", "Андрей");
        peopleMap.put("Петров", "Петр");
        peopleMap.put("Сиделников", "Иван");
        peopleMap.put("Столяров", "Алексей");
        peopleMap.put("Иванов", "Сергей");
        peopleMap.put("Кузнецовский", "Андрей");
        peopleMap.put("Лебедев", "Артемий");
        peopleMap.put("Попов", "Дмитрий");
        peopleMap.put("Трофимов", "Петр");
        peopleMap.put("Иванов", "Иван");
        return peopleMap;
    }

    // Метод для подсчета одинаковых имен
    public int getSameFirstNameCount(Map<String, String> map) {
        Map<String, Integer> firstNameCount = new HashMap<>();

        for (String firstName : map.values()) {
            firstNameCount.put(firstName, firstNameCount.getOrDefault(firstName, 0) + 1);
        }
        // Подсчет количества имен, которые встречаются более одного раза
        int count = 0;
        for (int num : firstNameCount.values()) {
            if (num > 1) {
                count += num;
            }
        }
        return count;
    }

    // Метод для подсчета одинаковых фамилий
    public int getSameLastNameCount(Map<String, String> map) {
        Map<String, Integer> lastNameCount = new HashMap<>();
        for (String lastName : map.keySet()) {
            lastNameCount.put(lastName, lastNameCount.getOrDefault(lastName, 0) + 1);
        }

        // Подсчет количества фамилий, которые встречаются более одного раза
        int count = 0;
        for (int num : lastNameCount.values()) {
            if (num > 1) {
                count += num;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        NameMap nameMap = new NameMap();
        Map<String, String> map = nameMap.createMap();
        int sameFirstNames = nameMap.getSameFirstNameCount(map);
        int sameLastNames = nameMap.getSameLastNameCount(map);
    }
}

