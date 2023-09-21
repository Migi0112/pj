package com.team.pj.book.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookDAO bookDao;

    @Override
    public List<BookVO> selectBook() {
        return bookDao.selectBook();
    }
}