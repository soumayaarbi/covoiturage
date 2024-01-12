package tn.esprit.services;

import java.sql.SQLException;
import java.util.List;

public interface CRUD<T> {
boolean insert(T t) throws SQLException;
    boolean update(T t);
    boolean delete(T t);
    List<T> selectAll();
}
