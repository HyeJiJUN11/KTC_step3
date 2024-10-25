package com.potatocake.everymoment.repository;

import com.potatocake.everymoment.entity.Diary;
import com.potatocake.everymoment.entity.DiaryCategory;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryCategoryRepository extends JpaRepository<DiaryCategory, Long> {
    List<DiaryCategory> findByCategoryId(Long categoryId);

    List<DiaryCategory> findByDiary(Diary diary);

    void deleteByDiary(Diary diary);
}
