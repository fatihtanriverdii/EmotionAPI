package fatyidha.io.emotionapi.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "songCards")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SongCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String artist;
    private String trackUri;
    private String emotion;
}
