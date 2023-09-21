package com.team.pj.book.model;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface BookDAO {
    List<BookVO> selectBook();
}