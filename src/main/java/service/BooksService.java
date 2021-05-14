package service;

import org.apache.ibatis.annotations.Param;
import pojo.Books;

import java.util.List;

public interface BooksService {
    public int addBook(Books books);

    public int deleteBookById(int id);

    public int updateBook(Books books);

    public Books queryBookById(int id);

    public List<Books> queryAllBook();

    public Books queryBookByName(String bookName);
}
