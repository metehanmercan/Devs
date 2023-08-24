package kodlama.io.Devs.business.abstracts;

import kodlama.io.Devs.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguage programmingLanguage) throws Exception;
    void upDate(ProgrammingLanguage programmingLanguage);
    void delete(int id);
}
