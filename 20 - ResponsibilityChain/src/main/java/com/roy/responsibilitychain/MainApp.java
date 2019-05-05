package com.roy.responsibilitychain;

import com.roy.responsibilitychain.business.CommonManager;
import com.roy.responsibilitychain.business.GeneralManager;
import com.roy.responsibilitychain.business.Majordomo;
import com.roy.responsibilitychain.business.Request;

/**
 * @Author: Roy
 * @Date: 2019/5/5 17:02
 */
public class MainApp {
    public static void main(String[] args) {
        CommonManager jinli = new CommonManager("经理");
        Majordomo zongjian = new Majordomo("总监");
        GeneralManager zhongjingli = new GeneralManager("总经理");

        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zhongjingli);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestNumber(12);

        jinli.requestApplications(request);
    }
}
