package by.gavrilik.MyAdsServer.repos;

import by.gavrilik.MyAdsServer.domain.Ads;
import org.springframework.data.repository.CrudRepository;

public interface AdsRepo extends CrudRepository<Ads,Long> {


}
