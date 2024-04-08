package com.example.kortspill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class KortController {
    final
    KortRepository rep;

    public KortController(KortRepository rep) {
        this.rep = rep;
    }

    @PostMapping("/createKortstokk")
    public void createKortstokk(String kortstokk_id) {
        rep.createKortstokk(kortstokk_id);
    }

    @PostMapping("/insertKort")
    public void insertKort(String kortstokk_id, Kort kort) {
        rep.insertKort(kortstokk_id, kort);
    }

    @GetMapping("/getKortstokk")
    public List<Kortstokk> getKortstokk(String kortstokk_id) {
        return rep.getKortstokk(kortstokk_id);
    }
}
