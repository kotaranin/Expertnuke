package rs.expertnuke.service;

import java.util.List;
import java.util.stream.Collectors;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.expertnuke.model.Reactor;
import rs.expertnuke.model.Recommendation;

@Service
public class ExpertnukeService {

	@Autowired
	private KieContainer kieContainer;

	public List<Recommendation> getRecommendations(Reactor reactor) {
		KieSession ks = kieContainer.newKieSession();
		ks.insert(reactor);
		ks.fireAllRules();
		ks.dispose();
		return reactor.getRecommendations().stream()
				.collect(Collectors.groupingBy(Recommendation::getCode,
						Collectors.mapping(Recommendation::getExplanation, Collectors.joining(" "))))
				.entrySet().stream().map(rec -> new Recommendation(rec.getKey(), rec.getValue())).toList();
	}
}
