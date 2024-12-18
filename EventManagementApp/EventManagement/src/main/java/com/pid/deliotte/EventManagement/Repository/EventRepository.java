package com.pid.deliotte.EventManagement.Repository;

import com.pid.deliotte.EventManagement.Entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    List<Event> findByCategoryName(String categoryName);
}
