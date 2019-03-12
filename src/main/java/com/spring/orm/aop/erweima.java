package com.spring.orm.aop;

import cn.hutool.core.io.FileUtil;
import cn.hutool.extra.qrcode.QrCodeUtil;
import cn.hutool.extra.qrcode.QrConfig;

import java.awt.*;

public class erweima {
    public static void main(String[] args) {
        QrConfig config = new QrConfig(400, 500);
// 设置边距，既二维码和背景之间的边距
        config.setMargin(3);
// 设置前景色，既二维码颜色（青色）
        Color forColor=new Color(238,255,243);
        Color bgColor=new Color(157,254,254);
        int forColerrgb=forColor.getRGB();
        int bgColorrgb=bgColor.getRGB();
        config.setForeColor(forColerrgb);
        config.setBackColor(bgColorrgb);


        QrCodeUtil.generate(//
                "https://www.jianshu.com/u/fcc8b9ea55d8", //二维码内容
                QrConfig.create().setImg("D:/bg.jpg"), //附带logo
                FileUtil.file("D:/erweima.jpg")//写出到的文件
        );

    }

}
