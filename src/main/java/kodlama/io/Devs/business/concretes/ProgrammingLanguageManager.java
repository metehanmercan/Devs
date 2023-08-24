package kodlama.io.Devs.business.concretes;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        return programmingLanguageRepository.getById(id);
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) throws Exception {
        if (programmingLanguage.getName() == null) {
            throw new Exception("kurs bölümü boş olamaz");
        }
        for (ProgrammingLanguage currentProgrammmingLanguage : programmingLanguageRepository.getAll()) {
            if (currentProgrammmingLanguage.equals(programmingLanguage)) {
                throw new Exception("Bu kurs zaten var");
            }
        }
        programmingLanguageRepository.add(programmingLanguage);

    }

    @Override
    public void upDate(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.upDate(programmingLanguage);
    }

    @Override
    public void delete(int id) {
      programmingLanguageRepository.delete(id);
    }
}
