package in.votezy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.votezy.entity.Vote;

public interface VoteRepository extends JpaRepository<Vote,Long>{

}
