package interfaces;

import java.util.List;

public interface Rest<T> {

    List<T> findAll();

    T findOne(int index);

    void create(T t);

    void remove(T t);
}
