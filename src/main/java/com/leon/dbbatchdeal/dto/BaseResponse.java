package com.leon.dbbatchdeal.dto;

/**
 * 文件描述
 *
 * @Package: dbbatchdeal
 * @Description: note
 * @Author: 胡亮
 * @CreateDate: 2022/8/25 - 10:11
 * @UpdateUser: huliang46396
 * @UpdateDate: 2022/8/25 - 10:11
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2022 Hundsun Technologies Inc. All Rights Reserved
 */
public class BaseResponse {
    private  Integer success;
    private  String message;

    public BaseResponse(Integer success, String message) {
        this.success=success;
        this.message=message;
    }

    public BaseResponse(Integer success) {
        this.success=success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }
}
