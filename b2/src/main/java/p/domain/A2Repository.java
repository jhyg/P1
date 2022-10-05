package p.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import p.domain.*;

@RepositoryRestResource(collectionResourceRel = "a2s", path = "a2s")
public interface A2Repository extends PagingAndSortingRepository<A2, Long> {}
