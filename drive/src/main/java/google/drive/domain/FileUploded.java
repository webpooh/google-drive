package google.drive.domain;

import google.drive.domain.*;
import google.drive.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class FileUploded extends AbstractEvent {

    private Long id;
    private String name;
    private String type;
    private Long size;

    public FileUploded(File aggregate){
        super(aggregate);
    }
    public FileUploded(){
        super();
    }
}
