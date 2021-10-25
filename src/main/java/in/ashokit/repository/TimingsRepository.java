package in.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Timings;

public interface TimingsRepository extends JpaRepository<Timings, Serializable>{

}
