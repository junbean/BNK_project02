package com.example.fund.fund.entity;

import java.math.BigDecimal;

import com.example.fund.common.entity.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "fund_portfolio")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FundPortfolio extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "portfolio_id")
    private Long portfolioId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fund_id", nullable = false)
    private Fund fund;

    // 국내 주식
    @Column(name = "domestic_stock", precision = 5, scale = 2)
    private BigDecimal domesticStock;

    // 해외 주식
    @Column(name = "overseas_stock", precision = 5, scale = 2)
    private BigDecimal overseasStock;

    // 국내 채권
    @Column(name = "domestic_bond", precision = 5, scale = 2)
    private BigDecimal domesticBond;

    // 해외 채권
    @Column(name = "overseas_bond", precision = 5, scale = 2)
    private BigDecimal overseasBond;

    // 펀드 투자
    @Column(name = "fund_investment", precision = 5, scale = 2)
    private BigDecimal fundInvestment;

    // 유동성
    @Column(name = "liquidity", precision = 5, scale = 2)
    private BigDecimal liquidity;
}
