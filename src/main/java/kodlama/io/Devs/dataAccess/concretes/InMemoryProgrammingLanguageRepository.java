package kodlama.io.Devs.dataAccess.concretes;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
        programmingLanguages.add(new ProgrammingLanguage(2, "Java "));
        programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                return programmingLanguage;
            }
        }
        return null;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void upDate(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage currentprogrammingLanguage = getById(programmingLanguage.getId());
        if(currentprogrammingLanguage != null){
            currentprogrammingLanguage.setName(programmingLanguage.getName());
        }
    }

    @Override
    public void delete(int id) {
        ProgrammingLanguage toRemoveProgrammingLanguage = getById(id);
        if (toRemoveProgrammingLanguage != null) {
            programmingLanguages.remove(toRemoveProgrammingLanguage);
        }
    }
}
