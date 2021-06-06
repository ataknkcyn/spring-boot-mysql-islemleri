package springboot.crud.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@ToString
public class kitaplar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String kitap_ismi;

    @Column
    private String yazar;

    @Column
    private Timestamp eklenme_tarihi;
}
