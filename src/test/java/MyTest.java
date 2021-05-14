import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.Books;
import service.BooksService;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        BooksService booksService= (BooksService) context.getBean("BookServiceImpl");
        for(Books books:booksService.queryAllBook()){
            System.out.println(books);
        }
    }
}
