package com.example.kortspill;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KortRepository {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public KortRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createKortstokk(String kortstokk_id) {
        String sql = "CREATE TABLE IF NOT EXISTS " + kortstokk_id + " (type varchar(255), nummer int)";
        jdbcTemplate.update(sql);
        System.out.println("del 3 complete");
    }

    public void insertKort(String kortstokk_id, Kort kort) {
        String sql = "INSERT INTO " + kortstokk_id + " (type, nummer) VALUES (?, ?)";
        jdbcTemplate.update(sql, kort.getType(), kort.getNummer());
    }

    public List<Kortstokk> getKortstokk(String kortstokk_id) {
        String sql = "SELECT * FROM " + kortstokk_id;
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Kortstokk.class));
    }

}