package akademia.dbStorage.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Builder
@Entity  //reprezentacja tabeli w bazie danych
@Table(name = "file") //nie jest wymagane, aby okreslac nazwe tabeli.
public class DbFile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "file_name", nullable = false, unique = true)
    private String fileName;

    @Column(name = "file_type")
    private String fileType;

   // @Column(name = "file_name") nie wymagane, gdyż nazwa kolumny taka sama jak zmiennej
    @Lob //tworzy typ kolumny jako przechowująca bajty. typ Blob
    private byte[] data;
}
