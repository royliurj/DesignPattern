package com.roy.state;

import com.roy.state.business.Work;

/**
 * @Author: Roy
 * @Date: 2019/1/21 15:13
 */
public class StateApp {

    public static void main(String[] args) {
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();

        work.setHour(12);
        work.writeProgram();

        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);
        work.writeProgram();

        work.setFinish(true);

        work.setHour(19);
        work.writeProgram();
        work.setHour(21);
        work.writeProgram();
    }
}
