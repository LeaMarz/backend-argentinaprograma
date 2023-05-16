
package com.portfolio.yoProgramo.service;

import com.portfolio.yoProgramo.entity.Experiencia;
import com.portfolio.yoProgramo.repository.ExperienciaRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional//persistencia en base de datos
public class ExperienciaService {
    
    @Autowired
     ExperienciaRepository experienciaRepository;
    
    public List<Experiencia> list(){
        return experienciaRepository.findAll();
    }
    
    public Experiencia getOne(int id){
        Experiencia experiencia = experienciaRepository.findById(id).orElse(null);
        return experiencia;
    }
       
    
    public void save(Experiencia experiencia){
        experienciaRepository.save(experiencia);
    }
    
     public void delete(int id){
        experienciaRepository.deleteById(id);
    }
    
    public void edit(Experiencia experiencia){
        experienciaRepository.save(experiencia);
    }
    
    //busca lista de relojes por la id de la persona
    public List<Experiencia> findByPersonaId(Long personaId) {
        return experienciaRepository.findByPersonaId(personaId);
    }
    public boolean existsById(int id){
         return experienciaRepository.existsById(id);
     }
     
     

    
}
