package com.guoxuezhishi.test;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * @author: jiang
 * @date: 2019/8/8
 */
public class TestIo {
    @Test
    public void testIo() throws FileNotFoundException {
        String rec = "hello world~";
        String dir = "D:/demo/test/test.txt";
        File file = new File(dir);
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
    }

}
