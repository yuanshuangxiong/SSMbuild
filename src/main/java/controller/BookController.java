package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pojo.Books;
import service.BookServiceImpl;
import service.BooksService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    @Qualifier("BookServiceImpl")
    private BooksService booksService;

    //查询全部书籍
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list=booksService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";
    }
    //跳转到添加书籍界面
    @RequestMapping("/toAddBook")
    public String toAddPage(){
        return "addBook";

    }

    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>"+books);
        booksService.addBook(books);
        return "redirect:/book/allBook";//重定向到allBook界面
    }

    //跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePage(int id,Model model){
        Books books=booksService.queryBookById(id);
        System.out.println("QBook=>"+books);
        model.addAttribute("QBook",books);
        return "updateBook";
    }

    //修改书籍
    @RequestMapping("/updateBook")
    public String udpateBook(Books books){
        System.out.println("updateBook=>"+books);
        booksService.updateBook(books);
        //回到主页
        return "redirect:/book/allBook";
    }

    //删除书籍
    @RequestMapping("/deleteBook/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
        int res=booksService.deleteBookById(id);
        System.out.println("删除书籍结果："+res);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("/queryBook")
    public String queryBook(String queryBookName,Model model){
        Books books=booksService.queryBookByName(queryBookName);
        //如果查询书籍为空
        List<Books>list=new ArrayList<Books>();
        list.add(books);
        if(books==null){
            list=booksService.queryAllBook();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);
        System.out.println("queryBookByName=>"+books);
        return "allBook";

    }
















}
