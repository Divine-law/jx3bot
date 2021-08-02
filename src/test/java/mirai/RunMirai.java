package mirai;

import net.mamoe.mirai.Bot;
import net.mamoe.mirai.BotFactory;
import net.mamoe.mirai.utils.BotConfiguration;

public class RunMirai {
    public static void main(String[] args) {
        Bot bot = BotFactory.INSTANCE.newBot(QQ号, "密码");
        bot.login();
    }
}

class WithConfiguration1 {
    public static void main(String[] args) {
        // 使用自定义配置
        Bot bot = BotFactory.INSTANCE.newBot(3165063950L, "zdszdmm12138", new BotConfiguration() {{
            fileBasedDeviceInfo("C:\\Users\\Administrator\\Downloads\\MiraiTemplate-master\\device.json"); // 使用 device.json 存储设备信息

//            setProtocol(MiraiProtocol.ANDROID_PAD); // 切换协议
        }});
        bot.login();
    }
}
