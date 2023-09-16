package com.team.pj.book.model;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDAO {
    List<BookVO> selectBook();
}