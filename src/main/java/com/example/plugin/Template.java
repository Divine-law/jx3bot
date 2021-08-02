package com.example.plugin;

import com.example.controller.hong_controller;
import com.example.controller.peizhuang_controller;
import net.mamoe.mirai.console.extension.PluginComponentStorage;
import net.mamoe.mirai.console.plugin.jvm.JavaPlugin;
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescriptionBuilder;
import net.mamoe.mirai.event.GlobalEventChannel;
import net.mamoe.mirai.event.events.FriendMessageEvent;
import net.mamoe.mirai.event.events.GroupMessageEvent;
import org.jetbrains.annotations.NotNull;

public final class Template extends JavaPlugin {
    public static Template INSTANCE = new Template();
    private static Template instance;
    public static Template getInstance(){
        return instance;
    }
    private Template() {
        super(new JvmPluginDescriptionBuilder(
                        "com.example.plugin.Test", // 需要遵循语法规定，不知道写什么的话就写主类名吧
                        "1.0.0" // 同样需要遵循语法规定
                )
                .author("me")
                .name("template")
                .info("新版本测试")
                .build()
        );
        instance = this;

    }

    @Override
    public void onLoad(@NotNull PluginComponentStorage $this$onLoad) {

    }

    @Override
    public void onEnable() {
//        Bot.getInstance(3165063950L).getGroup(816734092).sendMessage("喵");
        GlobalEventChannel.INSTANCE.subscribeAlways(FriendMessageEvent.class, (FriendMessageEvent event) ->{
            String content = event.getMessage().contentToString();
            if(content.startsWith("张三")){
                event.getSender().sendMessage("喵");
            }
        });

        //测试消息
        GlobalEventChannel.INSTANCE.subscribeAlways(GroupMessageEvent.class,(GroupMessageEvent groupMessageEvent)->{
            String group_message = groupMessageEvent.getMessage().contentToString();
           if(group_message.equals("测试")&&groupMessageEvent.getSender().getId()==1603585958){
               groupMessageEvent.getSubject().sendMessage("hello world");
           }
        });

        //宏的写法
        GlobalEventChannel.INSTANCE.subscribeAlways(GroupMessageEvent.class,(GroupMessageEvent event) ->{
           String hong_message = event.getMessage().contentToString();
           String[] message = event.getMessage().contentToString().split("\\s+");
           if(message[0].equals("宏")){
               hong_controller hong = new hong_controller();
               hong.hong_message(message,event);
           }
        });

        //发送图片
        GlobalEventChannel.INSTANCE.subscribeAlways(GroupMessageEvent.class,(GroupMessageEvent event) ->{
            String peizhuang_message = event.getMessage().contentToString();
            String[] message = peizhuang_message.split("\\s+");
            if(message[0].equals("配装")){
                peizhuang_controller peizhuang = new peizhuang_controller();
                peizhuang.peizhuang_message(message,event);
            }
        });
    }
}
