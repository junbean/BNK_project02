package com.example.fund.admin.faq.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;

@Entity
@IdClass(FaqCategoryMapId.class)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FaqCategoryMap {
    @Id
    private Integer faqId;

    @Id
    private String category;
}