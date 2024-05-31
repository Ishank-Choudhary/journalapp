package net.engineeringDigest.journalApp.controller;
import java.util.*;

import net.engineeringDigest.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries = new HashMap<>();
    @GetMapping
    public List<JournalEntry> getAll(){
        return new ArrayList<>(journalEntries.values());
    }
    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myentries){
        journalEntries.put(myentries.getId(),myentries);
        return true;
    }
    @GetMapping("/id/{myID}")
    public JournalEntry getJournalEntryByID(@PathVariable Long myID){
        return journalEntries.get(myID);
    }

    @DeleteMapping("/id/{myID}")
    public JournalEntry deteleEntry(@PathVariable Long myID){
        return journalEntries.remove(myID);
    }
    @PutMapping("/id/{myID}")
    public JournalEntry updateEntry(@PathVariable Long myID, @RequestBody JournalEntry myentries){
        return journalEntries.put(myID, myentries);
    }
}

