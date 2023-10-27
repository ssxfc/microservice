package com.rtos.it.controller;

import com.morse.it.base.controller.impl.SaveController;
import com.morse.it.base.vo.Result;
import com.rtos.it.entity.My;
import com.rtos.it.service.MyService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author zhangwenwu
 * @Date 2023/10/27 21:30
 * @Version 1.8
 */
@Slf4j
@RequiredArgsConstructor
@ResponseBody
@RequestMapping("/my")
public class MyController extends SaveController<MyService, My> {

    @PostMapping("/update")
    public Result<My> update(@RequestBody My my) {
        boolean update = this.getBaseService().updateById(my);
        return Result.success("更新成功");
    }
}
