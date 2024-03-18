package com.morse.it.base.controller.impl;

import com.morse.it.base.controller.SuperController;
import com.morse.it.base.entity.SuperEntity;
import com.morse.it.base.service.SuperService;
import com.morse.it.base.vo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author zhangwenwu
 * @Date 2023/10/27 20:34
 * @Version 1.8
 */
public class SaveController<S extends SuperService,T extends SuperEntity> extends BaseController<S> {

    @PostMapping("/save")
    public Result<T> save(@RequestBody T t){
        S s = this.getBaseService();
        boolean saved = s.save(t);
        if(! saved){
            return Result.fail("新增失败");
        }
        return Result.success("新增成功", t);
    }

}
