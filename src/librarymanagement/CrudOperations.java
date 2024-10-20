package librarymanagement;

public interface CrudOperations<T> {
    void add(T item);
    void update(T item);
    void delete(int id);
    void view();
}
