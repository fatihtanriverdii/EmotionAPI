package fatyidha.io.emotionapi.repositories;

import fatyidha.io.emotionapi.entities.SongCard;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SongCardRepository extends JpaRepository<SongCard, Long> {
    List<SongCard> findByEmotion(String emotion);
}