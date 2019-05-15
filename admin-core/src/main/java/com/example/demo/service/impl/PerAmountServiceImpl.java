package com.example.demo.service.impl;

import com.example.demo.model.PerMoney;
import com.example.demo.service.PerAmountService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@Service
public class PerAmountServiceImpl implements PerAmountService {
    @Override
    public PerMoney countAmount(Map<String, String> param) {
        BigDecimal base=new BigDecimal(param.get("base"));
        BigDecimal addFee=new BigDecimal(param.get("time"));

        /*double wdxy=6200*0.08*0.85;
        double jbf=(6200/21.75/8)*addFee.doubleValue();
        double gjj=1860*0.05+8;
        double yl=3279*0.08;
        double ylb=3279*0.02;
        double sy=3279*0.005;
        //double fg=gjj+yl+ylb+sy;
        double fg=101+yl+ylb+sy;
        double basefront=base.doubleValue()+wdxy+150+jbf;
        double personM=(base.doubleValue()+wdxy+150+jbf-fg-5000)*0.03;
        double lastM=basefront-fg-personM;
        double second=base.doubleValue()*0.15;
        double first=lastM-second;*/
        BigDecimal wdxy=new BigDecimal((6200*0.08*0.85)+"");
        BigDecimal jbf=new BigDecimal((6200/21.75/8)+"").multiply(addFee);
        BigDecimal gjj=new BigDecimal((1860*0.05+8)+"");
        BigDecimal yl=new BigDecimal((3279*0.08)+"");
        BigDecimal ylb=new BigDecimal((3279*0.02)+"");
        BigDecimal sy=new BigDecimal((3279*0.005)+"");
        BigDecimal fg=new BigDecimal("101").add(yl).add(ylb).add(sy);
        BigDecimal basefront=base.add(wdxy).add(jbf).add(new BigDecimal(150+""));
        BigDecimal personM=(base.add(wdxy).add(new BigDecimal("150").add(new BigDecimal("500"))).add(jbf).subtract(fg).subtract(new BigDecimal(5000+""))).multiply(new BigDecimal(0.03+""));
        BigDecimal lastM=basefront.subtract(fg).subtract(personM);
        BigDecimal second=base.multiply(new BigDecimal(0.15+""));
        BigDecimal second1=base.multiply(new BigDecimal(0.15+"")).subtract(new BigDecimal("150")).add(new BigDecimal("500"));
        BigDecimal first=lastM.subtract(second);
        BigDecimal first1=lastM.subtract(second).add(new BigDecimal("150"));

        System.out.println("jcgz:"+base.setScale(3, java.math.BigDecimal.ROUND_HALF_UP).toString());
        System.out.println("wdxy:"+wdxy.setScale(3, java.math.BigDecimal.ROUND_HALF_UP).toString());
        System.out.println("jbf:"+jbf.setScale(3, java.math.BigDecimal.ROUND_HALF_UP));
        System.out.println("餐补:"+150);
        System.out.println("五险一金:"+fg.setScale(3, java.math.BigDecimal.ROUND_HALF_UP).toString());
        System.out.println("个人税："+personM.setScale(3, java.math.BigDecimal.ROUND_HALF_UP).toString());
        System.out.println("请假："+0);
        System.out.println("税前："+basefront.setScale(3, java.math.BigDecimal.ROUND_HALF_UP).toString());
        System.out.println("到手："+lastM.setScale(3, java.math.BigDecimal.ROUND_HALF_UP).toString());
        System.out.println("到手1："+lastM.add(new BigDecimal("500")).setScale(3, java.math.BigDecimal.ROUND_HALF_UP).toString());
        System.out.println("first:"+first.setScale(3, java.math.BigDecimal.ROUND_HALF_UP).toString());
        System.out.println("first1:"+first1.setScale(3, java.math.BigDecimal.ROUND_HALF_UP).toString());
        System.out.println("second:"+second.setScale(3, java.math.BigDecimal.ROUND_HALF_UP).toString());
        System.out.println("second1:"+second1.setScale(3, java.math.BigDecimal.ROUND_HALF_UP).toString());
        PerMoney result =new PerMoney();
        result.setSumAmout(String.valueOf(basefront.toString()));
        result.setGetFirstAmount(String.valueOf(first.toString()));
        result.setGetSecondAmout(String.valueOf(second.toString()));
        result.setNeedOutAmout(String.valueOf(fg.add(personM).toString()));
        return result;
    }

    public static void main(String[] args) {
        Map<String,String>paam=new HashMap<>();
        paam.put("base","7200");
        paam.put("time","10.22");
        PerAmountService service=new PerAmountServiceImpl();
        PerMoney perMoney=service.countAmount(paam);
    }
}
