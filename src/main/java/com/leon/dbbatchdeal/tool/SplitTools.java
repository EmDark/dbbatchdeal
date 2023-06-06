package com.leon.dbbatchdeal.tool;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 文件描述
 *
 * @Package: dbbatchdeal
 * @Description: note
 * @Author: 胡亮
 * @CreateDate: 2022/12/21 - 9:35
 * @UpdateUser: huliang46396
 * @UpdateDate: 2022/12/21 - 9:35
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2022 Hundsun Technologies Inc. All Rights Reserved
 */
public class SplitTools {

    public static void main(String[] args) throws IOException {
        // "E:\\eutranrelation.csv";
//        String bigFilePath = args[0];
        String bigFilePath = "C:\\Users\\huliang46396\\Desktop\\tomcat-1.log";
        // "E:\\eutranrelation-%s.csv";
//        String splitFileParttern = args[1];
        String splitFileParttern = "C:\\Users\\huliang46396\\Desktop\\tomcat-1.log.%S";
        // 32
        int splitFileCount = 10;

        BufferedReader reader = new BufferedReader(new FileReader(bigFilePath));
        String header = reader.readLine();
        int totalLine = 0;
        if (header != null) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                totalLine++;
            }
        }

        reader.close();

        int splitFileTotalLines = totalLine / splitFileCount;
        int generateFileIdx = 0;

        BufferedWriter bufferedWriter = null;
        reader = new BufferedReader(new FileReader(bigFilePath));
        header = reader.readLine();
        int currentIdx = 0;
        if (header != null) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                if (currentIdx == 0) {
                    String filePath = String.format(splitFileParttern,
                        String.valueOf(generateFileIdx));
                    bufferedWriter = new BufferedWriter(
                        new FileWriter(filePath));
                }

                bufferedWriter.write(line + "\r\n");

                currentIdx++;

                if (currentIdx == splitFileTotalLines) {
                    generateFileIdx++;
                    if (generateFileIdx != splitFileCount) {
                        currentIdx = 0;
                        bufferedWriter.flush();
                        bufferedWriter.close();
                    }
                }
            }

            if (bufferedWriter != null) {
                bufferedWriter.flush();
                bufferedWriter.close();
            }
        }

        reader.close();

        System.out.println("The total number of documents is:" + totalLine);
    }
}
