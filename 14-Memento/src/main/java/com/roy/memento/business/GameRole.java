package com.roy.memento.business;

/**
 * @Author: Roy
 * @Date: 2019/1/29 16:55
 */
public class GameRole {

    /**
     * 攻击力
     */
    private int atk;
    /**
     * 生命力
     */
    private int vit;
    /**
     * 防御力
     */
    private int def;

    /**
     * 保存角色状态
     * @return
     */
    public RoleStateMemento saveState(){
        return new RoleStateMemento(atk,vit,def);
    }

    /**
     * 恢复角色状态
     * @param memento
     */
    public void recoveryState(RoleStateMemento memento){
        this.atk = memento.getAtk();
        this.vit = memento.getVit();
        this.def = memento.getDef();
    }

    public void initState(){
        this.atk = 100;
        this.vit = 100;
        this.def = 100;
    }

    public void fight(){
        this.atk = 0;
        this.vit = 0;
        this.def = 0;
    }

    public void showState(){
        System.out.println("攻击力：" + atk);
        System.out.println("生命力：" + vit);
        System.out.println("防御力：" + def);
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
