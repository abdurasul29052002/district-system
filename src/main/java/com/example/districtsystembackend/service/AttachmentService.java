package com.example.districtsystembackend.service;

import com.example.districtsystembackend.entity.Attachment;
import com.example.districtsystembackend.mapper.AttachmentContentMapper;
import com.example.districtsystembackend.mapper.AttachmentMapper;
import com.example.districtsystembackend.model.AttachmentContentModel;
import com.example.districtsystembackend.model.AttachmentModel;
import com.example.districtsystembackend.repository.AttachmentRepository;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AttachmentService {

    private final AttachmentRepository attachmentRepository;
    private final AttachmentMapper attachmentMapper;
    private final AttachmentContentMapper attachmentContentMapper;

    @SneakyThrows
    public List<AttachmentModel> add(MultipartRequest multipartRequest) {
        List<AttachmentModel> attachmentModels = new ArrayList<>();
        Iterator<String> fileNames = multipartRequest.getFileNames();
        while (fileNames.hasNext()) {
            String fileName = fileNames.next();
            MultipartFile multipartFile = multipartRequest.getFile(fileName);
            AttachmentContentModel attachmentContentModel = new AttachmentContentModel(
                    null,
                    multipartFile.getBytes()
            );
            AttachmentModel attachmentModel = new AttachmentModel(
                    null,
                    multipartFile.getName(),
                    multipartFile.getOriginalFilename(),
                    multipartFile.getContentType(),
                    multipartFile.getSize(),
                    attachmentContentModel
            );
            attachmentModels.add(save(attachmentModel));
        }
        return attachmentModels;
    }

    @SneakyThrows
    public void downloadById(Long id, HttpServletResponse response){
        AttachmentModel attachmentModel = getById(id);
        AttachmentContentModel attachmentContent = attachmentModel.getAttachmentContent();
        response.setContentType(attachmentModel.getContentType());
        response.addHeader("Content-Disposition", "attachment; filename=\"" + attachmentModel.getOriginalFileName() + "\"");
        FileCopyUtils.copy(attachmentContent.getBytes(), response.getOutputStream());
    }

    private AttachmentModel save(AttachmentModel attachmentModel){
        Attachment savedAttachment = attachmentRepository.save(attachmentMapper.modelToEntity(attachmentModel));
        return attachmentMapper.entityToModel(savedAttachment);
    }

    private AttachmentModel getById(Long id){
        return attachmentMapper.entityToModel(attachmentRepository.findById(id).orElseThrow());
    }
}
