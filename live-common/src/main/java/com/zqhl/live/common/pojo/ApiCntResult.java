package com.zqhl.live.common.pojo;

import com.alibaba.fastjson.JSON;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class ApiCntResult<T> extends ApiResult {
    public ApiCntResult() {
    }

    private long cnt;

    @Override
    public String toString()
    {
        return JSON.toJSONString(this);
    }
}
