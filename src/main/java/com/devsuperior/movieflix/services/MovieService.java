package com.devsuperior.movieflix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.movieflix.dto.MovieCardDTO;
import com.devsuperior.movieflix.dto.MovieDetailsDTO;
import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;
@Service
public class MovieService {

	@Autowired
	private MovieRepository repository;

	
	@Transactional(readOnly = true)
	public MovieDetailsDTO findById(Long id) {
		Optional<Movie> obj = repository.searchById(id);
		Movie entity = obj.orElseThrow(()-> new  ResourceNotFoundException ("Resource not found"));
		return new MovieDetailsDTO(entity);

	}

	@Transactional(readOnly = true)
	public Page<MovieCardDTO> findByGenre(Long id, Pageable pageable) {
		Page<Movie> result = null;
		if(id != 0) {
			result = repository.findByGenreIdOrderByTitle(id, pageable);
		}
		else {
			result = repository.searchAll(pageable);
		}
		return result.map(x -> new MovieCardDTO(x));
	}
}
