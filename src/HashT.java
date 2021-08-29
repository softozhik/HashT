import java.util.ArrayList;
import java.util.LinkedList;

public class HashT {

    private final int TABLE_SIZE = 16;

    // инициализация основной таблицы пустыми корзинами
    private final ArrayList<LinkedList<Model>> table = new ArrayList<>(TABLE_SIZE);
    public HashT() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            table.add(i, new LinkedList<>());
        }
    }

    // получаем объект из входных данных
    private Model model(String key, String value) {
        return new Model(key, value);
    }

    // получаем номер корзины по ключу
    private int bucketNum(String key) {
        return key.hashCode() % TABLE_SIZE;
    }

    // добавление нового объекта в нужную корзину
    public void add(String key, String value) {
        if (find(key, value)) return;
        table.get(bucketNum(key)).add(model(key, value));
    }

    // удаление объекта
    public void delete(String key, String value) {
        if (!find(key, value)) return;
        table.get(bucketNum(key)).remove(model(key, value));
    }

    // поиск объекта
    public boolean find(String key, String value) {
        return table.get(bucketNum(key)).contains(model(key, value));
    }

    public ArrayList<Model> findAllByKey(String key) {
        ArrayList<Model> equalKeys = new ArrayList<>();
        for (Model m : table.get(bucketNum(key))) {
            if (m.getKey().equals(key)) equalKeys.add(m);
        }
        return equalKeys;
    }

    public ArrayList<LinkedList<Model>> showAll() {
        return table;
    }

}
