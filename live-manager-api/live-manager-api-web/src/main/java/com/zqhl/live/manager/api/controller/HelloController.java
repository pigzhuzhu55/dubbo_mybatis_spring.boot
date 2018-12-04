package com.zqhl.live.manager.api.controller;

import com.zqhl.live.common.pojo.ApiResult;
import com.zqhl.live.manager.service.HelloService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(value="hello",tags={"1、你好"},position = 7)
@RestController
@RequestMapping(value = {"/api/hello"})
public class HelloController {

    @Autowired
    private HelloService helloService;

    @ApiOperation(value = "",position = 1)
    @RequestMapping(value = "/test",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiImplicitParams(
            {
                    @ApiImplicitParam(paramType = "query", name = "type", value = "类型", dataType = "int"),
            })
    @ResponseBody()
    public ApiResult<String> GetListCourseware(
            @RequestParam(required = false,defaultValue = "1") Integer type) {

        String msg = helloService.getHello(type);
        return ApiResult.Success(msg);
    }
}
