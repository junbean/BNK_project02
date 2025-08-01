package com.example.fund.admin.faq.repository;

import com.example.fund.admin.faq.entity.FaqCategoryMap;
import com.example.fund.admin.faq.entity.FaqCategoryMapId;
import com.example.fund.admin.faq.repository.projection.FaqCategoryCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaqCategoryMapRepository extends JpaRepository<FaqCategoryMap, FaqCategoryMapId> {

    @Query("""
      SELECT m.category AS category,
             COUNT(m)    AS cnt
      FROM FaqCategoryMap m
      GROUP BY m.category
    """)
    List<FaqCategoryCount> countByCategory();

    /* faqId 로 매핑된 모든 카테고리 레코드 삭제 */
    void deleteByFaqId(Integer faqId);
}