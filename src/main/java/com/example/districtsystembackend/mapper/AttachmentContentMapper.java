package com.example.districtsystembackend.mapper;

import com.example.districtsystembackend.entity.AttachmentContent;
import com.example.districtsystembackend.model.AttachmentContentModel;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AttachmentContentMapper extends GenericMapper<AttachmentContent, AttachmentContentModel> {
}
