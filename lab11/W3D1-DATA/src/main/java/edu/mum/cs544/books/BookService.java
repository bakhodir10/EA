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
        return bookDao.findAll();
    }

    public void add(Book car) {
        bookDao.save(car);
    }

    public Book get(Long id) {
        return bookDao.findById(id).get();
    }

    public void update(Book car) {
        bookDao.save(car);
    }

    public void delete(Long id) {
        bookDao.deleteById(id);
    }
}