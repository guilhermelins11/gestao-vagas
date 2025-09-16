package br.com.antonylins.gestao_vagas.modules.company.entities.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.antonylins.gestao_vagas.modules.company.entities.CompanyEntity;
import java.util.Optional;


public interface CompanyRepository extends JpaRepository<CompanyEntity, UUID> {
    Optional<CompanyEntity>findByUsernameOrEmail(String username, String email);
}
