package br.com.antonylins.gestao_vagas.modules.company.entities.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.antonylins.gestao_vagas.exceptions.UserFoundException;
import br.com.antonylins.gestao_vagas.modules.company.entities.CompanyEntity;
import br.com.antonylins.gestao_vagas.modules.company.entities.repositories.CompanyRepository;

@Service
public class CreateCompanyUseCase {
    
    @Autowired
    private CompanyRepository companyRepository;

    public CompanyEntity execute(CompanyEntity companyEntitity) {

        this.companyRepository.findByUsernameOrEmail(companyEntitity.getUsername(), companyEntitity.getEmail())
        .ifPresent((user) -> {
            throw new UserFoundException();
        });

        return this.companyRepository.save(companyEntitity);
    }
}
