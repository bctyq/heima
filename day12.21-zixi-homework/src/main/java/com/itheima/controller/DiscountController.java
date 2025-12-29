package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigDecimal;
import java.text.DecimalFormat;

@RestController
public class DiscountController {
    @GetMapping("/calcDiscountPrice")
    public String calcDiscountPrice(@RequestParam BigDecimal price, @RequestParam int vipLevel) {
        if (price.compareTo(BigDecimal.ZERO) <= 0) {
            return "商品价格不合法";
        }
        BigDecimal discountPrice;
        switch (vipLevel) {
            case 1:
                discountPrice = price.multiply(new BigDecimal("0.9"));
                break;
            case 2:
                discountPrice = price.multiply(new BigDecimal("0.8"));
                break;
            case 3:
                discountPrice = price.multiply(new BigDecimal("0.7"));
                break;
            default:
                discountPrice = price;
                break;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        return "折扣后价格：" + df.format(discountPrice) + " 元";
    }
}