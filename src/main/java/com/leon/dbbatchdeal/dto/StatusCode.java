package com.leon.dbbatchdeal.dto;

import javax.management.loading.MLetContent;

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
public class StatusCode {
    public static Integer Success;
    public static Integer Fail;

    public static Integer getSuccess() {
        return Success;
    }

    public static void setSuccess(Integer success) {
        Success = success;
    }
}
