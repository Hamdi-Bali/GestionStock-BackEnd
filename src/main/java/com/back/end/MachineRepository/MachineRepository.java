package com.back.end.MachineRepository;

import com.back.end.model.Machine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MachineRepository extends JpaRepository<Machine, Integer> {

Machine findMachineById(int num );

}
