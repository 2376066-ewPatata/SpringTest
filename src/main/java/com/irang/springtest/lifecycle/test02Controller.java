package com.irang.springtest.lifecycle;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@RequestMapping("/lifecycle/test02")
@RestController
public class test02Controller {

    @RequestMapping("/1")
    public ArrayList<Map<String, Object>> movie() {

        ArrayList<Map<String, Object>> movieList = new ArrayList<>();

        Map<String, Object> movie1 = new HashMap<>();
        movie1.put("rate: ", 15);
        movie1.put("director: ", "봉준호");
        movie1.put("time: ", 131);
        movie1.put("title: ", "기생충");
        movieList.add(movie1);

        Map<String, Object> movie2 = new HashMap<>();
        movie2.put("rate: ", 0);
        movie2.put("director: ", "로베르토베니니");
        movie2.put("time: ", 116);
        movie2.put("title: ", "인생은 아름다워");
        movieList.add(movie2);

        Map<String, Object> movie3 = new HashMap<>();
        movie3.put("rate: ", 12);
        movie3.put("director: ", "크리스토퍼놀란");
        movie3.put("time: ", 147);
        movie3.put("title: ", "인셉션");
        movieList.add(movie3);

        Map<String, Object> movie4 = new HashMap<>();
        movie4.put("rate: ", 19);
        movie4.put("director: ", "윤종빈");
        movie4.put("time: ", 133);
        movie4.put("title: ", "범죄와의전쟁:나쁜놈들전성시대");
        movieList.add(movie4);

        Map<String, Object> movie5 = new HashMap<>();
        movie5.put("rate: ", 15);
        movie5.put("director: ", "프란시스로렌스");
        movie5.put("time: ", 137);
        movie5.put("title: ", "헝거게임");
        movieList.add(movie5);


        return movieList;

    }


    @RequestMapping("/2")
    public ArrayList<BulletinBoard> notice(){

        ArrayList<BulletinBoard> noticeList = new ArrayList<>();

        BulletinBoard bb1 = new BulletinBoard("안녕하세요 가입인사 드립니다.", "hagulu", "안녕하세요.가입했어요.앞으로 잘 부탁드립니다. 활동 열심히 하겠습니다.");
        noticeList.add(bb1);

        BulletinBoard bb2 = new BulletinBoard("헐 대박", "bada", "오늘 목요일이었어 .. 금요일인 줄");
        noticeList.add(bb2);

        BulletinBoard bb3 = new BulletinBoard("오늘 데이트 한 이야기해드릴게요.", "dulumary", "....");
        noticeList.add(bb3);


        return noticeList;

    }

    @RequestMapping("/3")
    public ResponseEntity<BulletinBoard> singleNotice() {

        BulletinBoard bb = new BulletinBoard("오늘 데이트 한 이야기해드릴게요.", "dulumary", "....");

        ResponseEntity<BulletinBoard> entity = new ResponseEntity<>(bb, HttpStatus.INTERNAL_SERVER_ERROR);

        return entity;
    }




}
