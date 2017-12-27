package com.example.UserProvider.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.example.UserProvider.Model.UserInfoModel;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

public interface UserInfoDao extends CrudRepository<UserInfoModel,Long> {

}
