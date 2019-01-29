package com.roy.memento;

import com.roy.memento.business.GameRole;
import com.roy.memento.business.RoleStateCaretaker;

/**
 * @Author: Roy
 * @Date: 2019/1/29 16:55
 */
public class MementoApp {
    public static void main(String[] args) {

        System.out.println("大战boss前");
        GameRole role = new GameRole();
        role.initState();
        role.showState();

        //保存进度
        RoleStateCaretaker stateCaretaker = new RoleStateCaretaker();
        stateCaretaker.setMemento(role.saveState());

        System.out.println("大战boss后");
        //大战boss
        role.fight();
        role.showState();

        System.out.println("恢复之前的状态");
        //恢复之前的状态
        role.recoveryState(stateCaretaker.getMemento());
        role.showState();
    }
}
