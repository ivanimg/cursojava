package es.ivanblog.bdblog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.ivanblog.bdblog.model.Blog;

@Service
public interface BlogService {

	public List<Blog> getAllBlog();

	public Blog getBlogById(int id);

	public Blog savedBlog(Blog blog);

	public void removeBlog(Blog blog);

	public Blog updateBlog(Blog blog);
}
