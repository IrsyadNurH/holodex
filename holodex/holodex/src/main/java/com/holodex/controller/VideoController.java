package com.holodex.controller;

import com.holodex.model.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class VideoController {

    @Autowired
    private com.holodex.service.VideoService videoService;

    @GetMapping("/videos") // Ubah path menjadi "/videos" sesuai dengan keinginan Anda
    public String getAllVideos(Model model) {
        List<Video> videos = videoService.getAllVideos(); // Memanggil metode untuk mendapatkan semua data video
        model.addAttribute("videos", videos); // Menambahkan daftar video ke model dengan nama "videos"
        return "video"; // Nama file HTML (video.html) yang akan digunakan untuk menampilkan data
    }
//    @RequestMapping("/")
//    public String video()
//    {
//        return "video.html";
//    }
}
