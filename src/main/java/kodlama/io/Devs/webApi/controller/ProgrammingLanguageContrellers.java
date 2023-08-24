package kodlama.io.Devs.webApi.controller;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.entities.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/ProgrammingLanguage")
public class ProgrammingLanguageContrellers {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguageContrellers(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }
    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }

    @DeleteMapping("/delete")
    public void delete(int id) {
        programmingLanguageService.delete(id);
    }
}
