package dev.uday.caliber;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.security.Key;
import java.util.Dictionary;
import java.util.List;

@Document(collection = "workouts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Workout {

    @Id
    private ObjectId id;
    private String name;
    private String description;
    private int duration;
    private List<Dictionary<Key, Value>> exercises;

}
