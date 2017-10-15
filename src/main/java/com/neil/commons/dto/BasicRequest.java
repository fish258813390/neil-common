/**
 *
 */
package com.neil.commons.dto;

import java.io.Serializable;

/**
 * @author wanghuajian 2015-6-29
 * <p>
 * 请求传输基础对象，如果需要增加字段请报备
 * </p>
 * <p>
 * </br>extendObject    &nbsp;&nbsp;&nbsp;&nbsp;    扩展对象，可设置自定义对象
 * </P>
 * <p>
 * </br>orderformFlowNo    &nbsp;&nbsp;&nbsp;&nbsp;    订单流水号
 * </br>toUpstreamOrderformFlowNo    &nbsp;&nbsp;&nbsp;&nbsp;    发送给上游的订单流水号
 * </br>fromUpstreamOrderformFlowNo    &nbsp;&nbsp;&nbsp;&nbsp;    上游返回的订单流水号
 * </br>rechargeNumber    &nbsp;&nbsp;&nbsp;&nbsp;    充值号码
 * </br>rechargeMoney    &nbsp;&nbsp;&nbsp;&nbsp;     充值金额
 * </br>operatorNumber    &nbsp;&nbsp;&nbsp;&nbsp;    工号
 * </br>operatorPassword    &nbsp;&nbsp;&nbsp;&nbsp;    工号登录密码
 * </br>operatorTradePassword    &nbsp;&nbsp;&nbsp;&nbsp;    工号交易密码
 * </br>attribution    &nbsp;&nbsp;&nbsp;&nbsp;    归属地
 * </br>rechargeTime    &nbsp;&nbsp;&nbsp;&nbsp;    充值时间
 * </br>clientIp    &nbsp;&nbsp;&nbsp;&nbsp;    客户IP
 * </br>sendMessagePhone    &nbsp;&nbsp;&nbsp;&nbsp;    短信提醒号码
 * </br>sendMessage    &nbsp;&nbsp;&nbsp;&nbsp;    短信提醒内容
 * </br>rechargePrice    &nbsp;&nbsp;&nbsp;&nbsp;    购买单价
 * </br>rechargeCount    &nbsp;&nbsp;&nbsp;&nbsp;    购买总数
 * </br>rechargeTotalPrice    &nbsp;&nbsp;&nbsp;&nbsp;    购买总价
 * </br>rechargeGame    &nbsp;&nbsp;&nbsp;&nbsp;    充值游戏
 * </br>rechargeArea    &nbsp;&nbsp;&nbsp;&nbsp;    充值区
 * </br>rechargeServer    &nbsp;&nbsp;&nbsp;&nbsp;    充值服
 * </br>accountType    &nbsp;&nbsp;&nbsp;&nbsp;    账户类型
 * </br>rechargeType    &nbsp;&nbsp;&nbsp;&nbsp;    充值类型
 * </br>carriersType    &nbsp;&nbsp;&nbsp;&nbsp;    运营商类型、
 * </br>provinceCode    &nbsp;&nbsp;&nbsp;&nbsp;    省级编号
 * </br>cityCode    &nbsp;&nbsp;&nbsp;&nbsp;    市级编号
 * </br>provinceName    &nbsp;&nbsp;&nbsp;&nbsp;    省级名称
 * </br>cityName    &nbsp;&nbsp;&nbsp;&nbsp;    市级名称
 * </br>rechargeCardNumber    &nbsp;&nbsp;&nbsp;&nbsp;    充值卡卡号
 * </br>rechargeCardPassword    &nbsp;&nbsp;&nbsp;&nbsp;    充值卡密码
 * </br>channelKey    &nbsp;&nbsp;&nbsp;&nbsp;    通道标识
 * </br>upstreamProductCode    &nbsp;&nbsp;&nbsp;&nbsp;    上游产品编号
 * </br>upstreamActiveCode    &nbsp;&nbsp;&nbsp;&nbsp;    上游活动编号
 * </br>remark    &nbsp;&nbsp;&nbsp;&nbsp;    备注
 * </br>extendParam1    &nbsp;&nbsp;&nbsp;&nbsp;    扩展参数1
 * </br>extendParam2    &nbsp;&nbsp;&nbsp;&nbsp;    扩展参数2
 * </br>extendParam3    &nbsp;&nbsp;&nbsp;&nbsp;    扩展参数3
 * </br>extendParam4    &nbsp;&nbsp;&nbsp;&nbsp;    扩展参数4
 * </br>extendParam5    &nbsp;&nbsp;&nbsp;&nbsp;    扩展参数5
 * </br>extendParam6    &nbsp;&nbsp;&nbsp;&nbsp;    扩展参数6
 * </br>extendParam7    &nbsp;&nbsp;&nbsp;&nbsp;    扩展参数7
 * </br>extendParam8    &nbsp;&nbsp;&nbsp;&nbsp;    扩展参数8
 * </br>extendParam9    &nbsp;&nbsp;&nbsp;&nbsp;    扩展参数9
 * </br>extendParam10    &nbsp;&nbsp;&nbsp;&nbsp;    扩展参数10
 * </p>
 */
