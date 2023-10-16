package com.maicoding.timelog.timeblock;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TimeBlockResource {

    private TimeBlockRepository timeBlockRepository;

    public TimeBlockResource(TimeBlockRepository timeBlockRepository) {
        this.timeBlockRepository = timeBlockRepository;
    }

    @GetMapping("/timeblock")
    public List<TimeBlock> retrieveTimeBlocks(){
        return timeBlockRepository.findAll();
    }

    @GetMapping("/timeblock/{blockId}")
    public TimeBlock retrieveTimeBlock(@PathVariable Long blockId){
        return timeBlockRepository.findById(blockId).orElseThrow(EntityNotFoundException::new);
    }

    @DeleteMapping("/timeblock/{blockId}")
    public ResponseEntity<Void> deleteTimeBlock(@PathVariable Long blockId){
        timeBlockRepository.deleteById(blockId);
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/timeblock")
    public TimeBlock createTimeBlock(@RequestBody TimeBlock block){
        return timeBlockRepository.save(block);
    }

    @PutMapping("/timeblock")
    public TimeBlock updateTimeBlock(@RequestBody TimeBlock block){
        return timeBlockRepository.save(block);
    }

}
