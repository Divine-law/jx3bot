package com.example.controller;

import com.example.Dao.impl.peizhuang_impl;
import net.mamoe.mirai.event.events.GroupMessageEvent;
import net.mamoe.mirai.message.data.Image;
import net.mamoe.mirai.message.data.Message;

public class peizhuang_controller {
    public void peizhuang_message(String[] message, GroupMessageEvent event){
        peizhuang_impl peizhuang_impl = new peizhuang_impl();
        Image peizhuang;
        switch (message[1]){
            case "气纯" :
                peizhuang = peizhuang_impl.qicun(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "剑纯" :
                peizhuang = peizhuang_impl.jiancun(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "冰心" :
                peizhuang = peizhuang_impl.bx(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "云裳心经" :
                peizhuang = peizhuang_impl.naixiu(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "莫问" :
                peizhuang = peizhuang_impl.mowen(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "相知" :
                peizhuang = peizhuang_impl.naige(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "易筋经" :
                peizhuang = peizhuang_impl.yijinjing(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "洗髓经" :
                peizhuang = peizhuang_impl.xishuijing(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "花间游" :
                peizhuang = peizhuang_impl.huajian(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "离经易道" :
                peizhuang = peizhuang_impl.naihua(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "毒经" :
                peizhuang = peizhuang_impl.dujing(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "补天诀" :
                peizhuang = peizhuang_impl.naidu(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "傲血战意" :
                peizhuang = peizhuang_impl.aoxue(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "铁牢律" :
                peizhuang = peizhuang_impl.tielao(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "分山劲" :
                peizhuang = peizhuang_impl.fenshanjing(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "铁骨衣" :
                peizhuang = peizhuang_impl.tieguyi(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "焚影圣决" :
                peizhuang = peizhuang_impl.fenying(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "明尊琉璃体" :
                peizhuang = peizhuang_impl.mingzun(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "惊羽诀" :
                peizhuang = peizhuang_impl.jingyu(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "天罗诡道" :
                peizhuang = peizhuang_impl.tianluo(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "霸刀" :
                peizhuang = peizhuang_impl.badao(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "藏剑" :
                peizhuang = peizhuang_impl.cangjian(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "凌雪" :
                peizhuang = peizhuang_impl.lingxue(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "衍天" :
                peizhuang = peizhuang_impl.yantian(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "蓬莱" :
                peizhuang = peizhuang_impl.penglai(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            case "丐帮" :
                peizhuang = peizhuang_impl.gaibang(event);
                event.getSubject().sendMessage(peizhuang);
                break;
            default:
                break;
        }
    }
}
