package com.portfolio.portfolio.service;

import com.portfolio.portfolio.entity.Experiencia;
import com.portfolio.portfolio.repository.IExperienciaRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ExperienciaService {
    @Autowired
    IExperienciaRepository rExperiencia;
    
    public List<Experiencia> List() {
        return rExperiencia.findAll();
    }
    
    public Optional<Experiencia> getOne(int id) {
        return rExperiencia.findById(id);
    }
    
    public Optional<Experiencia> getByNombreE(String nombreE) {
        return rExperiencia.findByNombreE(nombreE);
    }
    
    public void save(Experiencia exp) {
        rExperiencia.save(exp);
    }
    
    public void delete(int id) {
        rExperiencia.deleteById(id);
    }
    
    public boolean existsById(int id) {
        return rExperiencia.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE) {
        return rExperiencia.existsByNombreE(nombreE);
    }
}
