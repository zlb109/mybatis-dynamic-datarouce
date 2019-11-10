package zlb.mybatisdynamicdatasouce.controller;

import zlb.mybatisdynamicdatasouce.entity.Order;
import zlb.mybatisdynamicdatasouce.entity.User;
import zlb.mybatisdynamicdatasouce.service.OrderService;
import zlb.mybatisdynamicdatasouce.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;
import java.util.List;

/**
 * 前端控制器
 */
@RestController
public class IndexController {
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;

    @GetMapping("/user")
    public ResponseEntity<List<User>> getUserList() {
        ResponseEntity<List<User>> responseEntity= ResponseEntity.ok(userService.getUserList());
        return responseEntity;
    }

    @GetMapping("/price")
    public ResponseEntity<BigDecimal> getPrice() {
        return ResponseEntity.ok(userService.getOrderPriceByUserId(1));
    }

    @GetMapping("/order")
    public ResponseEntity<List<Order>> getOrderList() {
        return ResponseEntity.ok(orderService.getOrderList());
    }

    @GetMapping("/price2")
    public ResponseEntity<BigDecimal> getPrice2() {
        return ResponseEntity.ok(orderService.getOrderPriceByUserId(1));
    }

}