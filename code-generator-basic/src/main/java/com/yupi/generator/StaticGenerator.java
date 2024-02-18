package com.yupi.generator;

import java.io.File;

import cn.hutool.core.io.FileUtil;

/**
 * 静态文件生成器
 * 
 * @author PonderYao
 * @since 1.0.0
 */
public class StaticGenerator {

    public static void main(String[] args) {
        String systemPath = getProjectPath();
        String inputPath = systemPath + File.separator + "samples" + File.separator + "acm-template";
        copyFileByHutool(inputPath, systemPath);
    }

    /**
     * 使用hutool工具实现文件拷贝
     * 
     * @param inputPath 输入路径
     * @param outputPath 输出路径
     */
    private static void copyFileByHutool(String inputPath, String outputPath) {
        FileUtil.copy(inputPath, outputPath, false);
    }

    /**
     * 获取系统路径
     * 
     * @return 系统路径
     */
    private static String getProjectPath() {
        return System.getProperty("user.dir");
    }
    
}
