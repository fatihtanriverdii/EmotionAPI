package fatyidha.io.emotionapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@AllArgsConstructor
public class SongCardDTO {
    private String title;
    private String artist;
    private String trackUri;
}
