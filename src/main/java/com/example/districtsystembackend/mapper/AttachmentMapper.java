package com.example.districtsystembackend.mapper;

import com.example.districtsystembackend.entity.Attachment;
import com.example.districtsystembackend.model.AttachmentModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AttachmentMapper extends GenericMapper<Attachment, AttachmentModel>{
}
