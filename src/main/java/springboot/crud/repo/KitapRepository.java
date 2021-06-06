package springboot.crud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springboot.crud.model.kitaplar;

@Repository
public interface KitapRepository extends JpaRepository<kitaplar, Long> {

}
