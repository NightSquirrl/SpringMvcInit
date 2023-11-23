package com.whattools.mapper;

import com.whattools.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    @Insert("insert into tbl_user(name,age)values(#{name},#{age})")
    public void save(User user);
}
