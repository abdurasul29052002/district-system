package com.example.districtsystembackend.controller;

import com.example.districtsystembackend.model.AttachmentModel;
import com.example.districtsystembackend.service.AttachmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartRequest;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/attachment")
@RequiredArgsConstructor
public class AttachmentController {

    private final AttachmentService attachmentService;

    @PostMapping("/upload")
    public List<AttachmentModel> upload(MultipartRequest multipartRequest) {
        return attachmentService.add(multipartRequest);
    }

    @GetMapping("/download/{attachmentId}")
    public void download(@PathVariable Long attachmentId, HttpServletResponse response) {
        attachmentService.downloadById(attachmentId, response);
    }
}
