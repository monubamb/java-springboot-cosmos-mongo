package com.sprint.repository.mongodb;
import com.sprint.model.*;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MongoAlbumRepository extends MongoRepository<Album, String> {
}