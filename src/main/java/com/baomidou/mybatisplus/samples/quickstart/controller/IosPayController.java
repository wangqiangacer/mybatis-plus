//package com.baomidou.mybatisplus.samples.quickstart.controller;
//
//import com.alibaba.fastjson.JSONObject;
//import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
//import com.baomidou.mybatisplus.samples.quickstart.utils.IosVerifyUtil;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * @author wangqinag
// * @version 1.0
// * @date 2020/5/26 18:47
// */
//@RestController
//@Slf4j
//public class IosPayController {
//
//    @PostMapping("/iospay")
//    public Map<String, Object> iosPay(Long priceId, String transactionId, String payload) throws Exception {
//        log.info("苹果内购校验开始，交易ID：" + transactionId + " base64校验体：" + payload);
////        Shipper shipper = getLoginShipper();
////        if (shipper == null) {
////            return failure("未登录");
////        }
//        //return  new HashMap<>();
//
//        //线上环境验证
//        String verifyResult = IosVerifyUtil.buyAppVerify(payload, 1);
//        if (verifyResult == null) {
//            throw new Exception("苹果验证失败，返回数据为空");
//        } else {
//            log.info("线上，苹果平台返回JSON:" + verifyResult);
//            JSONObject appleReturn = JSONObject.parseObject(verifyResult);
//            String states = appleReturn.getString("status");
//            //无数据则沙箱环境验证
//            if ("21007".equals(states)) {
//                verifyResult = IosVerifyUtil.buyAppVerify(payload, 0);
//                log.info("沙盒环境，苹果平台返回JSON:" + verifyResult);
//                appleReturn = JSONObject.parseObject(verifyResult);
//                states = appleReturn.getString("status");
//            }
//            log.info("苹果平台返回值：appleReturn" + appleReturn);
//            // 前端所提供的收据是有效的    验证成功
//            if (states.equals("0")) {
//                String receipt = appleReturn.getString("receipt");
//                JSONObject returnJson = JSONObject.parseObject(receipt);
//                String inApp = returnJson.getString("in_app");
//                List<HashMap> inApps = JSONObject.parseArray(inApp, HashMap.class);
//                if (!CollectionUtils.isEmpty(inApps)) {
//                    ArrayList<String> transactionIds = new ArrayList<String>();
//                    for (HashMap app : inApps) {
//                        transactionIds.add((String) app.get("transaction_id"));
//                    }
//                    //交易列表包含当前交易，则认为交易成功
//                    if (transactionIds.contains(transactionId)) {
//                        //处理业务逻辑
////                        VipOrder vipOrder = vipOrderService.saveVipOrder(shipper, priceId, EnumPayType.APPLE_IN_APP_PURCHASES.getValue(),transactionId);
////                        vipOrderService.paySuccess(vipOrder.getOrderCode(),null);
////                        log.info("交易成功，新增并处理订单：{}",vipOrder.getOrderCode());
////                        return success("充值成功");
//                        return new HashMap<>();
//                    }
//                    return new HashMap<>();
//                }
//                return new HashMap<>();
//            } else {
//                return new HashMap<>();
//            }
//        }
//}
