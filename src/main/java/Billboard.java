import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Billboard {
    private int id;
    private int imageUrl;
    private String name;
    private String genre;
}
