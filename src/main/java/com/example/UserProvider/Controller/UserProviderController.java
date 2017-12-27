package com.example.UserProvider.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.UserProvider.Model.UserInfoModel;
import com.example.UserProvider.Dao.UserInfoDao;

@RestController
public class UserProviderController {

    @Autowired
    private UserInfoDao userInfoDao;

    @GetMapping("/User/{id}")
    public UserInfoModel FindUserByID(@PathVariable Long id) {

        UserInfoModel user = this.userInfoDao.findOne(id);
        System.out.println(id);
        return user;

    }

    @GetMapping("/Users")
    public Iterable<UserInfoModel> FindAllUsers() {

        Iterable<UserInfoModel> users = this.userInfoDao.findAll();
        return users;

    }

    /*
    example to add one user record as below:
    http://localhost:8090/add?username=fred&age=30&gender=male
     */
    @GetMapping(path="/add")
    public @ResponseBody
    String addNewUser (@RequestParam String username, @RequestParam Integer age,  @RequestParam String gender) {

        UserInfoModel n = new UserInfoModel();
        n.setUsername(username);
        n.setAge(age);
        n.setGender(gender);
        this.userInfoDao.save(n);
        return "Saved";

    }

}


