package com.example.fund.common.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@EntityListeners(AuditingEntityListener.class)
@MappedSuperclass
@Getter
public abstract class BaseEntity {
   @CreatedDate
   @Column(name="regdate", updatable = false)
   private LocalDateTime regDate;

   @LastModifiedDate
   @Column(name="moddate")
   private LocalDateTime modDate;
}
