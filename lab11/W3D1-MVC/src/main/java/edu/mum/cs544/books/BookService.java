package edu.mum.cs544.books;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class BookService {
    @Resource
    private IBookDao bookDao;

    public List<Book> getAll() {
        return bookDao.getAll();
    }

    public void add(Book car) {
        bookDao.add(car);
    }

    public Book get(int id) {
        return bookDao.get(id);
    }

    public void update(Book car) {
        bookDao.update(car);
    }

    public void delete(int id) {
        bookDao.delete(id);
    }
}