public class BasicRequest implements Serializable{
    private static final long serialVersionUID = 8718129838153033699L;
    private String orderformFlowNo;//订单流水号
    @Deprecated
    private String upstreamOrderformFlowNo;//上游订单流水号
    private String toUpstreamOrderformFlowNo;//发送给上游的订单流水号
    private String fromUpstreamOrderformFlowNo;//上游返回的订单流水号
    private String rechargeNumber;//充值号码
    private String rechargeMoney;// 充值金额
    private String operatorNumber;//工号
    private String operatorPassword;//工号登录密码
    private String operatorTradePassword;//工号交易密码
    private String attribution;//归属地
    private String rechargeTime;//充值时间
    private String clientIp;//客户IP
    private String sendMessagePhone;//短信提醒号码
    private String sendMessage;//短信提醒内容
    private String rechargePrice;//购买单价
    private String rechargeCount;//购买总数
    private String rechargeTotalPrice;//购买总价
    private String rechargeGame; //充值游戏
    private String rechargeArea;//充值区
    private String rechargeServer;//充值服
    private String accountType;//账户类型
    private String rechargeType;//充值类型
    private String carriersType;//运营商类型、
    private String provinceCode;//省级编号
    private String cityCode;//市级编号
    private String provinceName;//省级名称
    private String cityName;//市级名称
    private String rechargeCardNumber;//充值卡卡号
    private String rechargeCardPassword;//充值卡密码
    private String channelKey;//通道标识
    private String upstreamProductCode;//上游产品编号
    private String upstreamActiveCode; //上游活动编号
    private String remark;//备注

    private Object extendObject;

    private ExtendParam extendParam1;
    private ExtendParam extendParam2;
    private ExtendParam extendParam3;
    private ExtendParam extendParam4;
    private ExtendParam extendParam5;
    private ExtendParam extendParam6;
    private ExtendParam extendParam7;
    private ExtendParam extendParam8;
    private ExtendParam extendParam9;
    private ExtendParam extendParam10;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    /**
     * 扩展对象
     * @return
     */
    public Object getExtendObject() {
        return extendObject;
    }
    /**
     * 扩展对象
     * @param extendObj
     */
    public void setExtendObject(Object extendObject) {
        this.extendObject = extendObject;
    }

