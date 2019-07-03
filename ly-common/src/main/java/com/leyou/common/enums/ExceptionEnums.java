package com.leyou.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnums {

    BRAND_NOT_FOUND(404,"品牌不存在"),
    CATEGROY_NOT_FOUND(404,"商品分类没查到")
    ;
    private int code;
    private String msg;



}
