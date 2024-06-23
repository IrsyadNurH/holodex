package com.holodex.repository;

import com.holodex.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    // Tambahkan method kustom jika diperlukan
}