    /**
     * 订单流水号
     * @return
     */
    public String getOrderformFlowNo() {
        return orderformFlowNo;
    }
    /**
     * 订单流水号
     * @param orderformFlowNo
     */
    public void setOrderformFlowNo(String orderformFlowNo) {
        this.orderformFlowNo = orderformFlowNo;
    }
    /**
     * 上游订单流水号
     * 此方法在今后的版本中将废弃
     * <p>请使用 新的字段
     * </br>toUpstreamOrderformFlowNo    &nbsp;&nbsp;&nbsp;&nbsp;    发送给上游的订单流水号
     * </br>fromUpstreamOrderformFlowNo    &nbsp;&nbsp;&nbsp;&nbsp;    上游返回的订单流水号
     * </p>
     * @return
     */
    @Deprecated
    public String getUpstreamOrderformFlowNo() {
        return upstreamOrderformFlowNo;
    }
    /**
     * 上游订单流水号
     * <p>请使用 新的字段
     * </br>toUpstreamOrderformFlowNo    &nbsp;&nbsp;&nbsp;&nbsp;    发送给上游的订单流水号
     * </br>fromUpstreamOrderformFlowNo    &nbsp;&nbsp;&nbsp;&nbsp;    上游返回的订单流水号
     * </p>
     * @param upstreamOrderformFlowNo
     */
    @Deprecated
    public void setUpstreamOrderformFlowNo(String upstreamOrderformFlowNo) {
        this.upstreamOrderformFlowNo = upstreamOrderformFlowNo;
    }
    /**
     * 充值号码
     * @return
     */
    public String getRechargeNumber() {
        return rechargeNumber;
    }
    /**
     * 充值号码
     * @param rechargeNumber
     */
    public void setRechargeNumber(String rechargeNumber) {
        this.rechargeNumber = rechargeNumber;
    }
    /**
     * 充值金额
     * @return
     */
    public String getRechargeMoney() {
        return rechargeMoney;
    }
    /**
     * 充值金额
     * @param rechargeMoney
     */
    public void setRechargeMoney(String rechargeMoney) {
        this.rechargeMoney = rechargeMoney;
    }
    /**
     * 充值单价
     * @return
     */
    public String getRechargePrice() {
        return rechargePrice;
    }
    /**
     * 充值单价
     * @param rechargePrice
     */
    public void setRechargePrice(String rechargePrice) {
        this.rechargePrice = rechargePrice;
    }
    /**
     * 充值总数
     * @return
     */
    public String getRechargeCount() {
        return rechargeCount;
    }
    /**
     * 充值总数
     * @param rechargeCount
     */
    public void setRechargeCount(String rechargeCount) {
        this.rechargeCount = rechargeCount;
    }
    /**
     * 购买总价
     * @return
     */
    public String getRechargeTotalPrice() {
        return rechargeTotalPrice;
    }
    /**
     * 购买总价
     * @param rechargeTotalPrice
     */
    public void setRechargeTotalPrice(String rechargeTotalPrice) {
        this.rechargeTotalPrice = rechargeTotalPrice;
    }
    /**
     * 充值游戏
     * @return
     */
    public String getRechargeGame() {
        return rechargeGame;
    }
    /**
     * 充值游戏
     * @param rechargeGame
     */
    public void setRechargeGame(String rechargeGame) {
        this.rechargeGame = rechargeGame;
    }
    /**
     * 账户类型
     * @return
     */
    public String getAccountType() {
        return accountType;
    }
    /**
     * 账户类型
     * @param accountType
     */
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
    /**
     * 充值区
     * @return
     */
    public String getRechargeArea() {
        return rechargeArea;
    }
    /**
     * 充值区
     * @param rechargeArea
     */
    public void setRechargeArea(String rechargeArea) {
        this.rechargeArea = rechargeArea;
    }
    /**
     * 充值服
     * @return
     */
    public String getRechargeServer() {
        return rechargeServer;
    }
    /**
     * 充值服
     * @param rechargeServer
     */
    public void setRechargeServer(String rechargeServer) {
        this.rechargeServer = rechargeServer;
    }
    /**
     * 充值类型
     * @return
     */
    public String getRechargeType() {
        return rechargeType;
    }
    /**
     * 充值类型
     * @param rechargeType
     */
    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }
    /**
     * 运营商类型
     * @return
     */
    public String getCarriersType() {
        return carriersType;
    }
    /**
     * 运营商类型
     * @param carriersType
     */
    public void setCarriersType(String carriersType) {
        this.carriersType = carriersType;
    }
    /**
     * 省代码
     * @return
     */
    public String getProvinceCode() {
        return provinceCode;
    }
    /**
     * 省代码
     * @param provinceCode
     */
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
    /**
     * 市代码
     * @return
     */
    public String getCityCode() {
        return cityCode;
    }
    /**
     * 市代码
     * @param cityCode
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
    /**
     * 省名称
     * @return
     */
    public String getProvinceName() {
        return provinceName;
    }
    /**
     * 省名称
     * @param provinceName
     */
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    /**
     * 市名称
     * @return
     */
    public String getCityName() {
        return cityName;
    }
    /**
     * 市名称
     * @param cityName
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    /**
     * 充值卡号码
     * @return
     */
    public String getRechargeCardNumber() {
        return rechargeCardNumber;
    }
    /**
     * 充值卡号码
     * @param rechargeCardNumber
     */
    public void setRechargeCardNumber(String rechargeCardNumber) {
        this.rechargeCardNumber = rechargeCardNumber;
    }
    /**
     * 充值卡密码
     * @return
     */
    public String getRechargeCardPassword() {
        return rechargeCardPassword;
    }
    /**
     * 充值卡密码
     * @param rechargeCardPassword
     */
    public void setRechargeCardPassword(String rechargeCardPassword) {
        this.rechargeCardPassword = rechargeCardPassword;
    }
    /**
     * 通道标示
     * @return
     */
    public String getChannelKey() {
        return channelKey;
    }
    /**
     * 通道标示
     * @param channelKey
     */
    public void setChannelKey(String channelKey) {
        this.channelKey = channelKey;
    }
    /**
     * 上游产品编码
     * @return
     */
    public String getUpstreamProductCode() {
        return upstreamProductCode;
    }
    /**
     * 上游产品编码
     * @param upstreamProductCode
     */
    public void setUpstreamProductCode(String upstreamProductCode) {
        this.upstreamProductCode = upstreamProductCode;
    }
    /**
     * 上游活动编码
     * @return
     */
    public String getUpstreamActiveCode() {
        return upstreamActiveCode;
    }
    /**
     * 上游活动编码
     * @param upstreamActiveCode
     */
    public void setUpstreamActiveCode(String upstreamActiveCode) {
        this.upstreamActiveCode = upstreamActiveCode;
    }
    /**
     * 备注
     * @return
     */
    public String getRemark() {
        return remark;
    }
    /**
     * 备注
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    /**
     * 充值IP
     * @return
     */
    public String getClientIp() {
        return clientIp;
    }
    /**
     * 充值IP
     * @param clientIp
     */
    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }
    /**
     * 发送通知短信手机号码
     * @return
     */
    public String getSendMessagePhone() {
        return sendMessagePhone;
    }
    /**
     * 发送通知短信手机号码
     * @param sendMessagePhone
     */
    public void setSendMessagePhone(String sendMessagePhone) {
        this.sendMessagePhone = sendMessagePhone;
    }
    /**
     * 通知短信内容
     * @return
     */
    public String getSendMessage() {
        return sendMessage;
    }
    /**
     * 通知短信内容
     * @param sendMessage
     */
    public void setSendMessage(String sendMessage) {
        this.sendMessage = sendMessage;
    }
    /**
     * 工号
     * @return
     */
    public String getOperatorNumber() {
        return operatorNumber;
    }
    /**
     * 工号
     * @param operatorNumber
     */
    public void setOperatorNumber(String operatorNumber) {
        this.operatorNumber = operatorNumber;
    }
    /**
     * 工号登录密码
     * @return
     */
    public String getOperatorPassword() {
        return operatorPassword;
    }
    /**
     * 工号登录密码
     * @param operatorPassword
     */
    public void setOperatorPassword(String operatorPassword) {
        this.operatorPassword = operatorPassword;
    }
    /**
     * 工号交易密码
     * @return
     */
    public String getOperatorTradePassword() {
        return operatorTradePassword;
    }
    /**
     * 工号交易密码
     * @param operatorTradePassword
     */
    public void setOperatorTradePassword(String operatorTradePassword) {
        this.operatorTradePassword = operatorTradePassword;
    }
    /**
     * 归属地
     * @return
     */
    public String getAttribution() {
        return attribution;
    }
    /**
     * 归属地
     * @param attribution
     */
    public void setAttribution(String attribution) {
        this.attribution = attribution;
    }
    /**
     * 充值时间
     * @return
     */
    public String getRechargeTime() {
        return rechargeTime;
    }
    /**
     * 充值时间
     * @param rechargeTime
     */
    public void setRechargeTime(String rechargeTime) {
        this.rechargeTime = rechargeTime;
    }
    /**
     * 扩展参数1
     * @return
     */
    public ExtendParam getExtendParam1() {
        return extendParam1;
    }
    /**
     * 扩展参数1
     * @param extendParam1
     */
    public void setExtendParam1(ExtendParam extendParam1) {
        this.extendParam1 = extendParam1;
    }
    /**
     * 扩展参数2
     * @return
     */
    public ExtendParam getExtendParam2() {
        return extendParam2;
    }
    /**
     * 扩展参数2
     * @param extendParam2
     */
    public void setExtendParam2(ExtendParam extendParam2) {
        this.extendParam2 = extendParam2;
    }
    /**
     * 扩展参数3
     * @return
     */
    public ExtendParam getExtendParam3() {
        return extendParam3;
    }
    /**
     * 扩展参数3
     * @param extendParam3
     */
    public void setExtendParam3(ExtendParam extendParam3) {
        this.extendParam3 = extendParam3;
    }
    /**
     * 扩展参数4
     * @return
     */
    public ExtendParam getExtendParam4() {
        return extendParam4;
    }
    /**
     * 扩展参数4
     * @param extendParam4
     */
    public void setExtendParam4(ExtendParam extendParam4) {
        this.extendParam4 = extendParam4;
    }
    /**
     * 扩展参数5
     * @return
     */
    public ExtendParam getExtendParam5() {
        return extendParam5;
    }
    /**
     * 扩展参数5
     * @param extendParam5
     */
    public void setExtendParam5(ExtendParam extendParam5) {
        this.extendParam5 = extendParam5;
    }
    /**
     * 扩展参数6
     * @return
     */
    public ExtendParam getExtendParam6() {
        return extendParam6;
    }
    /**
     * 扩展参数6
     * @param extendParam6
     */
    public void setExtendParam6(ExtendParam extendParam6) {
        this.extendParam6 = extendParam6;
    }
    /**
     * 扩展参数7
     * @return
     */
    public ExtendParam getExtendParam7() {
        return extendParam7;
    }
    /**
     * 扩展参数7
     * @param extendParam7
     */
    public void setExtendParam7(ExtendParam extendParam7) {
        this.extendParam7 = extendParam7;
    }
    /**
     * 扩展参数8
     * @return
     */
    public ExtendParam getExtendParam8() {
        return extendParam8;
    }
    /**
     * 扩展参数8
     * @param extendParam8
     */
    public void setExtendParam8(ExtendParam extendParam8) {
        this.extendParam8 = extendParam8;
    }
    /**
     * 扩展参数9
     * @return
     */
    public ExtendParam getExtendParam9() {
        return extendParam9;
    }
    /**
     * 扩展参数9
     * @param extendParam9
     */
    public void setExtendParam9(ExtendParam extendParam9) {
        this.extendParam9 = extendParam9;
    }
    /**
     * 扩展参数10
     * @return
     */
    public ExtendParam getExtendParam10() {
        return extendParam10;
    }
    /**
     * 扩展参数10
     * @param extendParam10
     */
    public void setExtendParam10(ExtendParam extendParam10) {
        this.extendParam10 = extendParam10;
    }
    /**
     * 发送给上游的订单流水号
     * @return
     */
    public String getToUpstreamOrderformFlowNo() {
        return toUpstreamOrderformFlowNo;
    }
    /**
     * 发送给上游的订单流水号
     * @param toUpstreamOrderformFlowNo
     */
    public void setToUpstreamOrderformFlowNo(String toUpstreamOrderformFlowNo) {
        this.toUpstreamOrderformFlowNo = toUpstreamOrderformFlowNo;
    }
    /**
     * 上游返回的订单流水号
     * @return
     */
    public String getFromUpstreamOrderformFlowNo() {
        return fromUpstreamOrderformFlowNo;
    }
    /**
     * 上游返回的订单流水号
     * @param fromUpstreamOrderformFlowNo
     */
    public void setFromUpstreamOrderformFlowNo(String fromUpstreamOrderformFlowNo) {
        this.fromUpstreamOrderformFlowNo = fromUpstreamOrderformFlowNo;
    }

}
