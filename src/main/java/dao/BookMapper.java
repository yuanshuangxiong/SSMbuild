package dao;

import org.apache.ibatis.annotations.Param;
import pojo.Books;

import java.util.List;

public interface BookMapper {
    public int addBook(Books books);

    public int deleteBookById(@Param("bookID")  int id);

    public int updateBook(Books books);

    public Books queryBookById(@Param("bookID") int id);

    public List<Books> queryAllBook();

    public Books queryBookByName(String bookName);


}
