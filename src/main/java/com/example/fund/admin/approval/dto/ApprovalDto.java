package com.example.fund.admin.approval.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ApprovalDto {
    private Integer approvalId;
    private String title;
    private String content;
    private String writerId;
    private String status;
}
