package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {

    // JPQL : select m from Member m where m.name = ?
    // 메소드 이름을 가지고 그 규칙에 따라 JPQL문을 만들어서 실행

    @Override
    Optional<Member> findByName(String name);
}
