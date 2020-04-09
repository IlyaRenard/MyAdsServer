package by.gavrilik.MyAdsServer;

import by.gavrilik.MyAdsServer.domain.Ads;
import by.gavrilik.MyAdsServer.repos.AdsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    private final AdsRepo adsRepo;

    @Autowired
    public GreetingController(AdsRepo adsRepo) {
        this.adsRepo = adsRepo;
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name,  Map<String, Object> model) {
        model.put("name", name);
        return "greeting";
    }

    @GetMapping
    public String main( Map<String, Object> model){
        Iterable<Ads> adsRepo = this.adsRepo.findAll();

        model.put("adsList",adsRepo);
        return "main";
    }

    @PostMapping
    public String add(@RequestParam String description, @RequestParam String rating, Map<String, Object> model) {

        Ads ads = new Ads(description, rating);

        adsRepo.save(ads);

        Iterable<Ads> adsRepo = this.adsRepo.findAll();

        model.put("adsList", adsRepo);

        return "main";
    }
}
