package shubh.SpringFrame.PetClinic.repositories;

import org.springframework.data.repository.CrudRepository;
import shubh.SpringFrame.PetClinic.model.Speciality;

public interface specialityRepository extends CrudRepository<Speciality, Long> {
}
