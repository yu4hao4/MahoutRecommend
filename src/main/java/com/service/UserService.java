package com.service;

import com.model.User;

import java.util.List;

public interface UserService {
    List<User> queryUsersBySql(int currPage, int pageSize);
}
