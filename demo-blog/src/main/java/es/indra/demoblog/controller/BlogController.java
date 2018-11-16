package es.indra.demoblog.controller;

import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import es.indra.demoblog.aspects.annotations.MedidorDeTiempo;
import es.indra.demoblog.model.Blog;
import es.indra.demoblog.service.BlogService;

//@RestController
@Aspect
@Configuration
public class BlogController {

	@Autowired
	BlogService blogService;

	@RequestMapping(value = "/blog", method = RequestMethod.GET)
	public ResponseEntity<List<Blog>> getAllBlogs() {
		List<Blog> todosLosBlogs = this.blogService.getAllBlog();

		ResponseEntity<List<Blog>> response = new ResponseEntity<List<Blog>>(todosLosBlogs, HttpStatus.OK);

		return response;
	}

	@RequestMapping(value = "/blog/{id}", method = RequestMethod.GET)
	public ResponseEntity<Blog> getById(@PathVariable("id") int id) {
		Blog b = this.blogService.getBlogById(id);
		if (b == null) {
			return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Blog>(b, HttpStatus.OK);
		}
	}

	@MedidorDeTiempo
	@RequestMapping(value = "/blog/new", method = RequestMethod.POST)
	public ResponseEntity<Blog> crearBlog(@RequestBody Blog b) {

		Blog blog = this.blogService.savedBlog(b);
		System.out.println("post");

		return new ResponseEntity<Blog>(blog, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/blog/update", method = RequestMethod.PUT)
	public ResponseEntity<Blog> updateBlog(@RequestBody Blog b) {
		if (b.getId() == 1) {
			Blog blog = this.blogService.updateBlog(b);
			return new ResponseEntity<Blog>(HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Blog>(HttpStatus.NOT_FOUND);
		}
	}

	@RequestMapping(value = "/blog/delete", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteBlog(@RequestBody Blog b) {
		if (b.getId() == 1) {
			this.blogService.removeBlog(b);
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);// bad request
		}

	}
}
