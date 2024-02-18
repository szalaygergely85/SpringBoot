package com.gamedevbackened.repository;

import com.gamedevbackened.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
