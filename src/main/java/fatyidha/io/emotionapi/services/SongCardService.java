package fatyidha.io.emotionapi.services;

import fatyidha.io.emotionapi.dtos.EmotionDTO;
import fatyidha.io.emotionapi.dtos.SongCardDTO;
import fatyidha.io.emotionapi.entities.SongCard;
import fatyidha.io.emotionapi.mapper.SongCardMapper;
import fatyidha.io.emotionapi.repositories.SongCardRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SongCardService {

    private final SongCardRepository songCardRepository;

    public SongCardService(SongCardRepository songCardRepository) {
        this.songCardRepository = songCardRepository;
    }

    public ResponseEntity<List<SongCardDTO>> getSongs(EmotionDTO emotion) {
        try{
            List<SongCard> songCards = songCardRepository.findByEmotion(emotion.getEmotion());
            return ResponseEntity.ok(SongCardMapper.toDTOList(songCards));
        }catch (Exception e){
            return ResponseEntity.status(404).body(null);
        }
    }

    public ResponseEntity<SongCard> addSong(SongCard songCard) {
        try{
            return ResponseEntity.ok(songCardRepository.save(songCard));
        }catch (Exception e){
            return ResponseEntity.status(404).body(null);
        }
    }
}
