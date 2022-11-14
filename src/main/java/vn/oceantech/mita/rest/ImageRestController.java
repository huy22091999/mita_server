package vn.oceantech.mita.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import vn.oceantech.mita.service.StorageService;

@Controller
@RequestMapping("/public/images")
public class ImageRestController {
    @Autowired
    private StorageService storageService;

    @GetMapping("/{name}")
    public ResponseEntity<Resource> getImageFile(@PathVariable String name) {
        Resource file=storageService.loadAsResource(name);
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION,
                "attachment; filename=\"" + file.getFilename() + "\"").body(file);
    }
}
