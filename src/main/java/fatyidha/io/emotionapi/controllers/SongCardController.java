package fatyidha.io.emotionapi.controllers;

import fatyidha.io.emotionapi.dtos.EmotionDTO;
import fatyidha.io.emotionapi.dtos.SongCardDTO;
import fatyidha.io.emotionapi.entities.SongCard;
import fatyidha.io.emotionapi.services.SongCardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emotion")
public class SongCardController {

    private final SongCardService songCardService;

    public SongCardController(SongCardService songCardService) {
        this.songCardService = songCardService;
    }

    @GetMapping("/get/songs")
    public ResponseEntity<List<SongCardDTO>> getSongs(@RequestBody EmotionDTO emotion) {
        return songCardService.getSongs(emotion);
    }

    @PostMapping("/add/song")
    public ResponseEntity<SongCard> addSong(@RequestBody SongCard songCard) {
        return songCardService.addSong(songCard);
    }
}
