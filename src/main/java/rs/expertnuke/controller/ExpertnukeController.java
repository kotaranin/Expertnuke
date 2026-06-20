package rs.expertnuke.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import rs.expertnuke.model.Reactor;
import rs.expertnuke.model.Recommendation;
import rs.expertnuke.service.ExpertnukeService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:5173")
public class ExpertnukeController {

	@Autowired
	private ExpertnukeService expertnukeService;

	@PostMapping("/analysis")
	public List<Recommendation> getRecommendations(@Valid @RequestBody Reactor reactor) {
		return expertnukeService.getRecommendations(reactor);
	}
}
