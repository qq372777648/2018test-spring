package net.lzw.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

import net.lzw.springmvc.service.PushService;
//http://localhost/test-spring/async   lzw:没懂
@Controller
public class AysncController {
    @Autowired
    PushService pushService; //1

    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall() { //2
        return pushService.getAsyncUpdate();
    }

}

