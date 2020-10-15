package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.beans.MyUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<MyUser> {

}
