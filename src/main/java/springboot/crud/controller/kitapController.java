package springboot.crud.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import springboot.crud.model.kitaplar;
import springboot.crud.repo.KitapRepository;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class kitapController {

    private final KitapRepository kitapRepository;

    @GetMapping("/list")
    public List<kitaplar> kitapList() {
        return kitapRepository.findAll();
    }

    @GetMapping("/list/{id}")
    public Optional<kitaplar> id_kitap_getir(@PathVariable Long id) {
        return kitapRepository.findById(id);
    }

    @PostMapping("/ekle")
    public kitaplar kitapEkle(kitaplar ekle_kitap){
        return kitapRepository.save(ekle_kitap);
    }

    @PostMapping("/sil/{id}")
    public boolean kitapSil(@PathVariable Long id){
        kitapRepository.deleteById(id);
        return true;
    }

}
