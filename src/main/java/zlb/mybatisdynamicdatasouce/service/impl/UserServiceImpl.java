package zlb.mybatisdynamicdatasouce.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import zlb.mybatisdynamicdatasouce.entity.User;
import zlb.mybatisdynamicdatasouce.mapper.db2.OrderMapper;
import zlb.mybatisdynamicdatasouce.mapper.db1.UserMapper;
import zlb.mybatisdynamicdatasouce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;

/**
 *  服务实现类
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.selectList(null);
    }

    @Override
    public BigDecimal getOrderPriceByUserId(Integer userId) {

        return orderMapper.getPriceByUserId(userId);
    }
}