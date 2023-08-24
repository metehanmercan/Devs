package kodlama.io.Devs.dataAccess.abstracts;

import kodlama.io.Devs.entities.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();
    ProgrammingLanguage getById(int id);
    void add(ProgrammingLanguage programmingLanguage);
    void upDate(ProgrammingLanguage programmingLanguage);
    void delete(int id);

}
