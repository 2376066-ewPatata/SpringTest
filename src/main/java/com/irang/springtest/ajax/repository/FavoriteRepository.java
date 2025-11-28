package com.irang.springtest.ajax.repository;

import com.irang.springtest.ajax.domain.Favorite;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FavoriteRepository {

    public List<Favorite> selectFavoriteList();

    public int insertFavorite(
            @Param("name") String name
            , @Param("url") String url);

    public int countFavoriteByUrl(@Param("url") String url);

    public int deleteFavorite(@Param("id") int id);

}