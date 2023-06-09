package domain;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
public class BoardDTO {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String EMP_NO;		// 사원번호
	private String EMP_NM;		// 사원이름
	private String EML;			// 이메일
	private String TELNO;		// 전화번호
	private String ADDRESS;		// 주소
	private String APRV; 		// 승인여부
	private String DEPT_ID;		// 부서번호
	private String DEPT;		// 부서명
	private String HBY_ID;		// 취미번호
	private String HBY;			// 취미명
	
}
