package fatyidha.io.emotionapi.mapper;

import fatyidha.io.emotionapi.dtos.SongCardDTO;
import fatyidha.io.emotionapi.entities.SongCard;

import java.util.List;
import java.util.stream.Collectors;

public class SongCardMapper {
    public static SongCardDTO toDTO(SongCard songCard) {
        return new SongCardDTO(
                songCard.getTitle(),
                songCard.getArtist(),
                songCard.getTrackUri()
        );
    }

    public static List<SongCardDTO> toDTOList(List<SongCard> songCards) {
        return songCards.stream()
                .map(SongCardMapper::toDTO)
                .collect(Collectors.toList());
    }
}
