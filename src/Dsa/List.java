package Dsa;

public interface List {

    void add(String element);

    void remove(String element);

    void remove(int id);

    void add(String element, int id);

    int size();

    String get(int index);
}
