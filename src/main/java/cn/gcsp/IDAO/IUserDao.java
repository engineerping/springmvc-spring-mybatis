package cn.gcsp.IDAO;

import cn.gcsp.entity.User;

import java.util.Map;

public interface IUserDao {

    User getUserByNameAndPassword(User user);
}
