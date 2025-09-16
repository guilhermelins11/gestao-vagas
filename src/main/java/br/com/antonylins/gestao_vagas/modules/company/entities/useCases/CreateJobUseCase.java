package br.com.antonylins.gestao_vagas.modules.company.entities.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.antonylins.gestao_vagas.modules.company.entities.JobEntity;
import br.com.antonylins.gestao_vagas.modules.company.entities.repositories.JobRepository;

@Service
public class CreateJobUseCase {
    
    @Autowired
    private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity) {
        return this.jobRepository.save(jobEntity);
    }
}
