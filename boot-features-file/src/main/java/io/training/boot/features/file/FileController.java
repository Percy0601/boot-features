package io.training.boot.features.file;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/file")
public class FileController {

    @PostMapping()
    public FileInfo upload(MultipartFile file) throws IOException {
        log.info("Upload File: name:{}, originalName:{}, size:{}", file.getName(), file.getOriginalFilename(), file.getSize());

        Resource resource = new ClassPathResource("/");
        String fileName = resource.getFile().getPath() + new Date().getTime() + ".txt";
        File localFile = new File(fileName);

        file.transferTo(localFile);
        return new FileInfo(fileName, resource.getURL().getPath());
    }

    @GetMapping("/{id}")
    public void download(@PathVariable String id, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Resource resource = new ClassPathResource("/");
        String folder = resource.getFile().getPath();
        try (InputStream inputStream = new FileInputStream(new File(folder, id + ".txt"));
             OutputStream outputStream = response.getOutputStream();) {

            response.setContentType("application/x-download");
            response.addHeader("Content-Disposition", "attachment;filename=test.txt");

            IOUtils.copy(inputStream, outputStream);
            outputStream.flush();
        }
    }
}
