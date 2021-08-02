package com.example.Dao.impl;

import com.example.Dao.hong_dao;
import com.example.tool.read_file;

/**
 * 宏接口实现类
 */
public class hong_impl implements hong_dao {
    //气纯宏
    public String qicun() {
        String path = "res/气纯.txt";
        String qicun_hong = null;
        try {
            qicun_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return qicun_hong;
    }

    @Override
    public String wudi() {
        String path = "res/剑纯.txt";
        String jiancun_hong = null;
        try {
            jiancun_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jiancun_hong;
    }

    @Override
    public String bx() {
        String path = "res/冰心.txt";
        String bx_hong = null;
        try {
            bx_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bx_hong;
    }

    @Override
    public String mowen() {
        String path = "res/莫问.txt";
        String mowen_hong = null;
        try {
            mowen_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mowen_hong;
    }

    @Override
    public String yjj() {
        String path = "res/易筋经.txt";
        String yjj_hong = null;
        try {
            yjj_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return yjj_hong;
    }

    @Override
    public String he_shang_T() {
        String path = "res/洗髓.txt";
        String xishui_hong = null;
        try {
            xishui_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xishui_hong;
    }

    @Override
    public String hua_jian() {
        String path = "res/花间.txt";
        String huajian_hong = null;
        try {
            huajian_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return huajian_hong;
    }

    @Override
    public String du_jing() {
        String path = "res/毒经.txt";
        String dujing_hong = null;
        try {
            dujing_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return dujing_hong;
    }

    @Override
    public String aoxue() {
        String path = "res/傲血战意.txt";
        String aoxue_hong = null;
        try {
            aoxue_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return aoxue_hong;
    }

    @Override
    public String tielao() {
        String path = "res/铁牢律.txt";
        String tielao_hong = null;
        try {
            tielao_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tielao_hong;
    }

    @Override
    public String cangyun() {
        String path = "res/分山劲.txt";
        String cangyun_hong = null;
        try {
            cangyun_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cangyun_hong;
    }

    @Override
    public String cangyun_t() {
        String path = "res/铁骨衣.txt";
        String cangyun_t_hong = null;
        try {
            cangyun_t_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cangyun_t_hong;
    }

    @Override
    public String mingjiao() {
        String path = "res/焚影圣决.txt";
        String mingjiao_hong = null;
        try {
            mingjiao_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mingjiao_hong;
    }

    @Override
    public String mingjiao_t() {
        String path = "res/明尊琉璃体.txt";
        String mj_t_hong = null;
        try {
            mj_t_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mj_t_hong;
    }

    @Override
    public String jingyu() {
        String path = "res/惊羽诀.txt";
        String jy_hong = null;
        try {
            jy_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jy_hong;
    }

    @Override
    public String tianluo() {
        String path = "res/天罗诡道.txt";
        String tl_hong = null;
        try {
            tl_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return tl_hong;
    }

    @Override
    public String badao() {
        String path = "res/霸刀.txt";
        String bd_hong = null;
        try {
            bd_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bd_hong;
    }

    @Override
    public String cangjian() {
        String path = "res/藏剑.txt";
        String cangjian_hong = null;
        try {
            cangjian_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cangjian_hong;
    }

    @Override
    public String lingxue() {
        String path = "res/凌雪.txt";
        String lingxue_hong = null;
        try {
            lingxue_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lingxue_hong;
    }

    @Override
    public String yantian(){
        String path = "res/衍天宗.txt";
        String yantian_hong = null;
        try {
            yantian_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return yantian_hong;
    }

    @Override
    public String penglai() {
        String path = "res/蓬莱.txt";
        String penglai_hong = null;
        try {
            penglai_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return penglai_hong;
    }

    @Override
    public String gaibang() {
        String path = "res/丐帮.txt";
        String gaibang_hong = null;
        try {
            gaibang_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return gaibang_hong;
    }

    @Override
    public String naima() {
        String path = "res/奶妈.txt";
        String naima_hong = null;
        try {
            naima_hong = read_file.read_file(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return naima_hong;
    }
}
