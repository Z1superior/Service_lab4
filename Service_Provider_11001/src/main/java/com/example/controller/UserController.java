package com.example.controller;

import com.example.entity.CommonResult;
import com.example.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getUserById/{userId}")
    public CommonResult<User> getUserById(@PathVariable("userId") Integer userId){
        CommonResult<User> result =new CommonResult<>();
        Integer code = 200;
        String message = "success(11001)";
        try {
            User u = new User(userId,"小明","123456");
            result.setCode(code);
            result.setMessage(message);
            result.setUser(u);

        }catch (Exception e){
            result.setCode(404);
            result.setMessage("error");
        }
        return result;

    }

}
