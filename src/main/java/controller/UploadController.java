package controller;

import org.apache.commons.io.FileUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author panzhixiong
 * @date 2018/10/23
 */
@RestController
public class UploadController {

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(MultipartFile file) {
        try {
            FileUtils.writeByteArrayToFile(new File("/Users/panzhixiong/IdeaProjects/testFile/" + file.getOriginalFilename()), file.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "ok";
    }
}
