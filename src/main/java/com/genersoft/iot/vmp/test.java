package com.genersoft.iot.vmp;

import org.apache.commons.codec.digest.DigestUtils;

import static org.apache.commons.codec.digest.DigestUtils.md5;
import static org.apache.poi.poifs.crypt.HashAlgorithm.md5;

/**
 * @Description:
 * @ClassName: test
 * @Author: 刘苏义
 * @Date: 2023年08月17日9:01:06
 * @Version: 1.0
 **/
public class test {
    public static void main(String[] args) {
        String s = DigestUtils.md5Hex("3e80d1762a324d5b0ff636e0bd16f1e3");
        System.out.println(s);
    }
}
