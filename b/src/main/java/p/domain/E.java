package p.domain;

import java.util.*;
import lombok.*;
import p.domain.*;
import p.infra.AbstractEvent;

@Data
@ToString
public class E extends AbstractEvent {

    private Long id;

    public E(A aggregate) {
        super(aggregate);
    }

    public E() {
        super();
    }
}
