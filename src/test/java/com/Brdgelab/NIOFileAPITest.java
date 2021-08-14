package com.Brdgelab;

import com.Bridgelab.EmployeeFileUtils;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import  java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.IntStream;

public class NIOFileAPITest {
    private static String HOME = System.getProperty("user.home");
    private static String PLAY_WITH_NIO ="TempPlayGround";

    @Test
    public <path> void givenPathWhenCheckedThenConfirm() throws  IOException {
       // Check file Exists
        Path homePath = Paths.get (HOME);
        Assert.assertEquals(true, Files.exists(homePath));

        // Delete file and check file not exist
        Path playPath = Paths.get( HOME +"/"+ PLAY_WITH_NIO);
        if (Files.exists((Path) playPath)) EmployeeFileUtils.deleteFile(playPath.toFile());
        Assert.assertTrue(Files.notExists(playPath));


        // Create Directory
        Files.createDirectory(playPath);
        Assert.assertTrue(Files.exists(playPath));


        // Create File
        IntStream.range(1, 10).forEach (cntr -> {
                    Path tempFile = Paths.get(playPath + "/temp" + cntr);
                    Assert.assertTrue(Files.notExists((tempFile)));
                    try {
                        Files.createFile(tempFile);
                    } catch (IOException e) {
                    }
                    Assert.assertTrue((Files.exists((tempFile))));
                });
    }

    
}










