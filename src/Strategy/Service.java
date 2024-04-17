package Strategy;

import java.util.List;

public interface Service<T> {
    T create(T newItem);
    T update(T item);
    List<T> listAll();
    String delete(T item);


}
