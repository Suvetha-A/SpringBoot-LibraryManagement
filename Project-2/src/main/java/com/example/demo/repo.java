package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import jakarta.transaction.Transactional;


public interface repo extends JpaRepository<Library,Integer> {
	
	@Transactional
	@Modifying
	@Query(value = "Update library L set L.book_id = ?1 ,L.quantity=?2, L.book_name =?3 , L.genre = ?4   where L.book_id = ?5 ", nativeQuery = true)
	void update1(int bookId ,int quantity,String bookName,String genre,int bookid);
	
	@Modifying
	@Transactional 
	@Query(value = "DELETE FROM library WHERE book_id = ?1 ", nativeQuery = true)
	void deleteAllByIdInBatch(int bookid);
	
	@Query(value="SELECT * FROM library L where L.genre=?1",nativeQuery=true)
	List<Library> findbygenre(String genre);
	
	
}
