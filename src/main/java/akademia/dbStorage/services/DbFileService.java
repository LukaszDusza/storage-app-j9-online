package akademia.dbStorage.services;

import akademia.dbStorage.model.DbFile;
import org.springframework.stereotype.Service;
import akademia.dbStorage.repositories.DbFileRepository;

import java.util.List;

@Service
public class DbFileService {

    private DbFileRepository dbFileRepository;

    public DbFileService(DbFileRepository dbFileRepository) {
        this.dbFileRepository = dbFileRepository;
    }

    public List<DbFile> getFiles() {
        return dbFileRepository.findAll();
    }

}
