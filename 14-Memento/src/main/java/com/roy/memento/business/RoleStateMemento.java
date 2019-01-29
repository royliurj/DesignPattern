package com.roy.memento.business;

/**
 * 角色状态存储箱（备忘录Memento类）
 * @Author: Roy
 * @Date: 2019/1/29 16:58
 */
public class RoleStateMemento {
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

    public RoleStateMemento(int atk, int vit, int def){
        this.atk = atk;
        this.vit = vit;
        this.def = def;
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
