package com.wrr.capoo.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wrr.capoo.controller.dto.UserDTO;
import com.wrr.capoo.entity.User;
import com.wrr.capoo.mapper.UserMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService extends ServiceImpl<UserMapper,User>{

    public boolean saveUser(User user) {
       return saveOrUpdate(user);
    }

    public boolean login(UserDTO userDTO) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username", userDTO.getUsername());
        queryWrapper.eq("password", userDTO.getPassword());
        User one = getOne(queryWrapper);
        return one != null;
//        try {
//            User one = getOne(queryWrapper);
//            if (one != null) {
//                BeanUtil.copyProperties(one, userDTO, true);
//                return userDTO;
//            } else {
//                throw new ServiceException(Constants.CODE_600, "用户名或密码错误");
//            }
//        } catch (Exception e) {
//            throw new ServiceException(Constants.CODE_500, "系统错误");
//        }
    }

//    @Autowired
//    private UserMapper userMapper;
//
//    public int save(User user) {
//        if(user.getId() == null) {
//            return userMapper.insert(user);
//        }else{
//            return userMapper.update(user);
//        }
//    }
}
