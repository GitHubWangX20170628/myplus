package com.ibeetl.test;

public class BankData {
    private String id;// 主键
    private String bizTime; // 时间
    private String idcarrier; // 标识
    private String organCode; // 组织编码
    private String cardType; // 类型
    public BankData() {
    }
    public BankData(String id, String bizTime, String idcarrier,
                    String organCode, String cardType) {
        super();
        this.id = id;
        this.bizTime = bizTime;
        this.idcarrier = idcarrier;
        this.organCode = organCode;
        this.cardType = cardType;
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBizTime() {
        return bizTime;
    }

    public void setBizTime(String bizTime) {
        this.bizTime = bizTime;
    }

    public String getIdcarrier() {
        return idcarrier;
    }

    public void setIdcarrier(String idcarrier) {
        this.idcarrier = idcarrier;
    }

    public String getOrganCode() {
        return organCode;
    }

    public void setOrganCode(String organCode) {
        this.organCode = organCode;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        return "BankData{" +
                "id='" + id + '\'' +
                ", bizTime='" + bizTime + '\'' +
                ", idcarrier='" + idcarrier + '\'' +
                ", organCode='" + organCode + '\'' +
                ", cardType='" + cardType + '\'' +
                '}';
    }
}
