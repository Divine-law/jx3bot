package com.example.controller;

import com.example.Dao.impl.hong_impl;
import net.mamoe.mirai.event.events.GroupMessageEvent;

/**
 * 宏 控制器类
 */
public class hong_controller {
    public void hong_message(String[] message, GroupMessageEvent event){
        hong_impl hong = new hong_impl();
        String hong_text;
        switch (message[1]){
            case "气纯" :
                hong_text = hong.qicun();
                event.getSubject().sendMessage(hong_text);
                break;
            case "剑纯" :
                hong_text = hong.wudi();
                event.getSubject().sendMessage(hong_text);
                break;
            case "傲血战意" :
                hong_text = hong.aoxue();
                event.getSubject().sendMessage(hong_text);
                break;
            case "铁牢律" :
                hong_text = hong.tielao();
                event.getSubject().sendMessage(hong_text);
                break;
            case "霸刀" :
                hong_text = hong.badao();
                event.getSubject().sendMessage(hong_text);
                break;
            case "冰心" :
                hong_text = hong.bx();
                event.getSubject().sendMessage(hong_text);
                break;
            case "藏剑" :
                hong_text = hong.cangjian();
                event.getSubject().sendMessage(hong_text);
                break;
            case "毒经" :
                hong_text = hong.du_jing();
                event.getSubject().sendMessage(hong_text);
                break;
            case "焚影圣决" :
                hong_text = hong.mingjiao();
                event.getSubject().sendMessage(hong_text);
                break;
            case "明尊琉璃体" :
                hong_text = hong.mingjiao_t();
                event.getSubject().sendMessage(hong_text);
                break;
            case "丐帮" :
                hong_text = hong.gaibang();
                event.getSubject().sendMessage(hong_text);
                break;
            case "花间" :
                hong_text = hong.hua_jian();
                event.getSubject().sendMessage(hong_text);
                break;
            case "凌雪" :
                hong_text = hong.lingxue();
                event.getSubject().sendMessage(hong_text);
                break;
            case "莫问" :
                hong_text = hong.mowen();
                event.getSubject().sendMessage(hong_text);
                break;
            case "蓬莱" :
                hong_text = hong.penglai();
                event.getSubject().sendMessage(hong_text);
                break;
            case "奶妈" :
                hong_text = hong.naima();
                event.getSubject().sendMessage(hong_text);
                break;
            case "天罗诡道" :
                hong_text = hong.tianluo();
                event.getSubject().sendMessage(hong_text);
                break;
            case "惊羽诀" :
                hong_text = hong.jingyu();
                event.getSubject().sendMessage(hong_text);
                break;
            case "铁骨衣" :
                hong_text = hong.cangyun_t();
                event.getSubject().sendMessage(hong_text);
                break;
            case "分山劲" :
                hong_text = hong.cangyun();
                event.getSubject().sendMessage(hong_text);
                break;
            case "易筋经" :
                hong_text = hong.yjj();
                event.getSubject().sendMessage(hong_text);
                break;
            case "洗髓经" :
                hong_text = hong.he_shang_T();
                event.getSubject().sendMessage(hong_text);
                break;
            case "衍天宗" :
                hong_text = hong.yantian();
                event.getSubject().sendMessage(hong_text);
                break;
            default:
                break;
        }
    }
}
