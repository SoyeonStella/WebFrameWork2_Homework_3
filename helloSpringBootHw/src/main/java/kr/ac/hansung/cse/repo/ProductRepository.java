package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.cse.model.Product;

// DAO가 아닌 Repository라고 한다. 
// 역할은 똑같음. 
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	// CrudRepository<Product, Long>라는 인터페이스를 상속 받음. 
	// 데이터에 대한 CRUD 메서드 코드를 자동 생성해줌  
	// 여기서 Long이란, Product model에서의 id이다.
	
	// category로 Product 레코드를 조회하는 메서드 추가 
	List<Product> findByCategory(String category);

}
