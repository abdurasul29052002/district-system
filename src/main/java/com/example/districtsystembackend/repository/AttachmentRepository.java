package com.example.districtsystembackend.repository;

import com.example.districtsystembackend.entity.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttachmentRepository extends JpaRepository<Attachment, Long> {
}
