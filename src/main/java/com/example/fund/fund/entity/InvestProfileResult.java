package com.example.fund.fund.entity;

import java.time.LocalDateTime;

import com.example.fund.user.entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "invest_profile_result")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class InvestProfileResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resultId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // 선택한 옵션 정보: { "1": 2, "2": 3, "3": [1, 4] } 등 JSON 형태
    @Lob
    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String answerSnapshot;

    @Column(nullable = false)
    private int totalScore;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_id", nullable = false)
    private InvestProfileType type;

    @Column(nullable = false)
    private LocalDateTime analysisDate;

    private LocalDateTime signedAt;
}
